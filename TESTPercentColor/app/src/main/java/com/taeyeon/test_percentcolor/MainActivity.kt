package com.taeyeon.test_percentcolor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.layout.positionInParent
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.taeyeon.test_percentcolor.ui.theme.TESTPercentColorTheme
import kotlin.math.roundToInt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TESTPercentColorTheme(
                darkTheme = true
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(
                            space = 12.dp,
                            alignment = Alignment.CenterVertically
                        )
                    ) {
                        val animatedRatio by rememberInfiniteTransition(
                            label = "Animation Ratio Infinite Transition"
                        ).animateFloat(
                            label = "Animation Ratio",
                            initialValue = 0f,
                            targetValue = 1f,
                            animationSpec = infiniteRepeatable(
                                animation = tween(5000),
                                repeatMode = RepeatMode.Reverse
                            )
                        )

                        PercentColor(
                            text = "TEST",
                            containerColor = MaterialTheme.colorScheme.primary,
                            ratio = 0.9f
                        )
                        PercentColor(
                            text = "TEST",
                            containerColor = MaterialTheme.colorScheme.secondary,
                            ratio = 0.5f
                        )
                        PercentColor(
                            text = "TEST",
                            containerColor = MaterialTheme.colorScheme.tertiary,
                            ratio = 0.1f
                        )
                        PercentColor(
                            text = "TEST",
                            containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(17.dp),
                            ratio = animatedRatio
                        )
                        PercentColor(
                            text = "TEST",
                            containerColor = MaterialTheme.colorScheme.onSurfaceVariant,
                            ratio = animatedRatio
                        )
                    }
                }
            }
        }
    }

    @Composable
    fun PercentColor(
        text: String,
        containerColor: Color,
        ratio: Float
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            shape = RoundedCornerShape(size = 12.dp),
            color = MaterialTheme.colorScheme.surfaceColorAtElevation(elevation = 5.dp),
            contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
        ) {
            var size by remember { mutableStateOf(IntSize.Zero) }
            var textPosition by remember { mutableStateOf(Offset.Zero) }
            var percentPosition by remember { mutableStateOf(Offset.Zero) }

            val textColor = if (containerColor.luminance() > 0.5f) Color.Black else Color.White
            val textStyle = MaterialTheme.typography.labelLarge

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .onSizeChanged { size = it }
            ) {
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(24.dp)
                        .onPlaced { textPosition = it.positionInParent() },
                    text = text,
                    style = textStyle
                )
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(24.dp)
                        .onPlaced { percentPosition = it.positionInParent() },
                    text = "${(ratio * 1000).roundToInt() / 10f}",
                    style = textStyle
                )
                Box(
                    modifier = Modifier
                        .width(LocalDensity.current.run { (size.width * ratio).toDp() })
                        .fillMaxHeight()
                        .background(containerColor)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(
                                start = LocalDensity.current.run { textPosition.x.toDp() },
                                top = LocalDensity.current.run { textPosition.y.toDp() }
                            ),
                        text = text,
                        style = textStyle.copy(color = textColor),
                        softWrap = false
                    )
                    Text(
                        modifier = Modifier
                            .padding(
                                start = LocalDensity.current.run { percentPosition.x.toDp() },
                                top = LocalDensity.current.run { percentPosition.y.toDp() }
                            ),
                        text = "${(ratio * 1000).roundToInt() / 10f}",
                        style = textStyle.copy(color = textColor),
                        softWrap = false
                    )
                }
            }
        }
    }
}