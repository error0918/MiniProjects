package com.taeyeon.wowphonenumber.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.ui.component.NumberBlock

@Composable
fun MainContent(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    val phoneNumber = arrayOf(
        arrayOf('0', '1', '0'),
        arrayOf('1', '2', '3', '4'),
        arrayOf('5', '6', '7', '8')
    )
    val align = arrayOf(
        Alignment.Start, Alignment.CenterHorizontally, Alignment.End
    )

    Surface(
        modifier = Modifier.padding(8.dp),
        color = MaterialTheme.colorScheme.surfaceColorAtElevation(6.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(space = 16.dp)
        ) {
            phoneNumber.forEachIndexed { index, block ->
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
                        NumberBlock(
                            value = item.digitToInt()
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