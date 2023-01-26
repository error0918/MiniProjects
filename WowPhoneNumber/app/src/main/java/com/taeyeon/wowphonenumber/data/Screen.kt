package com.taeyeon.wowphonenumber.data

import androidx.compose.runtime.Composable
import com.taeyeon.wowphonenumber.R
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.ui.content.BigSliderContent
import com.taeyeon.wowphonenumber.ui.content.NormalContent
import com.taeyeon.wowphonenumber.ui.content.RandomContent
import com.taeyeon.wowphonenumber.ui.content.SmallSliderContent

enum class Screen(
    val titleId: Int,
    val content: @Composable (mainViewModel: MainViewModel) -> Unit = {  }
) {
    Normal(
        titleId = R.string.screen_normal,
        content = { mainViewModel ->
            NormalContent(mainViewModel = mainViewModel)
        }
    ),
    Random(
        titleId = R.string.screen_random,
        content = { mainViewModel ->
            RandomContent(mainViewModel = mainViewModel)
        }
    ),
    SmallSlider(
        titleId = R.string.screen_small_slider,
        content = { mainViewModel ->
            SmallSliderContent(mainViewModel = mainViewModel)
        }
    ),
    BigSlider(
        titleId = R.string.screen_big_slider,
        content = { mainViewModel ->
            BigSliderContent(mainViewModel = mainViewModel)
        }
    )
}