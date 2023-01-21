package com.taeyeon.wowphonenumber.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.taeyeon.wowphonenumber.model.MainViewModel

@Composable
fun MainContent(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    //
    Text(text = "aaa")
}