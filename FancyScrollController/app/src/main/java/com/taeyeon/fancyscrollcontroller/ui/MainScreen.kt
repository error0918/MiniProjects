package com.taeyeon.fancyscrollcontroller.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.taeyeon.fancyscrollcontroller.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val topAppBarScrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
    val scrollState = rememberScrollState()

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
        topBar = {
            MediumTopAppBar(
                title = { Text(text = stringResource(id = R.string.app_name)) },
                scrollBehavior = topAppBarScrollBehavior
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(state = scrollState)
            ) {
                Text(
                    text = "TEST DATA ".repeat(10000),
                    textAlign = TextAlign.Center
                )
            }
            Box(
                modifier = Modifier
                    .width(24.dp)
                    .fillMaxHeight()
                    .align(Alignment.CenterEnd)
                    .padding(4.dp)
            ) {
                Surface(
                    color = MaterialTheme.colorScheme.primary,
                    shape = CircleShape,
                    shadowElevation = 5.dp,
                    modifier = Modifier
                        .width(16.dp)
                        .height(42.dp)
                ) {
                    val contentColor = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.8f)
                    Canvas(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(
                                vertical = 6.dp,
                                horizontal = 4.dp
                            )
                    ) {
                        drawPath(
                            path = Path().apply {
                                moveTo(this@Canvas.size.width / 2f, 0f)
                                lineTo(0f, 4.dp.toPx())
                                lineTo(this@Canvas.size.width, 4.dp.toPx())
                                close()
                            },
                            color = contentColor
                        )
                        drawPath(
                            path = Path().apply {
                                moveTo(this@Canvas.size.width / 2f, this@Canvas.size.height)
                                lineTo(0f, this@Canvas.size.height - 4.dp.toPx())
                                lineTo(this@Canvas.size.width, this@Canvas.size.height - 4.dp.toPx())
                                close()
                            },
                            color = contentColor
                        )
                    }
                }
            }
        }
    }
}