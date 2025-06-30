@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.iconviewer.util

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarState
import kotlinx.coroutines.delay

suspend fun TopAppBarState.open(
    step: Long = 5,
    time: Long = 30
) {
    val append = - heightOffset / step
    repeat(step.toInt()) {
        heightOffset += append
        delay(time / step)
    }
}

suspend fun TopAppBarState.collapse(
    step: Long = 5,
    time: Long = 30
) {
    val append = (heightOffsetLimit - heightOffset) / step
    repeat(step.toInt()) {
        heightOffset += append
        delay(time / step)
    }
}