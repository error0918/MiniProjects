package com.taeyeon.common

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

actual fun getPlatform() = Platform.ANDROID


@OptIn(ExperimentalMaterial3Api::class)
@Composable
actual fun TopBar() {
    TopAppBar(
        title = { Text(text = "Calculatro") },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    )
}