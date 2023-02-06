@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.iconviewer

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable

@Composable
fun rememberIconViewerState() = IconViewerState(
    topAppBarScrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(),
    bodyScrollState = rememberScrollState()
)

data class IconViewerState(
    val topAppBarScrollBehavior: TopAppBarScrollBehavior,
    val bodyScrollState: ScrollState
)