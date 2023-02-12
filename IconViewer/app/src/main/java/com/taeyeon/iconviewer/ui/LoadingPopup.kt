@file:OptIn(ExperimentalAnimationApi::class)

package com.taeyeon.iconviewer.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import kotlinx.coroutines.delay

@Composable
fun LoadingPopup(
    visible: Boolean
) {
    var popupShowing by rememberSaveable { mutableStateOf(false) }
    var viewShowing by rememberSaveable { mutableStateOf(false) }

    LaunchedEffect(visible) {
        if (visible) {
            popupShowing = true
            delay(10)
            viewShowing = true
        } else {
            viewShowing = false
            delay(100)
            popupShowing = false
        }
    }

    if (popupShowing) {
        Popup(
            alignment = Alignment.Center
        ) {
            AnimatedVisibility(
                visible = viewShowing,
                enter = scaleIn(),
                exit = scaleOut()
            ) {
                Surface(
                    modifier = Modifier.size(150.dp),
                    color = MaterialTheme.colorScheme.surface,
                    contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    shape = RoundedCornerShape(16.dp),
                    tonalElevation = 5.dp,
                    shadowElevation = 5.dp
                ) {
                }
            }
        }
    }
}