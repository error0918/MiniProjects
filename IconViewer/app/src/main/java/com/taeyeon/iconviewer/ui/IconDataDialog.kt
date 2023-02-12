package com.taeyeon.iconviewer.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import com.taeyeon.iconviewer.IconViewerViewModel
import com.taeyeon.iconviewer.rememberIconViewerState

@Composable
fun IconDataDialog(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    if (viewModel.focusedIconData != null) {
        AlertDialog(
            onDismissRequest = { viewModel.focusedIconData = null },
            title = { Text(text = "아이콘 정보: " + viewModel.focusedIconData?.name) },
            text = {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(4.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                    }
                }
            },
            confirmButton = {
                TextButton(
                    onClick = { viewModel.focusedIconData = null }
                ) {
                    Text(text = "닫기")
                }
            },
            properties = DialogProperties(
                dismissOnBackPress = true,
                dismissOnClickOutside = true
            )
        )
    }
}