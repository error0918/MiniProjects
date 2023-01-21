package com.taeyeon.wowphonenumber.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.ui.component.RoundSlider

@Composable
fun BigSliderContent(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    /*ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (numberRow, slider) = createRefs()

        // TODO
    }*/
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