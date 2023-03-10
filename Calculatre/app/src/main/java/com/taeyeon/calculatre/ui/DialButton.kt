package com.taeyeon.calculatre.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.taeyeon.calculatre.data.DialButtonColors
import com.taeyeon.calculatre.data.DialButtonData
import com.taeyeon.calculatre.data.DialButtonDefaults


@Composable
fun DialButton(
    dialButtonData: DialButtonData
) = dialButtonData.run {
    DialButton(
        text = text,
        enabled = enabled,
        size = size,
        shape = shape,
        colors = colors,
        borderWidth = borderWidth,
        onClick = onClick
    )
}

@Composable
fun DialButton(
    text: String,
    enabled: Boolean = true,
    size: DpSize = DpSize.Zero,
    shape: Shape = CircleShape,
    colors: DialButtonColors = DialButtonDefaults.dialButtonColors(),
    borderWidth: Dp = 2.dp,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier.let {
            if (size.width <= 0.dp || size.height <= 0.dp) it
            else it.size(size = size)
        },
        enabled = enabled,
        shape = shape,
        colors = ButtonDefaults.buttonColors(
            contentColor = colors.contentColor,
            containerColor = colors.containerColor,
            disabledContentColor = colors.disabledContentColor,
            disabledContainerColor = colors.disabledContainerColor
        ),
        border = BorderStroke(
            width = borderWidth,
            color = if (enabled) colors.borderColor else colors.disabledBorderColor
        )
    ) {
        Text(
            text = text
        )
    }
}
