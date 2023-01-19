package com.taeyeon.wowphonenumber.data

import androidx.compose.runtime.Composable
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.ui.BigSliderContent
import com.taeyeon.wowphonenumber.ui.MainContent
import com.taeyeon.wowphonenumber.ui.NormalContent
import com.taeyeon.wowphonenumber.ui.RandomContent
import com.taeyeon.wowphonenumber.ui.SmallSliderContent

enum class Screen(
    val title: String,
    val content: @Composable (mainViewModel: MainViewModel) -> Unit = {  }
) {
    Main(
        title = "Main",
        content = { mainViewModel ->
            MainContent(mainViewModel = mainViewModel)
        }
    ),
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