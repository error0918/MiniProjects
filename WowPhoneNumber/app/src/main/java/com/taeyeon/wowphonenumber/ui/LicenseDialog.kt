@file:OptIn(
    ExperimentalFoundationApi::class,
    ExperimentalMaterial3Api::class
)

package com.taeyeon.wowphonenumber.ui

import android.content.Intent
import android.net.Uri
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
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
    val hapticFeedback = LocalHapticFeedback.current
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
                        title = rawTitle.split(" ")[1].trim(),
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

                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(MaterialTheme.colorScheme.onSurface)
                )

                val isExpanded = remember { mutableStateListOf<Boolean>() }

                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    licenseList.forEachIndexed { index, license ->
                        if (isExpanded.size <= index + 1) isExpanded.addAll(List(licenseList.size - index - 1) { false })
                        stickyHeader {
                            Surface(
                                modifier = Modifier.fillMaxWidth(),
                                color = MaterialTheme.colorScheme.surface,
                                contentColor = MaterialTheme.colorScheme.onSurface,
                                shape = RectangleShape,
                                onClick = { isExpanded[index] = !isExpanded[index] }
                            ) {
                                Column(
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(0.5f.dp)
                                            .background(MaterialTheme.colorScheme.onSurface)
                                    )
                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(48.dp)
                                            .padding(horizontal = 4.dp)
                                    ) {
                                        val size = LocalDensity.current.run {
                                            MaterialTheme.typography.labelSmall.fontSize.toDp() +
                                                    ButtonDefaults.TextButtonContentPadding.calculateTopPadding() +
                                                    ButtonDefaults.TextButtonContentPadding.calculateBottomPadding()
                                        }
                                        Text(
                                            text = license.title,
                                            style = MaterialTheme.typography.labelSmall,
                                            overflow = TextOverflow.Visible,
                                            modifier = Modifier
                                                .align(Alignment.CenterStart)
                                                .padding(end = size + 4.dp)
                                        )
                                        Icon(
                                            imageVector = if (isExpanded[index]) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                                            contentDescription = if (isExpanded[index]) stringResource(id = R.string.license_dialog_close_license) else stringResource(id = R.string.license_dialog_open_license),
                                            modifier = Modifier
                                                .size(size)
                                                .align(Alignment.CenterEnd)
                                        )
                                    }
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(0.5f.dp)
                                            .background(MaterialTheme.colorScheme.onSurface)
                                    )
                                }
                            }
                        }
                        item {
                            AnimatedVisibility(
                                visible = isExpanded[index],
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .align(Alignment.CenterHorizontally)
                            ) {
                                Surface(
                                    color = MaterialTheme.colorScheme.surface,
                                    contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                                    tonalElevation = 9.dp,
                                    shape = RoundedCornerShape(8.dp),
                                    modifier = Modifier.padding(8.dp)
                                ) {
                                    if (license.license != null || license.link != null) {
                                        Column(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(4.dp),
                                            verticalArrangement = Arrangement.spacedBy(8.dp)
                                        ) {
                                            if (license.license == null) {
                                                Text(
                                                    text = stringResource(id = R.string.license_dialog_preview_not_provide_message),
                                                    textAlign = TextAlign.Center,
                                                    style = MaterialTheme.typography.labelSmall,
                                                    modifier = Modifier.fillMaxWidth()
                                                )
                                            } else {
                                                SelectionContainer {
                                                    Text(
                                                        text = license.license,
                                                        style = MaterialTheme.typography.labelSmall.copy(
                                                            fontSize = MaterialTheme.typography.labelSmall.fontSize * 0.6f,
                                                            fontWeight = FontWeight.Light,
                                                            lineHeight = MaterialTheme.typography.labelSmall.lineHeight * 0.6f,
                                                        )
                                                    )
                                                }
                                            }
                                            license.link?.let {
                                                Surface(
                                                    color = MaterialTheme.colorScheme.primary,
                                                    contentColor = MaterialTheme.colorScheme.onPrimary,
                                                    shape = CircleShape,
                                                    onClick = {
                                                        hapticFeedback.performHapticFeedback(HapticFeedbackType.LongPress)
                                                        context.startActivity(
                                                            Intent(
                                                                Intent.ACTION_VIEW,
                                                                Uri.parse(license.link)
                                                            )
                                                        )
                                                    },
                                                    modifier = Modifier
                                                        .fillMaxWidth()
                                                        .height(24.dp)
                                                ) {
                                                    Row(
                                                        modifier = Modifier.fillMaxWidth(),
                                                        horizontalArrangement = Arrangement
                                                            .spacedBy(
                                                                space = 4.dp,
                                                                alignment = Alignment.CenterHorizontally
                                                            ),
                                                        verticalAlignment = Alignment.CenterVertically
                                                    ) {
                                                        Icon(
                                                            imageVector = Icons.Rounded.PlayArrow,
                                                            contentDescription = stringResource(id = R.string.license_dialog_view_full),
                                                            modifier = Modifier.size(12.dp)
                                                        )
                                                        Text(
                                                            text = stringResource(id = R.string.license_dialog_view_full),
                                                            fontSize = LocalDensity.current.run { 12.dp.toSp() }
                                                        )
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        Text(
                                            text = stringResource(id = R.string.license_dialog_preview_fail_to_road),
                                            textAlign = TextAlign.Center,
                                            style = MaterialTheme.typography.labelSmall,
                                            modifier = Modifier.fillMaxWidth()
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(MaterialTheme.colorScheme.onSurface)
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