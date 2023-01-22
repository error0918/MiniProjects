@file:OptIn(ExperimentalPagerApi::class)

package com.taeyeon.wowphonenumber.ui

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.google.accompanist.pager.ExperimentalPagerApi
import com.taeyeon.wowphonenumber.data.Screen
import com.taeyeon.wowphonenumber.model.MainViewModel
import kotlinx.coroutines.delay

@Composable
fun BigSliderContent(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    var value by rememberSaveable { mutableStateOf("") }
    var isHelpTextShow by rememberSaveable { mutableStateOf(false) }

    LaunchedEffect(mainViewModel.phoneNumber) {
        value = ""
        mainViewModel.phoneNumber.forEachIndexed { index, block ->
            block.forEach { item ->
                value += item
            }
            if (index != mainViewModel.phoneNumber.size - 1) value += " - "
        }
    }
    LaunchedEffect(mainViewModel.pagerState.currentPage) {
        if (mainViewModel.pagerState.currentPage == Screen.values().indexOf(Screen.BigSlider)) {
            delay(100)
            isHelpTextShow = true
            delay(5000)
            isHelpTextShow = false
        }
    }

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (numberRow, helpText, slider) = createRefs()

        Text(
            text = value,
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier
                .constrainAs(numberRow) {
                    centerTo(parent)
                }
        )

        AnimatedVisibility(
            visible = isHelpTextShow,
            modifier = Modifier
                .constrainAs(helpText) {
                    centerHorizontallyTo(parent)
                    bottom.linkTo(slider.top, margin = 8.dp)
                },
            enter = fadeIn(
                animationSpec = tween(250)
            ),
            exit = fadeOut(
                animationSpec = tween(250)
            )
        ) {
            Text(
                text = "이곳을 드래그하여 값을 조절하십시오"
            )
        }

        Surface(
            modifier = Modifier
                .constrainAs(slider) {
                    width = Dimension.matchParent
                    height = Dimension.percent(0.2f)
                    bottom.linkTo(parent.bottom)
                }
                .pointerInput(Unit) {
                    detectDragGestures(
                        onDrag = { change, dragAmount ->
                            //
                        }
                    )
                },
            color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f),
            shape = RoundedCornerShape(size = 16.dp),
            border = BorderStroke(
                width = 2.dp,
                color = MaterialTheme.colorScheme.primary
            ),
            content = {  }
        )
    }
}