@file:OptIn(ExperimentalAnimationApi::class)

package com.taeyeon.wowphonenumber.ui.component

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class NumberBlockColors internal constructor(
    val textColor: Color,
    val blockColor: Color,
    val borderColor: Color
)

object NumberBlockDefaults {
    @Composable
    fun colors(
        textColor: Color = MaterialTheme.colorScheme.primary,
        blockColor: Color = MaterialTheme.colorScheme.primaryContainer,
        borderColor: Color = MaterialTheme.colorScheme.primary
    ) = NumberBlockColors(
        textColor = textColor,
        blockColor = blockColor,
        borderColor = borderColor
    )
}

@Composable
fun NumberBlock(
    value: Int?,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(8.dp),
    textStyle: TextStyle = MaterialTheme.typography.labelMedium,
    onClick: (() -> Unit)? = null,
    colors: NumberBlockColors = NumberBlockDefaults.colors()
) {
    require(value in 0 .. 9 || value == null) { "value는 0에서 9 사이이어야 합니다." }

    Surface(
        modifier = modifier
            .size(
                width = 40.dp,
                height = 60.dp
            )
            .let {
                 if (onClick == null) it
                 else it.clickable(onClick = { onClick() })
            },
        color = colors.blockColor,
        contentColor = colors.textColor,
        shape = shape,
        border = BorderStroke(
            width = 2.dp,
            color = colors.borderColor
        )
    ) {
        AnimatedContent(
            targetState = value
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "$it",
                    style = textStyle
                )
            }
        }
    }
}

@Preview
@Composable
fun aas() {
    NumberBlock(
        value = 7
    )
}