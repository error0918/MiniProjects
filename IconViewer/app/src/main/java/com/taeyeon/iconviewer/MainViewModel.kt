@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.iconviewer

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.taeyeon.iconviewer.data.IconType

class IconViewerViewModel : ViewModel() {
    val state @Composable get() = rememberIconViewerState()
    val scope @Composable get() = List(5) { rememberCoroutineScope() }

    var isSearching by mutableStateOf(false)
    var libraryIndex by mutableStateOf(0)
    var iconType by mutableStateOf(IconType.Filled)
}