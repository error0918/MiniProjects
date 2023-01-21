package com.taeyeon.wowphonenumber.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.ui.component.RoundSlider

@Composable
fun InfoDialog(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current).apply {
        isInfoDialog = true
    }
) {
    Dialog(
        onDismissRequest = { mainViewModel.isInfoDialog = false }
    ) {
        Surface(
            color = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
            tonalElevation = 6.dp,
            shape = RoundedCornerShape(28.dp),
            modifier = Modifier
                .widthIn(
                    min = 280.dp,
                    max = 560.dp
                )
        ) {
            Column(
                modifier = Modifier
                    .padding(28.dp)
            ) {
                var value1 by remember { mutableStateOf(50L) }
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    RoundSlider(
                        value = value1,
                        onValueChange = { value1 = it },
                        valueRange = 0L .. 100L,
                        modifier = Modifier
                            .fillMaxWidth()
                            //.height(50.dp)
                            .align(Alignment.Center)
                    )
                }
            }
        }
    }
}