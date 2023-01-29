@file:OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalPagerApi::class,
    ExperimentalFoundationApi::class
)

package com.taeyeon.wowphonenumber.ui

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
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
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.taeyeon.wowphonenumber.R
import com.taeyeon.wowphonenumber.data.Screen
import com.taeyeon.wowphonenumber.model.MainViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

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
            userScrollEnabled = false,
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
    if (mainViewModel.isInfoDialog) InfoDialog(mainViewModel = mainViewModel)
    if (mainViewModel.isLicenseDialog) LicenseDialog(mainViewModel = mainViewModel)
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
                    contentDescription = stringResource(id = R.string.main_screen_topbar_edit_title)
                )
            }
            IconButton(
                onClick = { mainViewModel.isInfoDialog = !mainViewModel.isInfoDialog }
            ) {
                Icon(
                    imageVector = Icons.Rounded.Info,
                    contentDescription = stringResource(id = R.string.main_screen_topbar_show_info)
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

    val emptyMessage = stringResource(id = R.string.main_screen_topbar_edit_title_empty_error)
    val tooLongMessage = stringResource(id = R.string.main_screen_topbar_edit_title_too_long_error)

    LaunchedEffect(mainViewModel.title) {
        temporaryTitle = mainViewModel.title
    }
    LaunchedEffect(temporaryTitle) {
        errorMessage = when {
            temporaryTitle.isBlank() -> emptyMessage
            temporaryTitle.length > 50 -> tooLongMessage
            else -> null
        }
    }

    AlertDialog(
        onDismissRequest = { mainViewModel.isEditTitleDialog = false },
        dismissButton = {
            TextButton(
                onClick = { mainViewModel.isEditTitleDialog = false }
            ) {
                Text(text = stringResource(id = R.string.main_screen_topbar_edit_title_close_dialog))
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
                Text(text = stringResource(id = R.string.main_screen_topbar_edit_title_finish))
            }
        },
        icon = {
            Icon(
                imageVector = Icons.Rounded.Edit,
                contentDescription = stringResource(id = R.string.main_screen_topbar_edit_title)
            )
        },
        title = { Text(text = stringResource(id = R.string.main_screen_topbar_edit_title)) },
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
                    label = { Text(text = stringResource(id = R.string.main_screen_topbar_edit_title_message)) },
                    trailingIcon = {
                        IconButton(
                            onClick = { temporaryTitle = "" },
                            enabled = temporaryTitle.isNotEmpty()
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Clear,
                                contentDescription = stringResource(id = R.string.main_screen_topbar_edit_title_clear)
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
    val scope = rememberCoroutineScope()
    val hapticFeedbackType = LocalHapticFeedback.current

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
                contentDescription = stringResource(id = R.string.main_screen_bottombar_page_left)
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
                var startPage by remember { mutableStateOf(0) }
                var startOffset by remember { mutableStateOf(Offset.Zero) }
                val step = LocalDensity.current.run { 10.dp.toPx() }

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
                                onDragStart = { offset ->
                                    startPage = mainViewModel.pagerState.currentPage
                                    startOffset = offset

                                    isPopupIndicatorShowing = true
                                    hapticFeedbackType.performHapticFeedback(HapticFeedbackType.LongPress)
                                },
                                onDragEnd = {
                                    scope.launch {
                                        delay(1000)
                                        isPopupIndicatorShowing = false
                                    }
                                },
                                onDragCancel = {
                                    scope.launch {
                                        delay(500)
                                        isPopupIndicatorShowing = false
                                    }
                                },
                                onDrag = { change, _ ->
                                    val delta =
                                        (startOffset.x - change.position.x).roundToInt() / step.toInt()
                                    if (startPage - delta != mainViewModel.pagerState.currentPage && startPage - delta in 0 until mainViewModel.pagerState.pageCount) {
                                        scope.launch {
                                            mainViewModel.pagerState.scrollToPage(startPage - delta)
                                            hapticFeedbackType.performHapticFeedback(
                                                HapticFeedbackType.LongPress
                                            )
                                        }
                                    }
                                }
                            )
                        }
                        .onFocusChanged {
                            if (it.hasFocus) {
                                isPopupIndicatorShowing = true
                                hapticFeedbackType.performHapticFeedback(HapticFeedbackType.LongPress)
                            }
                        }
                        .padding(8.dp)
                )
            }
            Text(
                text = stringResource(id = Screen.values()[mainViewModel.pagerState.currentPage].titleId),
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
                contentDescription = stringResource(id = R.string.main_screen_bottombar_page_right)
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
    var realShowing by rememberSaveable { mutableStateOf(false) }

    LaunchedEffect(showing) {
        realShowing = if (showing) {
            delay(100)
            true
        } else {
            delay(1000)
            false
        }
    }

    if (realShowing) {
        Popup(
            alignment = Alignment.BottomCenter,
            offset = IntOffset(x = 0, y = LocalDensity.current.run { (-80).dp.toPx().toInt() }),
            properties = PopupProperties(
                focusable = false,
                dismissOnBackPress = false,
                dismissOnClickOutside = false,
                excludeFromSystemGesture = true
            )
        ) {
            AnimatedVisibility(
                visible = showing,
                enter = fadeIn(
                    animationSpec = tween(500)
                ),
                exit = fadeOut(
                    animationSpec = tween(500)
                )
            ) {
                Surface(
                    color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f),
                    shape = RoundedCornerShape(size = 12.dp)
                ) {
                    HorizontalPagerIndicator(
                        pagerState = mainViewModel.pagerState,
                        activeColor = MaterialTheme.colorScheme.onPrimaryContainer,
                        inactiveColor = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.5f),
                        indicatorWidth = 6.dp,
                        indicatorHeight = 6.dp,
                        modifier = Modifier
                            .padding(16.dp)
                    )
                }
            }
        }
    }
}