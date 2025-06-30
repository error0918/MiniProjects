@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.iconviewer

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable

@Composable
fun rememberIconViewerState() = IconViewerState(
    topAppBarScrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(),
    lazyListState = rememberLazyListState()
)

data class IconViewerState(
    val topAppBarScrollBehavior: TopAppBarScrollBehavior,
    val lazyListState: LazyListState
)