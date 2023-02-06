@file:OptIn(
    ExperimentalMaterial3Api::class, ExperimentalAnimationApi::class
)

package com.taeyeon.iconviewer.ui

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.with
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.ChevronRight
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.sharp.AccountBox
import androidx.compose.material.icons.sharp.Add
import androidx.compose.material.icons.twotone.AccountBox
import androidx.compose.material.icons.twotone.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.taeyeon.iconviewer.IconViewerViewModel
import com.taeyeon.iconviewer.R
import com.taeyeon.iconviewer.data.IconData
import com.taeyeon.iconviewer.data.IconType
import com.taeyeon.iconviewer.rememberIconViewerState
import com.taeyeon.iconviewer.util.collapse
import com.taeyeon.iconviewer.util.open
import kotlinx.coroutines.launch
import kotlin.math.floor
import kotlin.math.pow

@Composable
fun MainScreen(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    val core = List(50) {
        IconData(
            name = "AccountBox",
            filled = Icons.Filled.AccountBox,
            outlined = Icons.Outlined.AccountBox,
            rounded = Icons.Rounded.AccountBox,
            sharp = Icons.Sharp.AccountBox,
            twoTone = Icons.TwoTone.AccountBox
        )
    }
    val extended = List(300) {
        IconData(
            name = "Add",
            filled = Icons.Filled.Add,
            outlined = Icons.Outlined.Add,
            rounded = Icons.Rounded.Add,
            sharp = Icons.Sharp.Add,
            twoTone = Icons.TwoTone.Add
        )
    }

    val systemUiController = rememberSystemUiController()

    systemUiController.setStatusBarColor(
        color = MaterialTheme.colorScheme.surfaceColorAtElevation(
            elevation = 3.dp * viewModel.state.topAppBarScrollBehavior.state.collapsedFraction.pow(3)
        ),
        darkIcons = !isSystemInDarkTheme()
    )
    systemUiController.setNavigationBarColor(
        color = MaterialTheme.colorScheme.surface,
        darkIcons = !isSystemInDarkTheme()
    )

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(viewModel.state.topAppBarScrollBehavior.nestedScrollConnection),
        topBar = { TopBar(viewModel = viewModel) },
        floatingActionButton = { Fab(viewModel = viewModel) },
        floatingActionButtonPosition = FabPosition.End,
    ) { paddingValues ->
        BoxWithConstraints(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(state = viewModel.state.bodyScrollState)
        ) {
            val itemWidth = 36.dp
            val itemMinSpace = 8.dp

            var itemColumns by remember { mutableStateOf(1) }
            var itemSpace by remember { mutableStateOf(8.dp) }

            LaunchedEffect(maxWidth, true) {
                itemColumns = floor((maxWidth - itemMinSpace) / (itemWidth + itemMinSpace)).toInt()
                itemSpace = (maxWidth - itemWidth * itemColumns) / (itemColumns + 1)
            }

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {

                Spacer(modifier = Modifier.height(itemSpace / 2))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(IntrinsicSize.Min)
                        .horizontalScroll(state = rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(
                        space = 16.dp,
                        alignment = Alignment.Start
                    ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Spacer(modifier = Modifier)
                    IconData.libraryList.forEachIndexed { index, library ->
                        FilterChip(
                            selected = viewModel.libraryIndex == index,
                            onClick = { viewModel.libraryIndex = index },
                            label = { Text(text = library) }
                        )
                    }
                    Box(
                        modifier = Modifier
                            .width(1.5f.dp)
                            .fillMaxHeight()
                            .padding(vertical = 2.dp)
                            .background(
                                color = MaterialTheme.colorScheme.outlineVariant,
                                shape = CircleShape
                            )
                    )
                    IconType.values().forEach { type ->
                        FilterChip(
                            selected = viewModel.iconType == type,
                            onClick = { viewModel.iconType = type },
                            leadingIcon = { Icon(imageVector = type.example, contentDescription = "Example") },
                            label = { Text(text = type.name) }
                        )
                    }
                    Spacer(modifier = Modifier)
                }
                
                Spacer(modifier = Modifier.height(itemSpace))

                AnimatedVisibility(
                    visible = itemColumns > 1 && (viewModel.libraryIndex == 0 || viewModel.libraryIndex == 1)
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(itemSpace)
                    ) {
                        for (rowIndex in 0..core.size / itemColumns) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = itemSpace),
                                horizontalArrangement = Arrangement.spacedBy(
                                    space = itemSpace,
                                    alignment = Alignment.Start
                                )
                            ) {
                                for (columnIndex in 0 until (core.size - rowIndex * itemColumns).let { if (it <= itemColumns) it else itemColumns }) {
                                    val iconData = core[rowIndex * itemColumns + columnIndex]
                                    var imageVector by remember { mutableStateOf(viewModel.iconType.get(iconData)) }

                                    LaunchedEffect(viewModel.iconType) {
                                        imageVector = viewModel.iconType.get(iconData)
                                    }

                                    Icon(
                                        imageVector = imageVector,
                                        contentDescription = iconData.name,
                                        modifier = Modifier.size(itemWidth)
                                    )
                                }
                            }
                        }
                    }
                }

                AnimatedVisibility(
                    visible = itemColumns > 1 && (viewModel.libraryIndex == 0 || viewModel.libraryIndex == 2)
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(itemSpace)
                    ) {
                        for (rowIndex in 0..extended.size / itemColumns) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = itemSpace),
                                horizontalArrangement = Arrangement.spacedBy(
                                    space = itemSpace,
                                    alignment = Alignment.Start
                                )
                            ) {
                                for (columnIndex in 0 until (extended.size - rowIndex * itemColumns).let { if (it <= itemColumns) it else itemColumns }) {
                                    val iconData = extended[rowIndex * itemColumns + columnIndex]
                                    var imageVector by remember { mutableStateOf(viewModel.iconType.get(iconData)) }

                                    LaunchedEffect(viewModel.iconType) {
                                        imageVector = viewModel.iconType.get(iconData)
                                    }

                                    Icon(
                                        imageVector = imageVector,
                                        contentDescription = iconData.name,
                                        modifier = Modifier.size(itemWidth)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TopBar(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    val scope = rememberCoroutineScope()
    val density = LocalDensity.current

    AnimatedContent(
        targetState = viewModel.isSearching,
        transitionSpec = {
            density.run {
                if (viewModel.isSearching) {
                    slideInHorizontally(
                        animationSpec = tween(durationMillis = 250),
                        initialOffsetX = { it - Icons.Rounded.Search.defaultWidth.toPx().toInt() * 2 }
                    ) + fadeIn(
                        animationSpec = tween(durationMillis = 250)
                    ) with
                            slideOutHorizontally(
                                animationSpec = tween(durationMillis = 250),
                                targetOffsetX = { - it + Icons.Rounded.Search.defaultWidth.toPx().toInt() * 2  }
                            ) + fadeOut(
                        animationSpec = tween(durationMillis = 250)
                            )
                } else {
                    slideInHorizontally(
                        animationSpec = tween(durationMillis = 250),
                        initialOffsetX = { - it + Icons.Rounded.Search.defaultWidth.toPx().toInt() * 2 }
                    ) + fadeIn(
                        animationSpec = tween(durationMillis = 250)
                    ) with
                            slideOutHorizontally(
                                animationSpec = tween(durationMillis = 250),
                                targetOffsetX = { it - Icons.Rounded.Search.defaultWidth.toPx().toInt() * 2  }
                            ) + fadeOut(
                        animationSpec = tween(durationMillis = 250)
                            )
                }
            }
        },
        modifier = Modifier.background(MaterialTheme.colorScheme.surfaceColorAtElevation(elevation = 3.dp))
    ) {
        if (it) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(64.dp)
                    .background(MaterialTheme.colorScheme.surfaceColorAtElevation(elevation = 3.dp))
            ) {
                // TODO
                IconButton(
                    onClick = {
                        viewModel.isSearching = !viewModel.isSearching
                    },
                    modifier = Modifier
                        .padding(
                            start = 16.dp,
                            end = 24.dp
                        )
                        .align(Alignment.CenterStart)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.Search,
                        contentDescription = stringResource(id = R.string.main_top_bar_search)
                    )
                }
                BasicTextField(
                    value = "TEST DATA",
                    onValueChange = {},
                    textStyle = MaterialTheme.typography.titleLarge.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    ),
                    singleLine = true,
                    cursorBrush = SolidColor(MaterialTheme.colorScheme.onSurfaceVariant),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 48.dp + 24.dp)
                        .align(Alignment.Center)
                )
                IconButton(
                    onClick = { /* TODO */ },
                    modifier = Modifier
                        .padding(
                            start = 24.dp,
                            end = 16.dp
                        )
                        .align(Alignment.CenterEnd)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.ChevronRight,
                        contentDescription = stringResource(id = R.string.main_top_bar_search_go)
                    )
                }
            }
        } else {
            MediumTopAppBar(
                title = { Text(text = stringResource(id = R.string.app_name)) },
                actions = {
                    IconButton(
                        onClick = {
                            scope.launch {
                                viewModel.isDropDownMenuShowing = false
                                viewModel.state.topAppBarScrollBehavior.state.collapse()
                                viewModel.isSearching = !viewModel.isSearching
                            }
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Search,
                            contentDescription = stringResource(id = R.string.main_top_bar_search)
                        )
                    }
                    IconButton(
                        onClick = {
                            viewModel.isDropDownMenuShowing = !viewModel.isDropDownMenuShowing
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.MoreVert,
                            contentDescription = stringResource(id = R.string.main_top_bar_more)
                        )
                    }
                },
                scrollBehavior = viewModel.state.topAppBarScrollBehavior
            )
        }
    }
}

@Composable
fun Fab(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    val scope = rememberCoroutineScope()
    val scope2 = rememberCoroutineScope()

    Surface(
        shape = CircleShape,
        color = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
        tonalElevation = 6.dp,
        shadowElevation = 6.dp
    ) {
        Column(
            modifier = Modifier.width(48.dp)
        ) {
            IconButton(
                onClick = {
                    scope.launch {
                        viewModel.state.bodyScrollState.animateScrollTo(0)
                    }
                    scope2.launch {
                        viewModel.state.topAppBarScrollBehavior.state.open()
                    }
                },
                modifier = Modifier.size(48.dp),
                enabled = viewModel.state.bodyScrollState.value != 0 || viewModel.state.topAppBarScrollBehavior.state.collapsedFraction != 0f
            ) {
                Icon(
                    imageVector = Icons.Rounded.KeyboardArrowUp,
                    contentDescription = stringResource(id = R.string.main_fab_go_up)
                )
            }
            IconButton(
                onClick = {
                    scope.launch {
                        viewModel.state.bodyScrollState.animateScrollTo(viewModel.state.bodyScrollState.maxValue)
                    }
                    scope2.launch {
                        viewModel.state.topAppBarScrollBehavior.state.collapse()
                    }
                },
                modifier = Modifier.size(48.dp),
                enabled = viewModel.state.bodyScrollState.value != viewModel.state.bodyScrollState.maxValue || viewModel.state.topAppBarScrollBehavior.state.collapsedFraction != 1f
            ) {
                Icon(
                    imageVector = Icons.Rounded.KeyboardArrowDown,
                    contentDescription = stringResource(id = R.string.main_fab_go_down)
                )
            }
        }
    }
}