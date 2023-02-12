@file:OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalAnimationApi::class
)

package com.taeyeon.iconviewer.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
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
    val itemWidth = 48.dp
    var itemColumns by remember { mutableStateOf(-1) }
    var itemSpace by remember { mutableStateOf(8.dp) }

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
                val core = IconData.core.divideList(itemColumns)
                val extended = IconData.extended.divideList(itemColumns)

                Column(
                    modifier = Modifier.verticalScroll(state = viewModel.state.bodyScrollState)
                ) {

                    AnimatedVisibility(
                        visible = viewModel.libraryIndex == 0 || viewModel.libraryIndex == 1
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

                            core.forEach { iconDataList ->
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
                        visible = viewModel.libraryIndex == 0 || viewModel.libraryIndex == 2
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

                            extended.forEach { iconDataList ->
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
                                            onClick = { /* TODO */ }
                                        )
                                    }
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