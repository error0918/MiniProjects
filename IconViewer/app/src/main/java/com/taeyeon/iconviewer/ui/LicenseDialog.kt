package com.taeyeon.iconviewer.ui

import androidx.compose.runtime.Composable
import com.taeyeon.iconviewer.IconViewerViewModel
import com.taeyeon.iconviewer.rememberIconViewerState

@Composable
fun LicenseDialog(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {}