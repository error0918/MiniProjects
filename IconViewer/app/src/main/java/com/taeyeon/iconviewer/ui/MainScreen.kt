@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.iconviewer.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import com.taeyeon.iconviewer.util.divideList

@Composable
fun MainScreen(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    val itemWidth = 54.dp
    var itemColumns by remember { mutableStateOf(-1) }
    var itemSpace by remember { mutableStateOf(8.dp) }

    IconDataDialog(viewModel = viewModel)
    InfoDialog(viewModel = viewModel)
    LicenseDialog(viewModel = viewModel)

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
            LaunchedEffect(maxWidth) {
                val itemMinSpace = 4.dp
                itemColumns = ((maxWidth - itemMinSpace) / (itemWidth + itemMinSpace)).toInt()
                itemSpace = (maxWidth - itemWidth * itemColumns) / (itemColumns + 1)
            }

            if (itemColumns > 0) {
                var core by remember { mutableStateOf(IconData.core.divideList(itemColumns)) }
                var extended by remember { mutableStateOf(IconData.extended.divideList(itemColumns)) }

                LaunchedEffect(viewModel.isSearching, viewModel.searchKeyword) {
                    if (viewModel.isSearching) {
                        core = IconData.core.filter { it.name.lowercase().indexOf(viewModel.searchKeyword.lowercase().replace(" ", "")) > -1 }.divideList(itemColumns)
                        extended = IconData.extended.filter { it.name.lowercase().indexOf(viewModel.searchKeyword.lowercase().replace(" ", "")) > -1 }.divideList(itemColumns)
                    } else {
                        core = IconData.core.divideList(itemColumns)
                        extended = IconData.extended.divideList(itemColumns)
                    }
                }

                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    state = viewModel.state.lazyListState,
                    verticalArrangement = Arrangement.spacedBy(itemSpace)
                ) {

                    if (viewModel.libraryIndex == 0 && core.isNotEmpty()) {
                        item {
                            Column {
                                Text(
                                    text = stringResource(id = R.string.main_core),
                                    style = MaterialTheme.typography.titleMedium,
                                    modifier = Modifier.padding(
                                        vertical = 8.dp,
                                        horizontal = 16.dp
                                    )
                                )
                                Divider(Modifier.fillMaxWidth())
                            }
                        }
                    }
                    if (viewModel.libraryIndex == 0 || viewModel.libraryIndex == 1) {
                        items(core) { iconDataList ->
                            Row(
                                modifier = Modifier.padding(horizontal = itemSpace),
                                horizontalArrangement = Arrangement.spacedBy(space = itemSpace),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                iconDataList.forEach { iconData ->
                                    IconWidget(
                                        iconData = iconData,
                                        iconType = viewModel.iconType,
                                        width = itemWidth,
                                        onClick = { viewModel.focusedIconData = iconData }
                                    )
                                }
                            }
                        }
                    }

                    if (viewModel.libraryIndex == 0 && extended.isNotEmpty()) {
                        item {
                            Column {
                                Divider(Modifier.fillMaxWidth())
                                Text(
                                    text = stringResource(id = R.string.main_extended),
                                    style = MaterialTheme.typography.titleMedium,
                                    modifier = Modifier.padding(
                                        vertical = 8.dp,
                                        horizontal = 16.dp
                                    )
                                )
                                Divider(Modifier.fillMaxWidth())
                            }
                        }
                    }
                    if (viewModel.libraryIndex == 0 || viewModel.libraryIndex == 2) {
                        items(extended) { iconDataList ->
                            Row(
                                modifier = Modifier.padding(horizontal = itemSpace),
                                horizontalArrangement = Arrangement.spacedBy(space = itemSpace),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                iconDataList.forEach { iconData ->
                                    IconWidget(
                                        iconData = iconData,
                                        iconType = viewModel.iconType,
                                        width = itemWidth,
                                        onClick = { viewModel.focusedIconData = iconData }
                                    )
                                }
                            }
                        }
                    }

                }
            }
            ScrollController(viewModel = viewModel)
        }
    }
}