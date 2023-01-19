@file:OptIn(
    ExperimentalPagerApi::class
)
@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package com.taeyeon.wowphonenumber.model

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.taeyeon.wowphonenumber.R

enum class Screen {
    Main, A, B, C, D
}

class MainViewModel(context: Context): ViewModel() {
    val pagerState @Composable get() = rememberPagerState()

    var title by mutableStateOf(context.getString(R.string.app_name))
}