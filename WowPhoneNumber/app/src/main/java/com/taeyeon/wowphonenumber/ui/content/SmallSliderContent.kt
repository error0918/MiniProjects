package com.taeyeon.wowphonenumber.ui.content

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.ui.component.NumberSlider

@Composable
fun SmallSliderContent(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.align(Alignment.Center),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            for (blockIndex in mainViewModel.phoneNumber.indices) {
                for (numberIndex in mainViewModel.phoneNumber[blockIndex].indices) {
                    NumberSlider(
                        value = (mainViewModel.phoneNumber[blockIndex][numberIndex] ?: '0').digitToInt(),
                        onValueChanged = { mainViewModel.phoneNumber[blockIndex][numberIndex] = "$it"[0] },
                        numberSize = 25.dp
                    )
                }
                if (blockIndex != mainViewModel.phoneNumber.size - 1) {
                    Box(
                        modifier = Modifier
                            .size(
                                width = 16.dp,
                                height = 2.5.dp
                            )
                            .background(
                                color = MaterialTheme.colorScheme.primary,
                                shape = CircleShape
                            )
                    )
                }
            }
        }
    }
}