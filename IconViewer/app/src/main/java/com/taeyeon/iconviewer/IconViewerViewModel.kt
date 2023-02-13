package com.taeyeon.iconviewer

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.taeyeon.iconviewer.data.IconData
import com.taeyeon.iconviewer.data.IconType

class IconViewerViewModel(
    val state: IconViewerState
) : ViewModel() {
    var isSearching by mutableStateOf(false)
    var isDropDownMenuShowing by mutableStateOf(false)
    var isInfoShowing by mutableStateOf(false)
    var isScrollControllerShowing by mutableStateOf(false)

    var libraryIndex by mutableStateOf(0)
    var iconType by mutableStateOf(IconType.Filled)
    var searchKeyword by mutableStateOf("")

    var focusedIconData by mutableStateOf<IconData?>(null)
}