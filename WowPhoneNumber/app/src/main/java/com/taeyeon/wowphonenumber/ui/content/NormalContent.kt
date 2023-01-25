@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.wowphonenumber.ui.content

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowDownward
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.MoveDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.*
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.taeyeon.wowphonenumber.model.MainViewModel
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
    //
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

                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(30.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = LocalContentColor.current,
                            disabledContainerColor = Color.Transparent,
                            disabledContentColor = LocalContentColor.current.copy(alpha = 0.5f)
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.KeyboardArrowDown,
                            contentDescription = null
                        )
                    }

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(
                            space = 8.dp,
                            alignment = Alignment.End
                        ),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        for (index in buttonList)
                            Surface(
                                modifier = Modifier
                                    .width(buttonWidth)
                                    .height(45.dp),
                                color = MaterialTheme.colorScheme.primaryContainer,
                                contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                                shape = RoundedCornerShape(size = 8.dp),
                                border = BorderStroke(
                                    width = 2.dp,
                                    color = MaterialTheme.colorScheme.onPrimaryContainer
                                ),
                                onClick = {}
                            ) {
                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(text = index)
                                }
                            }

                    }

                }
            }
        }
    }
}