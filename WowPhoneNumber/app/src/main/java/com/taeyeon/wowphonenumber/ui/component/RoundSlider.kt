package com.taeyeon.wowphonenumber.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.systemGestureExclusion
import androidx.compose.material.SliderColors
import androidx.compose.material.SliderDefaults
import androidx.compose.material.minimumInteractiveComponentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp


@Composable
fun RoundSlider(
    value: Long,
    onValueChange: (value: Long) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedRange<Long> = 0L .. 100L,
    steps: Long = - valueRange.start + valueRange.endInclusive + 1L,
    onValueChangeFinished: (() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: SliderColors = SliderDefaults.colors()
) {
    require(steps >= 0L) { "steps은 0보다 크거나 같아야 합니다." }
    require(steps <= - valueRange.start + valueRange.endInclusive + 1L) { "steps은 valueRange 내에 있여야 합니다." }

    val thumbRadius = 10.dp

    val allSteps =
        valueRange.start + valueRange.endInclusive + 1L
    val realSteps =
        if (steps == 0L) - valueRange.start + valueRange.endInclusive + 1L
        else steps
    val percent = allSteps.toDouble() / (value - valueRange.start).toDouble()

    var xRange by remember { mutableStateOf(0f .. 0f) }

    val density = LocalDensity.current

    val backgroundColor = MaterialTheme.colorScheme.primaryContainer
    val thumbColor = MaterialTheme.colorScheme.primary

    BoxWithConstraints(
        modifier = modifier
            .minimumInteractiveComponentSize()
            .sizeIn(
                minWidth = thumbRadius * 8,
                minHeight = thumbRadius * 4
            )
            .background(
                color = backgroundColor,
                shape = CircleShape
            )
            .onPlaced {
                xRange =
                    it.positionInRoot().x + with(density) { thumbRadius.toPx() }..xRange.endInclusive
            }
            .pointerInput(Unit) {
                detectTapGestures(
                    onPress = { offset ->
                        if (offset.x in xRange)
                        onValueChange(
                            (valueRange.start + (xRange.endInclusive - xRange.start) / (offset.x - xRange.start) * (valueRange.endInclusive - valueRange.start)).toLong()
                        )
                    },
                    /*onTap = { offset ->
                        /*onValueChange(
                            (valueRange.start + (xRange.endInclusive - xRange.start) / (offset.x - xRange.start) * (valueRange.endInclusive - valueRange.start)).toLong()
                        )*/
                    }*/
                )
            }
            .padding(thumbRadius),
        contentAlignment = Alignment.CenterStart
    ) {
        LaunchedEffect(xRange) {
            if (xRange.start + with (density) { maxWidth.toPx() } != xRange.endInclusive)
                xRange = xRange.start .. xRange.start + with (density) { maxWidth.toPx() }
        }

        Box(
            modifier = Modifier
                .width((maxWidth - thumbRadius * 2) * percent.toFloat() + thumbRadius * 2)
                .height(thumbRadius * 2)
                .background(
                    color = thumbColor,
                    shape = CircleShape
                )
        )
    }
}