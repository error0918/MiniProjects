@file:OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalAnimationApi::class, ExperimentalFoundationApi::class
)

package com.taeyeon.iconviewer.ui

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material.icons.sharp.AccountBox
import androidx.compose.material.icons.sharp.Add
import androidx.compose.material.icons.twotone.AccountBox
import androidx.compose.material.icons.twotone.Add
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import com.taeyeon.iconviewer.IconViewerViewModel
import com.taeyeon.iconviewer.R
import com.taeyeon.iconviewer.data.IconData
import com.taeyeon.iconviewer.rememberIconViewerState
import com.taeyeon.iconviewer.util.collapse
import com.taeyeon.iconviewer.util.open
import kotlinx.coroutines.launch
import kotlin.math.ceil
import kotlin.math.floor

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
        ) {
            val itemWidth = 48.dp
            val itemMinSpace = 4.dp
            var itemColumns by remember { mutableStateOf(-1) }
            var itemSpace by remember { mutableStateOf(8.dp) }

            LaunchedEffect(maxWidth) {
                itemColumns = floor((maxWidth - itemMinSpace) / (itemWidth + itemMinSpace)).toInt()
                itemSpace = (maxWidth - itemWidth * itemColumns) / (itemColumns + 1)
            }

            if (itemColumns > 0) {
                val coreSubListSize = ceil(core.size.toFloat() / itemColumns).toInt()
                val extendedSubListSize = ceil(extended.size.toFloat() / itemColumns).toInt()
                val coreSubList = List(coreSubListSize) { index ->
                    if (index == coreSubListSize - 1) core.subList(itemColumns * index, core.size - 1)
                    else core.subList(itemColumns * index, itemColumns * (index + 1))
                }
                val extendedSubList = List(extendedSubListSize) { index ->
                    if (index == extendedSubListSize - 1) extended.subList(itemColumns * index, extended.size - 1)
                    else extended.subList(itemColumns * index, itemColumns * (index + 1))
                }

                val data = listOf(
                    stringResource(id = R.string.main_core) to coreSubList,
                    stringResource(id = R.string.main_extended) to extendedSubList
                )

                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(itemSpace)
                ) {
                    if (viewModel.libraryIndex == 0) {
                        data.forEach { library ->
                            stickyHeader {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .background(MaterialTheme.colorScheme.surface)
                                ) {
                                    Text(
                                        text = library.first,
                                        style = MaterialTheme.typography.titleMedium,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(8.dp)
                                    )
                                    Divider(modifier = Modifier.fillMaxWidth())
                                }
                            }

                            items(library.second) { iconDataList ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = itemSpace),
                                    horizontalArrangement = Arrangement.spacedBy(
                                        space = itemSpace,
                                        alignment = Alignment.Start
                                    ),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    iconDataList.forEach { iconData ->
                                        IconWidget(
                                            iconData = iconData,
                                            iconType = viewModel.iconType,
                                            width = itemWidth,
                                            onClick = { /* TODO */ }
                                        )
                                    }
                                }
                            }
                        }
                    }

                }
            }

            // Old
            /*
            if (itemColumns > 0) {
                Column(
                    modifier = Modifier.verticalScroll(state = viewModel.state.bodyScrollState)
                ) {

                    AnimatedVisibility(
                        visible = itemColumns > 1 && (viewModel.libraryIndex == 0 || viewModel.libraryIndex == 1)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(itemSpace)
                        ) {
                            Text(
                                text = stringResource(id = R.string.main_core),
                                style = MaterialTheme.typography.titleMedium,
                                modifier = Modifier.padding(8.dp)
                            )

                            Divider(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 4.dp)
                            )

                            for (rowIndex in 0..core.size / itemColumns) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = itemSpace),
                                    horizontalArrangement = Arrangement.spacedBy(
                                        space = itemSpace,
                                        alignment = Alignment.Start
                                    ),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    for (columnIndex in 0 until (core.size - rowIndex * itemColumns).let { if (it <= itemColumns) it else itemColumns }) {
                                        IconWidget(
                                            iconData = core[rowIndex * itemColumns + columnIndex],
                                            iconType = viewModel.iconType,
                                            width = itemWidth,
                                            onClick = { /* TODO */ }
                                        )
                                    }
                                }
                            }
                        }
                    }

                    if (viewModel.libraryIndex == 0) {
                        Divider(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp)
                        )
                    }

                    AnimatedVisibility(
                        visible = itemColumns > 1 && (viewModel.libraryIndex == 0 || viewModel.libraryIndex == 2)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(itemSpace)
                        ) {
                            Text(
                                text = stringResource(id = R.string.main_extended),
                                style = MaterialTheme.typography.titleMedium,
                                modifier = Modifier.padding(8.dp)
                            )

                            Divider(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 4.dp)
                            )

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
                                        IconWidget(
                                            iconData = extended[rowIndex * itemColumns + columnIndex],
                                            iconType = viewModel.iconType,
                                            width = itemWidth,
                                            onClick = { /* TODO */ }
                                        )
                                    }
                                }
                            }
                        }
                    }

                }
            }
             */

            ScrollController(viewModel = viewModel)
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