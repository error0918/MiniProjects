@file:OptIn(ExperimentalFoundationApi::class)

package com.taeyeon.wowphonenumber.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.taeyeon.wowphonenumber.R
import com.taeyeon.wowphonenumber.data.License
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.util.readRaw

@Composable
fun LicenseDialog(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current).apply {
        isLicenseDialog = true
    }
) {
    val context = LocalContext.current
    val licenseList = remember { mutableStateListOf<License>() }

    LaunchedEffect(true) {
        val rawTitles = context.readRaw(R.raw.third_party_license_metadata)
        val rawLicenses = context.readRaw(R.raw.third_party_licenses)

        rawTitles.split("\n").forEach { rawTitle ->
            if (rawTitle.isNotEmpty()) {
                val license = rawLicenses
                    .substring(rawTitle.split(" ").let { it[0].split(":").run { get(0).toInt() until (get(0).toInt() + get(1).toInt()) } })
                    .trim()
                    .let {
                        if ((it.startsWith("http://") || it.startsWith("https://")) && it.indexOf(".") != -1 && it.indexOf("\n") == -1) {
                            when (it) {
                                "http://www.apache.org/licenses/LICENSE-2.0.txt", "https://www.apache.org/licenses/LICENSE-2.0.txt" -> License.APACHE_LICENSE_2_0
                                "http://www.eclipse.org/legal/epl-v10.html" -> License.ECLIPSE_PUBLIC_LICENSE_1_0
                                else -> null
                            } to it
                        } else{
                            it to null
                        }
                    }

                licenseList.add(
                    License(
                        title = rawTitle.split(" ")[1],
                        license = license.first,
                        link = license.second
                    )
                )
            }
        }

        licenseList.sortBy { it.title }
    }

    Dialog(
        onDismissRequest = { mainViewModel.isLicenseDialog = false }
    ) {
        Surface(
            color = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
            tonalElevation = 6.dp,
            shape = RoundedCornerShape(28.dp),
            modifier = Modifier
                .widthIn(
                    min = 280.dp,
                    max = 560.dp
                )
        ) {
            Column(
                modifier = Modifier.padding(28.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.info_dialog_open_source_license),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.headlineSmall
                )

                Spacer(modifier = Modifier.height(16.dp))

                Divider(
                    modifier = Modifier.fillMaxWidth()
                )

                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    // TODO
                    stickyHeader {
                        //
                    }
                    items(licenseList) {
                        Text(text = it.title)
                        Text(text = it.license!!)
                    }
                }

                Divider(
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(24.dp))

                TextButton(
                    onClick = { mainViewModel.isLicenseDialog = false },
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text(text = stringResource(id = R.string.license_dialog_close))
                }
            }
        }
    }
}