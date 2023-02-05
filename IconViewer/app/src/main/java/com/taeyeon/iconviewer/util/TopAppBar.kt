@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.iconviewer.util

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarState
import kotlinx.coroutines.delay

suspend fun TopAppBarState.open(
    step: Int = 10,
    time: Long = 50
) {
    val append = - heightOffset / step
    repeat(10) {
        heightOffset += append
        delay(time / step)
    }
}

suspend fun TopAppBarState.collapse(
    step: Int = 10,
    time: Long = 50
) {
    val append = (heightOffsetLimit - heightOffset) / step
    repeat(10) {
        heightOffset += append
        delay(time / step)
    }
}