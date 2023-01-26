package com.taeyeon.wowphonenumber.ui.content

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Sync
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.taeyeon.wowphonenumber.R
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.ui.component.NumberBlock
import java.util.*

@Composable
fun RandomContent(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (randomButton, numbers) = createRefs()

        IconButton(
            onClick = {
                for (blockIndex in mainViewModel.phoneNumber.indices) {
                    for (numberIndex in mainViewModel.phoneNumber[blockIndex].indices) {
                        mainViewModel.phoneNumber[blockIndex][numberIndex] = "${Random().nextInt(10)}"[0]
                    }
                }
            },
            modifier = Modifier
                .constrainAs(randomButton) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                }
        ) {
            Icon(
                imageVector = Icons.Rounded.Sync,
                contentDescription = stringResource(id = R.string.random_content_roll)
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
                mainViewModel.phoneNumber.forEachIndexed { blockIndex, block ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        block.forEachIndexed { numberIndex, item ->
                            NumberBlock(
                                value = item?.digitToInt(),
                                onClick = {
                                    mainViewModel.phoneNumber[blockIndex][numberIndex] = "${Random().nextInt(10)}"[0]
                                }
                            )
                        }

                        val primary = MaterialTheme.colorScheme.primary
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

                        IconButton(
                            onClick = {
                                for (numberIndex in mainViewModel.phoneNumber[blockIndex].indices) {
                                    mainViewModel.phoneNumber[blockIndex][numberIndex] = "${Random().nextInt(10)}"[0]
                                }
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Sync,
                                contentDescription = stringResource(id = R.string.random_content_roll)
                            )
                        }
                    }
                }
            }
        }
    }
}