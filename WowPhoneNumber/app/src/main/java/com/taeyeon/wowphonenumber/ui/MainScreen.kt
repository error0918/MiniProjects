@file:OptIn(ExperimentalMaterial3Api::class,
    ExperimentalPagerApi::class, ExperimentalFoundationApi::class
)
@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package com.taeyeon.wowphonenumber.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.taeyeon.wowphonenumber.data.Screen
import com.taeyeon.wowphonenumber.model.MainViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun MainScreen(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar(mainViewModel = mainViewModel) },
        bottomBar = { BottomBar(mainViewModel = mainViewModel) }
    ) { paddingValues ->
        val primaryContainer = MaterialTheme.colorScheme.primaryContainer
        val backgroundColor = MaterialTheme.colorScheme.background
        HorizontalPager(
            count = Screen.values().size,
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .drawBehind {
                    // Top
                    drawRect(
                        color = primaryContainer,
                        topLeft = Offset(0f, 0f),
                        size = Size(16.dp.toPx(), 16.dp.toPx())
                    )
                    drawArc(
                        color = backgroundColor,
                        startAngle = 180f,
                        sweepAngle = 90f,
                        useCenter = true,
                        topLeft = Offset(0f, 0f),
                        size = Size(32.dp.toPx(), 32.dp.toPx()),
                    )
                    drawRect(
                        color = primaryContainer,
                        topLeft = Offset(size.width - 16.dp.toPx(), 0f),
                        size = Size(16.dp.toPx(), 16.dp.toPx())
                    )
                    drawArc(
                        color = backgroundColor,
                        startAngle = 270f,
                        sweepAngle = 90f,
                        useCenter = true,
                        topLeft = Offset(size.width - 32.dp.toPx(), 0f),
                        size = Size(32.dp.toPx(), 32.dp.toPx()),
                    )
                    // Bottom
                    drawRect(
                        color = primaryContainer,
                        topLeft = Offset(0f, size.height - 16.dp.toPx()),
                        size = Size(16.dp.toPx(), 16.dp.toPx())
                    )
                    drawArc(
                        color = backgroundColor,
                        startAngle = 90f,
                        sweepAngle = 90f,
                        useCenter = true,
                        topLeft = Offset(0f, size.height - 32.dp.toPx()),
                        size = Size(32.dp.toPx(), 32.dp.toPx()),
                    )
                    drawRect(
                        color = primaryContainer,
                        topLeft = Offset(size.width - 16.dp.toPx(), size.height - 16.dp.toPx()),
                        size = Size(16.dp.toPx(), 16.dp.toPx())
                    )
                    drawArc(
                        color = backgroundColor,
                        startAngle = 0f,
                        sweepAngle = 90f,
                        useCenter = true,
                        topLeft = Offset(size.width - 32.dp.toPx(), size.height - 32.dp.toPx()),
                        size = Size(32.dp.toPx(), 32.dp.toPx()),
                    )
                },
            state = mainViewModel.pagerState,
            contentPadding = PaddingValues(16.dp),
            itemSpacing = 16.dp,
            verticalAlignment = Alignment.CenterVertically,
        ) { page ->
            Screen.values()[page].content(mainViewModel = mainViewModel)
        }
    }

    if (mainViewModel.isEditTitleDialog) EditTitleDialog(mainViewModel = mainViewModel)
}


@Composable
fun TopBar(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    val hapticFeedback = LocalHapticFeedback.current
    MediumTopAppBar(
        title = {
            Surface(
                color = Color.Transparent,
                shape = RoundedCornerShape(size = 6.dp)
            ) {
                Text(
                    text = mainViewModel.title,
                    modifier = Modifier
                        .combinedClickable(
                            onClick = {  },
                            onLongClick = {
                                hapticFeedback.performHapticFeedback(HapticFeedbackType.LongPress)
                                mainViewModel.isEditTitleDialog = !mainViewModel.isEditTitleDialog
                            }
                        )
                )
            }
        },
        actions = {
            IconButton(
                onClick = { mainViewModel.isEditTitleDialog = !mainViewModel.isEditTitleDialog }
            ) {
                Icon(
                    imageVector = Icons.Rounded.Edit,
                    contentDescription = null
                )
            }
            IconButton(
                onClick = {  }
            ) {
                Icon(
                    imageVector = Icons.Rounded.Info,
                    contentDescription = null
                )
            }
        },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            scrolledContainerColor = MaterialTheme.colorScheme.primaryContainer,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    )
}


@Composable
fun EditTitleDialog(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    var temporaryTitle by rememberSaveable { mutableStateOf(mainViewModel.title) }
    var errorMessage by rememberSaveable { mutableStateOf<String?>("a") }

    LaunchedEffect(mainViewModel.title) {
        temporaryTitle = mainViewModel.title
    }
    LaunchedEffect(temporaryTitle) {
        errorMessage = when {
            temporaryTitle.isBlank() -> "비어있음"
            temporaryTitle.length > 50 -> "너무 길음"
            else -> null
        }
    }

    AlertDialog(
        onDismissRequest = { mainViewModel.isEditTitleDialog = false },
        dismissButton = {
            TextButton(
                onClick = { mainViewModel.isEditTitleDialog = false }
            ) {
                Text(text = "닫기")
            }
        },
        confirmButton = {
            TextButton(
                onClick = {
                    mainViewModel.isEditTitleDialog = false
                    mainViewModel.title = temporaryTitle
                },
                enabled = errorMessage == null
            ) {
                Text(text = "완료")
            }
        },
        icon = {
            Icon(
                imageVector = Icons.Rounded.Edit,
                contentDescription = null
            )
        },
        title = { Text(text = "타이틀 편집") },
        text = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                OutlinedTextField(
                    value = temporaryTitle,
                    onValueChange = { value ->
                        temporaryTitle = value
                    },
                    label = { Text(text = "새로운 타이틀 입력") },
                    trailingIcon = {
                        IconButton(
                            onClick = { temporaryTitle = "" },
                            enabled = temporaryTitle.isNotEmpty()
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Clear,
                                contentDescription = null
                            )
                        }
                    },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
                errorMessage?.let {
                    Text(
                        text = it,
                        color = MaterialTheme.colorScheme.error,
                        modifier = Modifier.align(Alignment.End)
                    )
                }
            }
        }
    )
}


@Composable
fun BottomBar(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    val hapticFeedbackType = LocalHapticFeedback.current
    val scope = rememberCoroutineScope()

    var isPopupIndicatorShowing by rememberSaveable { mutableStateOf(false) }

    BottomAppBar(
        modifier = Modifier.height(64.dp),
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.onPrimaryContainer
    ) {
        Button(
            onClick = {
                scope.launch {
                    mainViewModel.pagerState.animateScrollToPage(mainViewModel.pagerState.currentPage - 1)
                }
            },
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .padding(6.dp),
            shape = RoundedCornerShape(8.dp),
            enabled = mainViewModel.pagerState.currentPage != 0,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.5f)
            )
        ) {
            Icon(
                imageVector = Icons.Rounded.ChevronLeft,
                contentDescription = null
            )
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {
            Surface(
                color = Color.Transparent,
                shape = RoundedCornerShape(size = 4.dp),
                modifier = Modifier
                    .align(Alignment.Center)
            ) {
                HorizontalPagerIndicator(
                    pagerState = mainViewModel.pagerState,
                    pageCount = 3,
                    pageIndexMapping = { index ->
                        when (index) {
                            0 -> 0
                            mainViewModel.pagerState.pageCount - 1 -> 2
                            else -> 1
                        }
                    },
                    activeColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    inactiveColor = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.5f),
                    indicatorWidth = 6.dp,
                    indicatorHeight = 6.dp,
                    modifier = Modifier
                        .clickable { }
                        .pointerInput(Unit) {
                            detectDragGestures(
                                onDragStart = { isPopupIndicatorShowing = true },
                                onDragEnd = {
                                    scope.launch {
                                        delay(1000)
                                        isPopupIndicatorShowing = false
                                    }
                                },
                                onDragCancel = {
                                    scope.launch {
                                        delay(1000)
                                        isPopupIndicatorShowing = false
                                    }
                                },
                                onDrag = { _, dragAmount ->
                                    // tODO
                                    hapticFeedbackType.performHapticFeedback(HapticFeedbackType.LongPress)
                                }
                            )
                        }
                        .padding(8.dp)
                )
            }
            Text(
                text = Screen.values()[mainViewModel.pagerState.currentPage].title,
                color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.5f),
                style = MaterialTheme.typography.labelSmall,
                modifier = Modifier.align(Alignment.BottomCenter)
            )
        }
        Button(
            onClick = {
                scope.launch {
                    mainViewModel.pagerState.animateScrollToPage(mainViewModel.pagerState.currentPage + 1)
                }
            },
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .padding(6.dp),
            shape = RoundedCornerShape(8.dp),
            enabled = mainViewModel.pagerState.currentPage != Screen.values().size - 1,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.5f)
            )
        ) {
            Icon(
                imageVector = Icons.Rounded.ChevronRight,
                contentDescription = null
            )
        }
    }

    PopupIndicator(
        mainViewModel = mainViewModel,
        showing = isPopupIndicatorShowing
    )
}


@Composable
fun PopupIndicator(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current),
    showing: Boolean
) {
    val scope = rememberCoroutineScope()
    //
}