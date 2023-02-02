@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.iconviewer.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.taeyeon.iconviewer.R

@Composable
fun MainScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar() },
        bottomBar = { BottomBar() },
        //floatingActionButton = {},
        //floatingActionButtonPosition =
    ) { paddingValues ->  
        
    }
}

@Composable
fun TopBar() {
    MediumTopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name)) }
    )
}

@Composable
fun BottomBar() {}