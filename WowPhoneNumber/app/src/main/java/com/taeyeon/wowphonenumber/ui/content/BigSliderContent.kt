@file:OptIn(ExperimentalPagerApi::class)

package com.taeyeon.wowphonenumber.ui.content

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Remove
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
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
    var value by rememberSaveable { mutableStateOf(mainViewModel.getPhoneNumberString()) }

    var isHelpTextShow by rememberSaveable { mutableStateOf(false) }
    var isDragging by remember { mutableStateOf(false) }
    var isDraggingToPlus by remember { mutableStateOf(true) }
    val textColor by animateColorAsState(
        targetValue = if (isDragging) {
            if (isDraggingToPlus) Color.Red.copy(alpha = 0.3f).compositeOver(MaterialTheme.colorScheme.primary)
            else Color.Blue.copy(alpha = 0.3f).compositeOver(MaterialTheme.colorScheme.primary)
        } else {
            MaterialTheme.colorScheme.onBackground
        }
    )

    LaunchedEffect(mainViewModel.phoneNumber[0].toList(), mainViewModel.phoneNumber[1].toList(), mainViewModel.phoneNumber[2].toList()) {
        value = mainViewModel.getPhoneNumberString()
    }
    LaunchedEffect(mainViewModel.pagerState.currentPage) {
        if (mainViewModel.pagerState.currentPage == Screen.values().indexOf(Screen.BigSlider)) {
            isHelpTextShow = true
            delay(5000)
            isHelpTextShow = false
        }
    }

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (indicatorIcon, numberText, helpText, slider) = createRefs()

        AnimatedVisibility(
            visible = isDragging,
            modifier = Modifier
                .constrainAs(indicatorIcon) {
                    centerHorizontallyTo(parent)
                    top.linkTo(parent.top)
                },
            enter = fadeIn(
                animationSpec = tween(250)
            ),
            exit = fadeOut(
                animationSpec = tween(250)
            )
        ) {
            Icon(
                imageVector = if (isDraggingToPlus) Icons.Rounded.Add else Icons.Rounded.Remove,
                contentDescription = null,
                tint = textColor.copy(alpha = 0.5f),
            )
        }

        Text(
            text = value,
            color = textColor,
            style = MaterialTheme.typography.displaySmall,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .constrainAs(numberText) {
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
            enter = EnterTransition.None,
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
                        onDragStart = {
                            isDragging = true
                        },
                        onDrag = { _, dragAmount ->
                            isDraggingToPlus = dragAmount.x >= 0
                            mainViewModel.changePhoneNumber(dragAmount.x.toLong())
                        },
                        onDragEnd = {
                            isDragging = false
                        },
                        onDragCancel = {
                            isDragging = false
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