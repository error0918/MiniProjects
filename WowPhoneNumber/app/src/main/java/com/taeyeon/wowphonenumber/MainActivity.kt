package com.taeyeon.wowphonenumber

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.theme.WowPhoneNumberTheme
import com.taeyeon.wowphonenumber.ui.MainContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WowPhoneNumberTheme {
                MainContent(mainViewModel = MainViewModel())
            }
        }
    }
}