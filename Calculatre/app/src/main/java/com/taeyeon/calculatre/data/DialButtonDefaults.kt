package com.taeyeon.calculatre.data

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp

data class DialButtonColors(
    val contentColor: Color,
    val containerColor: Color,
    val borderColor: Color,
    val disabledContentColor: Color,
    val disabledContainerColor: Color,
    val disabledBorderColor: Color
)

data class DialButtonData(
    val text: String,
    val enabled: Boolean,
    val size: DpSize,
    val shape: Shape,
    val colors: DialButtonColors,
    val borderWidth: Dp,
    val onClick: () -> Unit
)

object DialButtonDefaults {
    @Composable
    fun dialButtonColors(
        contentColor: Color = Color.Black,
        containerColor: Color = Color.LightGray,
        borderColor: Color = Color.DarkGray,
        disabledContentColor: Color = Color.Black,
        disabledContainerColor: Color = Color.LightGray,
        disabledBorderColor: Color = Color.DarkGray
    ) = DialButtonColors(
        contentColor = contentColor,
        containerColor = containerColor
        ,
        borderColor = borderColor,
        disabledContentColor = disabledContentColor,
        disabledContainerColor = disabledContainerColor,
        disabledBorderColor = disabledBorderColor
    )

    @Composable
    fun dialButtonData(
        text: String,
        enabled: Boolean = true,
        size: DpSize = DpSize.Zero,
        shape: Shape = CircleShape,
        colors: DialButtonColors = dialButtonColors(),
        borderWidth: Dp = 2.dp,
        onClick: () -> Unit
    ) = DialButtonData(
        text = text,
        enabled = enabled,
        size = size,
        shape = shape,
        colors = colors,
        borderWidth = borderWidth,
        onClick = onClick
    )
}