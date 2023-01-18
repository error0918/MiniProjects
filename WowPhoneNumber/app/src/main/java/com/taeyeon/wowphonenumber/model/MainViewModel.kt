package com.taeyeon.wowphonenumber.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

enum class Screen {
    Main
}

class MainViewModel: ViewModel() {
    var screen by mutableStateOf(Screen.Main)
}