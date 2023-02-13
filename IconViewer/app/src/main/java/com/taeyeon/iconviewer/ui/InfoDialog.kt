package com.taeyeon.iconviewer.ui

import androidx.compose.material3.AlertDialog
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.DialogProperties
import com.taeyeon.iconviewer.IconViewerViewModel
import com.taeyeon.iconviewer.rememberIconViewerState

@Composable
fun InfoDialog(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    if (viewModel.isInfoShowing) {
        AlertDialog(
            onDismissRequest = { viewModel.isInfoShowing = false },
            icon = {},
            title = {},
            text = {},
            dismissButton = {},
            confirmButton = { /*TODO*/ },
            properties = DialogProperties(
                dismissOnBackPress = true,
                dismissOnClickOutside = false
            )
        )
    }
}