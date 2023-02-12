@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.iconviewer.ui

import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.taeyeon.iconviewer.IconViewerViewModel
import com.taeyeon.iconviewer.R
import com.taeyeon.iconviewer.rememberIconViewerState
import com.taeyeon.iconviewer.util.collapse
import com.taeyeon.iconviewer.util.open
import kotlinx.coroutines.launch

@Composable
fun Fab(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    val scope = rememberCoroutineScope()
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
        tonalElevation = 6.dp,
        shadowElevation = 6.dp
    ) {
        Column(
            modifier = Modifier.width(48.dp)
        ) {
            IconButton(
                onClick = {
                    scope.launch {
                        viewModel.state.topAppBarScrollBehavior.state.open()
                        viewModel.state.bodyScrollState.animateScrollTo(
                            value = 0,
                            animationSpec = tween(1000)
                        )
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
                        viewModel.state.topAppBarScrollBehavior.state.collapse()
                        viewModel.state.bodyScrollState.animateScrollTo(
                            value = viewModel.state.bodyScrollState.maxValue,
                            animationSpec = tween(1000)
                        )
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