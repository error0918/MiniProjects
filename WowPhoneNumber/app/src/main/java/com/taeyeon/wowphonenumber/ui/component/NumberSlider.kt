@file:OptIn(ExperimentalPagerApi::class)

package com.taeyeon.wowphonenumber.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
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
    value: Int,
    onValueChanged: (value: Int) -> Unit,
    modifier: Modifier = Modifier,
    numberSize: Dp = 20.dp
) {
    val pagerState = rememberPagerState(initialPage = 0)
    val hapticFeedback = LocalHapticFeedback.current

    var init by rememberSaveable { mutableStateOf(false) }

    LaunchedEffect(value) {
        if (value != pagerState.currentPage) {
            pagerState.scrollToPage(value)
        }
    }

    LaunchedEffect(pagerState.currentPage) {
        if (value != pagerState.currentPage) {
            if (init) {
                hapticFeedback.performHapticFeedback(HapticFeedbackType.LongPress)
                onValueChanged(pagerState.currentPage)
            } else {
                init = true
            }
        }
    }

    Surface(
        modifier = modifier
            .width(numberSize)
            .height(numberSize * 20f),
        shape = RoundedCornerShape(percent = 10)
    ) {
        VerticalPager(
            count = 10,
            state = pagerState,
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(vertical = numberSize * 9.5f),
            modifier = Modifier.fillMaxWidth()
        ) { page ->
            Box(
                modifier = Modifier
                    .size(numberSize)
                    .background(
                        color = if (page == pagerState.currentPage) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.primaryContainer.copy(
                            alpha = 0.5f
                        ),
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
                    color = if (page == pagerState.currentPage) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.5f),
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    }
}