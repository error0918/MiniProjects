package com.taeyeon.calculatre.data

import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize

data class DialButtonData(
    val text: String,
    val enabled: Boolean,
    val size: DpSize,
    val shape: Shape,
    val colors: DialButtonColors,
    val borderWidth: Dp,
    val onClick: () -> Unit
)