@file:OptIn(ExperimentalTextApi::class)

package com.taeyeon.wowphonenumber.ui.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.withStyle
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
    textStyle: TextStyle = MaterialTheme.typography.titleLarge,
    onClick: (() -> Unit)? = null,
    colors: NumberBlockColors = NumberBlockDefaults.colors()
) {
    require(value in 0 .. 9 || value == null) { "value는 0에서 9 사이이어야 합니다." }

    val animatedValue by animateFloatAsState(
        targetValue = (value ?: -1).toFloat(),
        animationSpec = tween(500)
    )

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

        val textLayoutResultList = List(11) { index ->
            rememberTextMeasurer()
                .measure(
                    buildAnnotatedString {
                        withStyle(
                            textStyle.toSpanStyle().copy(
                                color = colors.textColor
                            )
                        ) {
                            append(" 0123456789"[index])
                        }
                    }
                )
        }

        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {
            textLayoutResultList.forEachIndexed { index, textLayoutResult ->
                drawText(
                    textLayoutResult = textLayoutResult,
                    topLeft = Offset(
                        x = size.width / 2 - textLayoutResult.size.width / 2,
                        y = size.height / 2 - textLayoutResult.size.height / 2 +
                                60.dp.toPx() * (index - animatedValue - 1)
                    )
                )
            }
        }
    }
}