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
import com.google.accompanist.pager.PagerState
import com.taeyeon.wowphonenumber.R

enum class Screen(
    val title: String,
    val content: @Composable () -> Unit = {  }
) {
    Main(
        title = "Main",
        content = {}
    ),
    Normal(
        title = "Normal",
        content = {}
    ),
    Random(
        title = "Random",
        content = {}
    ),
    BigSlider(
        title = "BigSlider",
        content = {}
    ),
    SmallSlider(
        title = "SmallSlider",
        content = {}
    )
}

class MainViewModel(context: Context): ViewModel() {
    val pagerState = PagerState()
    var title by mutableStateOf(context.getString(R.string.app_name))
}