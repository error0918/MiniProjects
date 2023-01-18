@file:Suppress("OPT_IN_IS_NOT_ENABLED")
@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.wowphonenumber.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.taeyeon.wowphonenumber.R
import com.taeyeon.wowphonenumber.model.MainViewModel

@Composable
fun MainContent(
    mainViewModel: MainViewModel = MainViewModel()
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar() }
    ) {

    }
}

@Composable
fun TopBar() {
    LargeTopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name)) }
    )
}