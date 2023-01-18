@file:Suppress("OPT_IN_IS_NOT_ENABLED")
@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.wowphonenumber.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.taeyeon.wowphonenumber.R
import com.taeyeon.wowphonenumber.model.MainViewModel

@Composable
fun MainContent(
    mainViewModel: MainViewModel = MainViewModel()
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar() },
        bottomBar = { BottomBar() }
    ) {
        Text(text = "afds",
        modifier = Modifier.padding(it))
    }
}

@Composable
fun TopBar() {
    val borderColor = MaterialTheme.colorScheme.onPrimaryContainer
    Surface(
        modifier = Modifier
            .drawBehind {
                val width = 4.dp.toPx()
                drawArc(
                    color = borderColor,
                    startAngle = 90f,
                    sweepAngle = 90f,
                    useCenter = false,
                    topLeft = Offset(0f, size.height - 48.dp.toPx()),
                    size = Size(48.dp.toPx(), 48.dp.toPx()),
                    style = Stroke(
                        width = width,
                        cap = StrokeCap.Square
                    )
                )
                drawLine(
                    color = borderColor,
                    start = Offset(24.dp.toPx(), size.height),
                    end = Offset(size.width - 24.dp.toPx(), size.height),
                    strokeWidth = width,
                    cap = StrokeCap.Square
                )
                drawArc(
                    color = borderColor,
                    startAngle = 0f,
                    sweepAngle = 90f,
                    useCenter = false,
                    topLeft = Offset(size.width - 48.dp.toPx(), size.height - 48.dp.toPx()),
                    size = Size(48.dp.toPx(), 48.dp.toPx()),
                    style = Stroke(
                        width = width,
                        cap = StrokeCap.Square
                    )
                )
            }
            .padding(bottom = 2.dp),
        shape = RoundedCornerShape(
            topStart = 0.dp,
            topEnd = 0.dp,
            bottomStart = 24.dp,
            bottomEnd = 24.dp
        )
    ) {
        LargeTopAppBar(
            title = { Text(text = stringResource(id = R.string.app_name)) },
            colors = TopAppBarDefaults.largeTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                scrolledContainerColor = MaterialTheme.colorScheme.primaryContainer,
                navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
            )
        )
    }
}

@Composable
fun BottomBar() {
    val borderColor = MaterialTheme.colorScheme.onPrimaryContainer
    Surface(
        modifier = Modifier
            .drawBehind {
                val width = 4.dp.toPx()
                drawArc(
                    color = borderColor,
                    startAngle = 180f,
                    sweepAngle = 90f,
                    useCenter = false,
                    topLeft = Offset(0f, 0f),
                    size = Size(48.dp.toPx(), 48.dp.toPx()),
                    style = Stroke(width = width)
                )
                drawLine(
                    color = borderColor,
                    start = Offset(24.dp.toPx(), 0f),
                    end = Offset(size.width - 24.dp.toPx(), 0f),
                    strokeWidth = width
                )
                drawArc(
                    color = borderColor,
                    startAngle = 270f,
                    sweepAngle = 90f,
                    useCenter = false,
                    topLeft = Offset(size.width - 48.dp.toPx(), 0f),
                    size = Size(48.dp.toPx(), 48.dp.toPx()),
                    style = Stroke(width = width)
                )
            }
            .padding(top = 2.dp),
        shape = RoundedCornerShape(
            topStart = 24.dp,
            topEnd = 24.dp,
            bottomStart = 0.dp,
            bottomEnd = 0.dp
        )
    ) {
        BottomAppBar(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
        ) {
            
        }
    }
}