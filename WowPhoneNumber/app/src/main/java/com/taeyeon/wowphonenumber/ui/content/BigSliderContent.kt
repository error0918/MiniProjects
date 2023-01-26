@file:OptIn(ExperimentalPagerApi::class)

package com.taeyeon.wowphonenumber.ui.content

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Remove
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.google.accompanist.pager.ExperimentalPagerApi
import com.taeyeon.wowphonenumber.R
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
    var touching by remember { mutableStateOf<String?>(null) }

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
    LaunchedEffect(touching) {
        while (touching == "-") {
            mainViewModel.changePhoneNumber(-1_0000L)
            delay(1)
        }
        while (touching == "+") {
            mainViewModel.changePhoneNumber(1_0000L)
            delay(1)
        }
    }

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (indicatorIcon, changeRow, numberText, helpText, slider) = createRefs()

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
                contentDescription = if (isDraggingToPlus) stringResource(id = R.string.big_slider_content_plus) else stringResource(id = R.string.big_slider_content_minus),
                tint = textColor.copy(alpha = 0.5f),
            )
        }

        Row(
            modifier = Modifier
                .constrainAs(changeRow) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                },
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(
                        color = MaterialTheme.colorScheme.primaryContainer,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onPress = {
                                touching = "-"
                                tryAwaitRelease()
                                touching = null
                            }
                        )
                    },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Rounded.Remove,
                    contentDescription = stringResource(id = R.string.big_slider_content_minus),
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(
                        color = MaterialTheme.colorScheme.primaryContainer,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onPress = {
                                touching = "+"
                                tryAwaitRelease()
                                touching = null
                            }
                        )
                    },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Rounded.Add,
                    contentDescription = stringResource(id = R.string.big_slider_content_plus),
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
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
                text = stringResource(id = R.string.big_slider_content_drag_message)
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