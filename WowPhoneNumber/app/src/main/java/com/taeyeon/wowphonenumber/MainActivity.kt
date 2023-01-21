package com.taeyeon.wowphonenumber

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.theme.WowPhoneNumberTheme
import com.taeyeon.wowphonenumber.ui.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WowPhoneNumberTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen(mainViewModel = MainViewModel(this))
                }
            }
        }
    }
}