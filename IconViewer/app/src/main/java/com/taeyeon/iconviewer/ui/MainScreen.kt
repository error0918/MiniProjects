@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)

package com.taeyeon.iconviewer.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Adb
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.taeyeon.iconviewer.R
import com.taeyeon.iconviewer.data.IconData

@Composable
fun MainScreen() {
    var material_icons_core: List<IconData> = listOf()
    var material_icons_extended: List<IconData> = listOf()

    //material_icons_core = IconData.material_icons_core; material_icons_extended = IconData.material_icons_extended

    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()

    scrollBehavior.nestedScrollConnection
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopBar(
                scrollBehavior = scrollBehavior
            )
        },
        bottomBar = { BottomBar() }
        //floatingActionButton = {},
        //floatingActionButtonPosition =
    ) { paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 36.dp),
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(
                top = 8.dp + paddingValues.calculateTopPadding(),
                start = 8.dp + paddingValues.calculateStartPadding(LocalLayoutDirection.current),
                end = 8.dp + paddingValues.calculateEndPadding(LocalLayoutDirection.current),
                bottom = 8.dp + paddingValues.calculateBottomPadding()
            ),
            verticalArrangement = Arrangement.spacedBy(
                space = 8.dp,
                alignment = Alignment.Top
            ),
            horizontalArrangement = Arrangement.spacedBy(
                space = 8.dp,
                alignment = Alignment.Start
            )
        ) {
            items(material_icons_core) { iconData ->
                Icon(
                    imageVector = iconData.filled,
                    contentDescription = iconData.name,
                    modifier = Modifier.size(36.dp)
                )
            }
            items(material_icons_extended) { iconData ->
                Icon(
                    imageVector = iconData.filled,
                    contentDescription = iconData.name,
                    modifier = Modifier.size(36.dp)
                )
            }
        }
        /*FlowRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingValues)
                .verticalScroll(state = rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(
                space = 8.dp,
                alignment = Alignment.CenterHorizontally
            )
        ) {
            IconData.material_icons_core.forEach { iconData ->
                Icon(
                    imageVector = iconData.filled,
                    contentDescription = iconData.name,
                    modifier = Modifier.size(36.dp)
                )
            }
            IconData.material_icons_extended.forEach { iconData ->
                Icon(
                    imageVector = iconData.filled,
                    contentDescription = iconData.name,
                    modifier = Modifier.size(36.dp)
                )
            }
        }*/
    }
}

@Composable
fun TopBar(
    scrollBehavior: TopAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
) {
    MediumTopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name)) },
        scrollBehavior = scrollBehavior
    )
}

@Composable
fun BottomBar() {}