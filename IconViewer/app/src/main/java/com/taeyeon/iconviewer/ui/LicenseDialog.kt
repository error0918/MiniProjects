package com.taeyeon.iconviewer.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import com.taeyeon.iconviewer.IconViewerViewModel
import com.taeyeon.iconviewer.R
import com.taeyeon.iconviewer.data.License
import com.taeyeon.iconviewer.rememberIconViewerState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LicenseDialog(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    if (viewModel.isLicenseShowing) {
        val context = LocalContext.current
        val licenseList = remember { License.getLicenseList(context) }

        AlertDialog(
            onDismissRequest = { viewModel.isLicenseShowing = false },
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 16.dp),
            title = { Text(text = stringResource(id = R.string.license_dialog_title)) },
            text = {
                // TODO
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.surfaceColorAtElevation(elevation = 15.dp),
                    contentColor = LocalContentColor.current,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                        verticalArrangement = Arrangement.spacedBy(space = 4.dp)
                    ) {
                        items(licenseList) { license ->
                            Surface(
                                modifier = Modifier.fillMaxWidth(),
                                color = Color.Transparent,
                                contentColor = LocalContentColor.current,
                                shape = RoundedCornerShape(4.dp),
                                onClick = {}
                            ) {
                                Text(
                                    text = license.title
                                )
                            }
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(
                    onClick = { viewModel.isLicenseShowing = false }
                ) {
                    Text(text = stringResource(id = R.string.license_dialog_dismiss))
                }
            },
            properties = DialogProperties(
                dismissOnBackPress = true,
                dismissOnClickOutside = false
            )
        )
    }
}