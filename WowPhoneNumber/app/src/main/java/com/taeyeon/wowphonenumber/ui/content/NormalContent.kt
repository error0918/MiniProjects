package com.taeyeon.wowphonenumber.ui.content

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material.icons.rounded.KeyboardBackspace
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.ui.component.KeyButton
import com.taeyeon.wowphonenumber.ui.component.NumberBlock
import com.taeyeon.wowphonenumber.ui.component.NumberBlockColors
import com.taeyeon.wowphonenumber.ui.component.NumberBlockDefaults

@Composable
fun NormalContent(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    val align = arrayOf(Alignment.Start, Alignment.CenterHorizontally, Alignment.End)

    PopupKeyPad()

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (resetButton, numbers) = createRefs()

        IconButton(
            onClick = {
                for (blockId in 1 until mainViewModel.phoneNumber.size) {
                    for (numberId in mainViewModel.phoneNumber[blockId].indices) mainViewModel.phoneNumber[blockId][numberId] = null
                }
            },
            modifier = Modifier
                .constrainAs(resetButton) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                }
        ) {
            Icon(
                imageVector = Icons.Rounded.Delete,
                contentDescription = null
            )
        }

        Surface(
            modifier = Modifier
                .constrainAs(numbers) {
                    width = Dimension.matchParent
                    centerTo(parent)
                },
            color = MaterialTheme.colorScheme.surfaceColorAtElevation(6.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(space = 16.dp)
            ) {
                mainViewModel.phoneNumber.forEachIndexed { index, block ->
                    Row(
                        modifier = Modifier.align(align[index]),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        val primary = MaterialTheme.colorScheme.primary
                        if (align[index] != Alignment.Start) {
                            Canvas(
                                modifier = Modifier.weight(1f)
                            ) {
                                drawLine(
                                    color = primary,
                                    start = Offset(0f, 0f),
                                    end = Offset(size.width, 0f),
                                    strokeWidth = 4.dp.toPx(),
                                    cap = StrokeCap.Round,
                                    alpha = 0.5f
                                )
                            }
                        }

                        block.forEach { item ->
                            var colors by remember { mutableStateOf<NumberBlockColors?>(null) }

                            if (colors == null) colors = NumberBlockDefaults.colors()

                            NumberBlock(
                                value = item?.digitToInt(),
                                modifier = Modifier,
                                onClick = {
                                    colors = colors!!.copy(
                                        textColor = Color.DarkGray,
                                        blockColor = Color.LightGray,
                                        borderColor = Color.DarkGray
                                    )
                                    // TODO: Keyboard
                                },
                                colors = colors!!
                            )
                        }

                        if (align[index] != Alignment.End) {
                            Canvas(
                                modifier = Modifier.weight(1f)
                            ) {
                                drawLine(
                                    color = primary,
                                    start = Offset(size.width, 0f),
                                    end = Offset(0f, 0f),
                                    strokeWidth = 4.dp.toPx(),
                                    cap = StrokeCap.Round,
                                    alpha = 0.5f
                                )
                            }
                        }
                    }
                }
            }
        }

    }
}


@Composable
fun PopupKeyPad() {
    Popup(
        popupPositionProvider = object : PopupPositionProvider {
            override fun calculatePosition(
                anchorBounds: IntRect,
                windowSize: IntSize,
                layoutDirection: LayoutDirection,
                popupContentSize: IntSize
            ): IntOffset {
                return IntOffset(
                    x = 0,
                    y = anchorBounds.height + windowSize.height - popupContentSize.height
                )
            }
        },
        onDismissRequest = {},
        properties = PopupProperties(
            focusable = true,
            dismissOnBackPress = true,
            dismissOnClickOutside = true
        )
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            color = MaterialTheme.colorScheme.surfaceColorAtElevation(6.dp),
            contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
            shape = RoundedCornerShape(8.dp)
        ) {
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
            ) {
                val buttonList = listOf(
                    "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"
                )
                var buttonWidth by remember { mutableStateOf(0.dp) }

                LaunchedEffect(maxWidth) {
                    buttonWidth =
                        ((maxWidth - (buttonList.size - 1) * 8.dp) / buttonList.size).let {
                            if (it >= 30.dp) 30.dp else it
                        }
                }

                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 8.dp)
                ) {

                    Box(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.align(Alignment.CenterStart),
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            KeyButton(
                                onClick = {  },
                                modifier = Modifier
                                    .width(buttonWidth * 1.5f)
                                    .height(40.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Rounded.KeyboardArrowLeft,
                                    contentDescription = null
                                )
                            }
                            KeyButton(
                                onClick = {  },
                                modifier = Modifier
                                    .width(buttonWidth * 1.5f)
                                    .height(40.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Rounded.KeyboardArrowRight,
                                    contentDescription = null
                                )
                            }
                        }

                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .width(80.dp)
                                .height(40.dp)
                                .align(Alignment.Center),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                contentColor = LocalContentColor.current,
                                disabledContainerColor = Color.Transparent,
                                disabledContentColor = LocalContentColor.current.copy(alpha = 0.5f)
                            ),
                            contentPadding = PaddingValues(0.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.KeyboardArrowDown,
                                contentDescription = null
                            )
                        }

                        Row(
                            modifier = Modifier.align(Alignment.CenterEnd),
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            KeyButton(
                                onClick = {  },
                                modifier = Modifier
                                    .width(buttonWidth * 3 + 8.dp)
                                    .height(40.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Rounded.KeyboardBackspace,
                                    contentDescription = null
                                )
                            }
                        }
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(
                            space = 8.dp,
                            alignment = Alignment.End
                        ),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        for (index in buttonList)
                            KeyButton(
                                onClick = {  },
                                modifier = Modifier
                                    .width(buttonWidth)
                                    .height(40.dp)
                            ) {
                                Text(text = index)
                            }

                    }

                }
            }
        }
    }
}