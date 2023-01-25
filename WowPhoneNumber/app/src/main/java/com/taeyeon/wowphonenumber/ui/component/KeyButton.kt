@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.wowphonenumber.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp

@Composable
fun KeyButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(3.dp),
    contentColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    border: BorderStroke = BorderStroke(
        width = 2.dp,
        color = MaterialTheme.colorScheme.onSurfaceVariant
    ),
    shape: Shape = RoundedCornerShape(size = 8.dp),
    content: @Composable BoxScope.() -> Unit
) {
    val hapticFeedback = LocalHapticFeedback.current

    Surface(
        modifier = modifier,
        color = color,
        contentColor = contentColor,
        border = border,
        shape = shape,
        onClick = {
            hapticFeedback.performHapticFeedback(HapticFeedbackType.LongPress)
            onClick()
        }
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
            content = content
        )
    }
}