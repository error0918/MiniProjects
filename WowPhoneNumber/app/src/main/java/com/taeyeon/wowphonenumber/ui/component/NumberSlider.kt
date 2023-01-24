@file:OptIn(ExperimentalPagerApi::class)

package com.taeyeon.wowphonenumber.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.VerticalPager
import com.google.accompanist.pager.rememberPagerState

@Composable
fun NumberSlider(
    onValueChanged: (value: Int) -> Unit,
    modifier: Modifier = Modifier,
    numberSize: Dp = 30.dp
) {
    val pagerState = rememberPagerState()
    val hapticFeedback = LocalHapticFeedback.current

    LaunchedEffect(pagerState.currentPage) {
        hapticFeedback.performHapticFeedback(HapticFeedbackType.LongPress)
        onValueChanged(pagerState.currentPage)
    }

    Surface(
        modifier = modifier
            .width(numberSize)
            .height(numberSize * 10f),
        shape = RoundedCornerShape(percent = 10)
    ) {
        VerticalPager(
            count = 10,
            state = pagerState,
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(vertical = numberSize * 4.5f),
            modifier = Modifier.fillMaxWidth()
        ) { page ->
            Box(
                modifier = Modifier
                    .size(numberSize)
                    .background(
                        color = if (page == pagerState.currentPage) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.primaryContainer,
                        shape = RoundedCornerShape(
                            topStartPercent = if (page == 0) 10 else 0,
                            topEndPercent = if (page == 0) 10 else 0,
                            bottomStartPercent = if (page == 9) 10 else 0,
                            bottomEndPercent = if (page == 9) 10 else 0
                        )
                    )
            ) {
                Text(
                    text = "$page",
                    color = if (page == pagerState.currentPage) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onPrimaryContainer,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    }
}