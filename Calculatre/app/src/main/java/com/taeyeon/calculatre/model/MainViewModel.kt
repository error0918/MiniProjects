package com.taeyeon.calculatre.model

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel(
    val context: Context
): ViewModel() {
    var calc by mutableStateOf("")
        private set

    fun addToCalc(string: String) {
        calc += string
    }
}