@file:OptIn(
    ExperimentalLayoutApi::class,
    ExperimentalMaterial3Api::class
)

package com.taeyeon.iconviewer.ui

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
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
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.pow

@Composable
fun MainScreen() {
    var material_icons_core: List<IconData> = listOf()
    var material_icons_extended: List<IconData> = listOf()

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
            var itemSpace by remember { mutableStateOf(8.dp) } // Min: 8.dp

            LaunchedEffect(maxWidth) {

            }

            FlowRow(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.spacedBy(
                    space = 8.dp,
                    alignment = Alignment.CenterHorizontally
                )
            ) {
                material_icons_core.forEach { iconData ->
                    Icon(
                        imageVector = iconData.filled,
                        contentDescription = iconData.name,
                        modifier = Modifier.size(36.dp)
                    )
                }
                material_icons_extended.forEach { iconData ->
                    Icon(
                        imageVector = iconData.filled,
                        contentDescription = iconData.name,
                        modifier = Modifier.size(36.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun TopBar(
    scrollBehavior: TopAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
) {
    var animation by remember { mutableStateOf(false) }

    LaunchedEffect(animation) {
        if (animation) {
            val step = (scrollBehavior.state.heightOffsetLimit - scrollBehavior.state.heightOffset) / 10f
            repeat(10) {
                scrollBehavior.state.heightOffset += step
                delay(5)
            }
            animation = false
        }
    }

    MediumTopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name)) },
        actions = {
            IconButton(
                onClick = {
                    animation = true
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
    var animation by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(animation) {
        animation?.let {
            val step =
                if (animation == "top") -scrollBehavior.state.heightOffset * 0.1f
                else (scrollBehavior.state.heightOffsetLimit - scrollBehavior.state.heightOffset) * 0.1f
            repeat(10) {
                scrollBehavior.state.heightOffset += step
                delay(5)
            }
            animation = null
        }
    }

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
                    animation = "top"
                    scope.launch {
                        scrollState.animateScrollTo(0)
                    }
                },
                modifier = Modifier.size(48.dp),
                enabled = scrollState.value != 0
            ) {
                Icon(
                    imageVector = Icons.Rounded.KeyboardArrowUp,
                    contentDescription = stringResource(id = R.string.main_fab_go_up)
                )
            }
            IconButton(
                onClick = {
                    animation = "bottom"
                    scope.launch {
                        scrollState.animateScrollTo(scrollState.maxValue)
                    }
                },
                modifier = Modifier.size(48.dp),
                enabled = scrollState.value != scrollState.maxValue
            ) {
                Icon(
                    imageVector = Icons.Rounded.KeyboardArrowDown,
                    contentDescription = stringResource(id = R.string.main_fab_go_down)
                )
            }
        }
    }
}