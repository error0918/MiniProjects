@file:OptIn(ExperimentalAnimationApi::class, ExperimentalMaterial3Api::class)

package com.taeyeon.iconviewer.ui

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.with
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ChevronRight
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.taeyeon.iconviewer.IconViewerViewModel
import com.taeyeon.iconviewer.R
import com.taeyeon.iconviewer.data.IconData
import com.taeyeon.iconviewer.data.IconType
import com.taeyeon.iconviewer.rememberIconViewerState
import com.taeyeon.iconviewer.theme.SetSystemBarColor
import com.taeyeon.iconviewer.util.collapse
import kotlinx.coroutines.launch
import kotlin.math.pow

@Composable
fun TopBar(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    val density = LocalDensity.current
    val topAppBarColor = MaterialTheme.colorScheme.surfaceColorAtElevation(elevation = 3.dp)
        .copy(alpha = if (viewModel.isSearching) 1f else viewModel.state.topAppBarScrollBehavior.state.collapsedFraction.pow(2))
        .compositeOver(background = MaterialTheme.colorScheme.background)

    SetSystemBarColor(
        statusBarColor = topAppBarColor,
        navigationBarColor = MaterialTheme.colorScheme.surface
    )

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        AnimatedContent(
            targetState = viewModel.isSearching,
            transitionSpec = {
                density.run {
                    if (viewModel.isSearching) {
                        slideInHorizontally(
                            animationSpec = tween(durationMillis = 250),
                            initialOffsetX = {
                                it - Icons.Rounded.Search.defaultWidth.toPx().toInt() * 2
                            }
                        ) with
                                slideOutHorizontally(
                                    animationSpec = tween(durationMillis = 250),
                                    targetOffsetX = {
                                        -it + Icons.Rounded.Search.defaultWidth.toPx().toInt() * 2
                                    }
                                )
                    } else {
                        slideInHorizontally(
                            animationSpec = tween(durationMillis = 250),
                            initialOffsetX = {
                                -it + Icons.Rounded.Search.defaultWidth.toPx().toInt() * 2
                            }
                        ) with
                                slideOutHorizontally(
                                    animationSpec = tween(durationMillis = 250),
                                    targetOffsetX = {
                                        it - Icons.Rounded.Search.defaultWidth.toPx().toInt() * 2
                                    }
                                )
                    }
                }
            },
            modifier = Modifier.background(MaterialTheme.colorScheme.surfaceColorAtElevation(elevation = 3.dp))
        ) {
            if (it) SearchTopBar(viewModel = viewModel)
            else BasicTopBar(viewModel = viewModel)
        }
        ChipRow(
            viewModel = viewModel,
            backgroundColor = topAppBarColor
        )
    }
}


@Composable
fun BasicTopBar(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    val scope = rememberCoroutineScope()

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
            DropdownMenu(
                expanded = viewModel.isDropDownMenuShowing,
                onDismissRequest = { viewModel.isDropDownMenuShowing = false },
                modifier = Modifier.background(
                    MaterialTheme.colorScheme.surfaceColorAtElevation(
                        elevation = if (viewModel.state.topAppBarScrollBehavior.state.collapsedFraction == 1f) 7.dp else 3.dp
                    )
                )
            ) {
                DropdownMenuItem(
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Rounded.Settings,
                            contentDescription = stringResource(id = R.string.main_top_bar_search)
                        )
                    },
                    text = { Text(text = stringResource(id = R.string.main_top_bar_more_settings)) },
                    onClick = { /*TODO*/ }
                )
            }
        },
        scrollBehavior = viewModel.state.topAppBarScrollBehavior
    )
}


@Composable
fun SearchTopBar(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    var isFocused by rememberSaveable { mutableStateOf(false) }
    val focusRequester by remember { mutableStateOf(FocusRequester()) }
    val focusManager = LocalFocusManager.current

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)
            .background(MaterialTheme.colorScheme.surfaceColorAtElevation(elevation = 3.dp))
    ) {
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
            value = viewModel.searchKeyword,
            onValueChange = { viewModel.searchKeyword = it },
            textStyle = MaterialTheme.typography.titleLarge.copy(
                color = MaterialTheme.colorScheme.onSurfaceVariant
            ),
            singleLine = true,
            cursorBrush = SolidColor(MaterialTheme.colorScheme.onSurfaceVariant),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 48.dp + 24.dp)
                .align(Alignment.Center)
                .focusRequester(focusRequester = focusRequester)
                .onFocusChanged { isFocused = it.isFocused }
        )
        IconButton(
            onClick = {
                focusManager.clearFocus()
            },
            enabled = viewModel.searchKeyword.isNotBlank() && isFocused,
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
}


@Composable
fun ChipRow(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState()),
    backgroundColor: Color
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(backgroundColor)
            .padding(
                top = 4.dp,
                bottom = 8.dp
            )
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
                .height(48.dp)
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
                leadingIcon = {
                    Icon(
                        imageVector = type.example,
                        contentDescription = type.example.name
                    )
                },
                label = { Text(text = type.name) }
            )
        }
        Spacer(modifier = Modifier)
    }
}