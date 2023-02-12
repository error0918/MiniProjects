package com.taeyeon.iconviewer.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.taeyeon.iconviewer.IconViewerViewModel
import com.taeyeon.iconviewer.rememberIconViewerState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// TODO...
@Composable
fun BoxScope.ScrollController(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    val scope = rememberCoroutineScope()
    val hapticFeedback = LocalHapticFeedback.current

    var scrollAreaHeight by remember { mutableStateOf(0) }
    var scrollControllerAreaHeight by remember { mutableStateOf(0) }

    var scrollControllerShowTime by remember { mutableStateOf(0L) }

    LaunchedEffect(scrollControllerShowTime) {
        if (scrollControllerShowTime != 0L) {
            viewModel.isScrollControllerShowing = true
            delay(2000)
            if (scrollControllerShowTime + 1500 < System.currentTimeMillis()) viewModel.isScrollControllerShowing = false
        }
    }
    LaunchedEffect(viewModel.state.lazyListState.isScrollInProgress) {
        if (viewModel.state.lazyListState.isScrollInProgress) scrollControllerShowTime = System.currentTimeMillis()
    }

    AnimatedVisibility(
        visible = viewModel.isScrollControllerShowing,
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
                    .offset(y = LocalDensity.current.run { ((scrollAreaHeight - scrollControllerAreaHeight) * viewModel.state.lazyListState.firstVisibleItemIndex / viewModel.state.lazyListState.layoutInfo.totalItemsCount).toDp() })
                    .onSizeChanged { scrollControllerAreaHeight = it.height }
                    .pointerInput(Unit) {
                        detectDragGestures(
                            onDragStart = {
                                hapticFeedback.performHapticFeedback(HapticFeedbackType.LongPress)
                            },
                            onDrag = { change, dragAmount ->
                                change.consume()
                                scope.launch {
                                    viewModel.state.lazyListState.animateScrollToItem(
                                        index = viewModel.state.lazyListState.firstVisibleItemIndex + (viewModel.state.lazyListState.layoutInfo.totalItemsCount * dragAmount.y / scrollAreaHeight).toInt()
                                    )
                                    scrollControllerShowTime =
                                        System.currentTimeMillis()
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