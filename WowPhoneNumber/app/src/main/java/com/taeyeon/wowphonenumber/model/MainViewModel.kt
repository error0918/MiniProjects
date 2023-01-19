@file:OptIn(
    ExperimentalPagerApi::class
)
@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package com.taeyeon.wowphonenumber.model

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

enum class Screen {
    Main, A, B, C, D
}

class MainViewModel: ViewModel() {
    val pagerState @Composable get() = rememberPagerState()
}