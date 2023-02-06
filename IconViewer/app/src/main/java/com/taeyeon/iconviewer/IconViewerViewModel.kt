@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.iconviewer

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.taeyeon.iconviewer.data.IconType

class IconViewerViewModel(
    val state: IconViewerState
) : ViewModel() {
    var isSearching by mutableStateOf(false)
    var libraryIndex by mutableStateOf(0)
    var iconType by mutableStateOf(IconType.Filled)
}