package com.taeyeon.wowphonenumber.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.taeyeon.wowphonenumber.model.MainViewModel

@Composable
fun LicenseDialog(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current).apply {
        isLicenseDialog = true
    }
) {
}