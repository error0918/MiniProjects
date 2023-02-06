@file:OptIn(
    ExperimentalMaterial3Api::class
)

package com.taeyeon.iconviewer.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.ScrollState
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
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
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
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
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.taeyeon.iconviewer.R
import com.taeyeon.iconviewer.data.IconData
import com.taeyeon.iconviewer.MainViewModel
import com.taeyeon.iconviewer.util.collapse
import com.taeyeon.iconviewer.util.open
import kotlinx.coroutines.launch
import kotlin.math.floor
import kotlin.math.pow

@Composable
fun MainScreen(
    mainViewModel: MainViewModel = MainViewModel()
) {
    val material_icons_core = List(50) {
        IconData(
            name = "AccountBox",
            filled = Icons.Filled.AccountBox,
            outlined = Icons.Outlined.AccountBox,
            rounded = Icons.Rounded.AccountBox,
            sharp = Icons.Sharp.AccountBox,
            twoTone = Icons.TwoTone.AccountBox
        )
    }
    val material_icons_extended = List(300) {
        IconData(
            name = "Add",
            filled = Icons.Filled.Add,
            outlined = Icons.Outlined.Add,
            rounded = Icons.Rounded.Add,
            sharp = Icons.Sharp.Add,
            twoTone = Icons.TwoTone.Add
        )
    }
    //material_icons_core = IconData.material_icons_core; material_icons_extended = IconData.material_icons_extended

    val systemUiController = rememberSystemUiController()
    val scrollState = rememberScrollState()
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()

    systemUiController.setStatusBarColor(
        color = MaterialTheme.colorScheme.surfaceColorAtElevation(
            elevation = 3.dp * scrollBehavior.state.collapsedFraction.pow(3)
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
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopBar(
                scrollBehavior = scrollBehavior
            )
        },
        floatingActionButton = {
            Fab(
                scrollState = scrollState,
                scrollBehavior = scrollBehavior
            )
        },
        floatingActionButtonPosition = FabPosition.End,
    ) { paddingValues ->
        BoxWithConstraints(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(state = scrollState)
        ) {
            val itemWidth = 36.dp
            val itemMinSpace = 8.dp

            var itemColumns by remember { mutableStateOf(1) }
            var itemSpace by remember { mutableStateOf(8.dp) }

            LaunchedEffect(maxWidth) {
                itemColumns = floor((maxWidth - itemMinSpace) / (itemWidth + itemMinSpace)).toInt()
                itemSpace = (maxWidth - itemWidth * itemColumns) / (itemColumns + 1)
            }

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {

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
                            selected = true,
                            onClick = { /*TODO*/ },
                            label = { Text(text = library) }
                        )
                    }
                    Box(
                        modifier = Modifier
                            .width(1.dp)
                            .fillMaxHeight()
                            .background(
                                color = MaterialTheme.colorScheme.outlineVariant,
                                shape = CircleShape
                            )
                    )
                    IconData.typeList.forEachIndexed { index, type ->
                        FilterChip(
                            selected = true,
                            onClick = { /*TODO*/ },
                            label = { Text(text = type) }
                        )
                    }
                    Spacer(modifier = Modifier)
                }

                Spacer(modifier = Modifier.height(itemSpace))

                AnimatedVisibility(
                    visible = itemColumns > 1,
                    modifier = Modifier.fillMaxWidth(),
                    enter = slideInVertically { 0 },
                    exit = ExitTransition.None
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(itemSpace)
                    ) {
                        for (rowIndex in 0..material_icons_core.size / itemColumns) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = itemSpace),
                                horizontalArrangement = Arrangement.spacedBy(
                                    space = itemSpace,
                                    alignment = Alignment.Start
                                )
                            ) {
                                for (columnIndex in 0 until (material_icons_core.size - rowIndex * itemColumns).let { if (it <= itemColumns) it else itemColumns }) {
                                    val iconData =
                                        material_icons_core[rowIndex * itemColumns + columnIndex]
                                    Icon(
                                        imageVector = iconData.filled,
                                        contentDescription = iconData.name,
                                        modifier = Modifier.size(itemWidth)
                                    )
                                }
                            }
                        }

                        for (rowIndex in 0..material_icons_extended.size / itemColumns) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = itemSpace),
                                horizontalArrangement = Arrangement.spacedBy(
                                    space = itemSpace,
                                    alignment = Alignment.Start
                                )
                            ) {
                                for (columnIndex in 0 until (material_icons_extended.size - rowIndex * itemColumns).let { if (it <= itemColumns) it else itemColumns }) {
                                    val iconData =
                                        material_icons_extended[rowIndex * itemColumns + columnIndex]
                                    Icon(
                                        imageVector = iconData.filled,
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
    scrollBehavior: TopAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
) {
    val scope = rememberCoroutineScope()

    MediumTopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name)) },
        actions = {
            IconButton(
                onClick = {
                    scope.launch {
                        scrollBehavior.state.collapse()
                    }
                }
            ) {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = stringResource(id = R.string.main_top_bar_search)
                )
            }
        },
        scrollBehavior = scrollBehavior
    )
}

@Composable
fun Fab(
    scrollState: ScrollState = rememberScrollState(),
    scrollBehavior: TopAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
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
                        scrollState.animateScrollTo(0)
                    }
                    scope2.launch {
                        scrollBehavior.state.open()
                    }
                },
                modifier = Modifier.size(48.dp),
                enabled = scrollState.value != 0 || scrollBehavior.state.collapsedFraction != 0f
            ) {
                Icon(
                    imageVector = Icons.Rounded.KeyboardArrowUp,
                    contentDescription = stringResource(id = R.string.main_fab_go_up)
                )
            }
            IconButton(
                onClick = {
                    scope.launch {
                        scrollState.animateScrollTo(scrollState.maxValue)
                    }
                    scope2.launch {
                        scrollBehavior.state.collapse()
                    }
                },
                modifier = Modifier.size(48.dp),
                enabled = scrollState.value != scrollState.maxValue || scrollBehavior.state.collapsedFraction != 1f
            ) {
                Icon(
                    imageVector = Icons.Rounded.KeyboardArrowDown,
                    contentDescription = stringResource(id = R.string.main_fab_go_down)
                )
            }
        }
    }
}