package com.taeyeon.wowphonenumber.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.ui.component.NumberBlock
import com.taeyeon.wowphonenumber.ui.component.NumberBlockColors
import com.taeyeon.wowphonenumber.ui.component.NumberBlockDefaults

@Composable
fun MainContent(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    val align = arrayOf(Alignment.Start, Alignment.CenterHorizontally, Alignment.End)

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
                                onClick = {
                                    colors = colors!!.copy(
                                        textColor = Color.DarkGray,
                                        blockColor = Color.LightGray,
                                        borderColor = Color.DarkGray
                                    )
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