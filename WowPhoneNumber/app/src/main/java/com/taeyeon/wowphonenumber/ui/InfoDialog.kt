package com.taeyeon.wowphonenumber.ui

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.window.Dialog
import com.taeyeon.wowphonenumber.model.MainViewModel

@Composable
fun InfoDialog(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    Dialog(
        onDismissRequest = { mainViewModel.isInfoDialog = false }
    ) {
        Surface(
            // TODO
        ) {
            // TODO
        }
    }
}