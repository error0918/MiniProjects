package com.taeyeon.fancyscrollcontroller.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.taeyeon.fancyscrollcontroller.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val topAppBarScrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
    val scrollState = rememberScrollState()
    val scope = rememberCoroutineScope()
    val hapticFeedback = LocalHapticFeedback.current
    var scrollAreaHeight by remember { mutableStateOf(0) }
    var scrollControllerAreaHeight by remember { mutableStateOf(0) }
    var scrollControllerShowTime by remember { mutableStateOf(0L) }
    var isScrollControllerShowing by remember { mutableStateOf(false) }

    LaunchedEffect(scrollControllerShowTime) {
        if (scrollControllerShowTime != 0L) {
            isScrollControllerShowing = true
            delay(2000)
            if (scrollControllerShowTime + 1500 < System.currentTimeMillis()) isScrollControllerShowing = false
        }
    }
    LaunchedEffect(scrollState.isScrollInProgress) {
        if (scrollState.isScrollInProgress) scrollControllerShowTime = System.currentTimeMillis()
    }

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
                    text = "TEST DATA ".repeat(1000),
                    textAlign = TextAlign.Center
                )
            }
            AnimatedVisibility(
                visible = isScrollControllerShowing,
                modifier = Modifier
                    .width(24.dp)
                    .fillMaxHeight()
                    .align(Alignment.CenterEnd)
                    .padding(4.dp),
                enter = fadeIn() + slideInHorizontally { it },
                exit = fadeOut() + slideOutHorizontally { it }
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .onSizeChanged { scrollAreaHeight = it.height }
                ) {
                    Surface(
                        color = MaterialTheme.colorScheme.primary,
                        shape = CircleShape,
                        shadowElevation = 5.dp,
                        modifier = Modifier
                            .width(16.dp)
                            .height(42.dp)
                            .offset(y = LocalDensity.current.run { ((scrollAreaHeight - scrollControllerAreaHeight) * scrollState.value / scrollState.maxValue).toDp() })
                            .onSizeChanged { scrollControllerAreaHeight = it.height }
                            .pointerInput(Unit) {
                                detectDragGestures(
                                    onDragStart = {
                                        hapticFeedback.performHapticFeedback(HapticFeedbackType.LongPress)
                                    },
                                    onDrag = { change, dragAmount ->
                                        change.consume()
                                        scope.launch {
                                            scrollState.scrollTo(scrollState.value + (scrollState.maxValue * dragAmount.y / scrollAreaHeight).toInt())
                                            scrollControllerShowTime = System.currentTimeMillis()
                                        }
                                    }
                                )
                            }
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
                                    lineTo(
                                        this@Canvas.size.width,
                                        this@Canvas.size.height - 4.dp.toPx()
                                    )
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
}