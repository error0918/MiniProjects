package com.taeyeon.wowphonenumber.data

import androidx.compose.runtime.Composable
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.ui.content.BigSliderContent
import com.taeyeon.wowphonenumber.ui.content.NormalContent
import com.taeyeon.wowphonenumber.ui.content.RandomContent
import com.taeyeon.wowphonenumber.ui.content.SmallSliderContent

enum class Screen(
    val title: String,
    val content: @Composable (mainViewModel: MainViewModel) -> Unit = {  }
) {
    Normal(
        title = "Normal",
        content = { mainViewModel ->
            NormalContent(mainViewModel = mainViewModel)
        }
    ),
    Random(
        title = "Random",
        content = { mainViewModel ->
            RandomContent(mainViewModel = mainViewModel)
        }
    ),
    BigSlider(
        title = "BigSlider",
        content = { mainViewModel ->
            BigSliderContent(mainViewModel = mainViewModel)
        }
    ),
    SmallSlider(
        title = "SmallSlider",
        content = { mainViewModel ->
            SmallSliderContent(mainViewModel = mainViewModel)
        }
    )
}