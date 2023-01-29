@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalAnimationApi::class)

package com.taeyeon.wowphonenumber.ui

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.taeyeon.wowphonenumber.R
import com.taeyeon.wowphonenumber.model.MainViewModel
import java.util.Random

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
                val hapticFeedback = LocalHapticFeedback.current
                val easterEggMessages = remember {
                    mutableStateListOf(
                        "뻘짓!", "생각보다 만드는 데 시간 많이 걸렸어", "집 가고 싶다~ 😵", "(～￣▽￣)～", "＼(((￣(￣(￣▽￣)￣)￣)))／", "이스터 에그!!"
                    )
                }

                var boxHeight by remember { mutableStateOf(0) }
                var easterEgg by remember { mutableStateOf(false) }
                var easterEggIndex by remember { mutableStateOf(0) }

                LaunchedEffect(easterEgg) {
                    if (easterEgg)
                        easterEggIndex = Random().nextInt(easterEggMessages.size)
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .onSizeChanged { boxHeight = it.height }
                ) {
                    Text(
                        text = stringResource(id = R.string.info_dialog_app_info),
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier
                            .align(Alignment.CenterStart)
                            .padding(end = LocalDensity.current.run { boxHeight.toDp() })
                    )
                    Surface(
                        modifier = Modifier
                            .size(LocalDensity.current.run { boxHeight.toDp() })
                            .align(Alignment.CenterEnd),
                        shape = CircleShape,
                        border = BorderStroke(
                            width = 1.5f.dp,
                            color = LocalContentColor.current
                        ),
                        onClick = {
                            // Easter Egg
                            hapticFeedback.performHapticFeedback(HapticFeedbackType.LongPress)
                            easterEgg = !easterEgg
                        }
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_launcher),
                            contentDescription = stringResource(id = R.string.app_name)
                        )
                    }
                    androidx.compose.animation.AnimatedVisibility(
                        visible = easterEgg,
                        modifier = Modifier
                            .height(LocalDensity.current.run { boxHeight.toDp() })
                            .padding(end = LocalDensity.current.run { boxHeight.toDp() + 8.dp })
                            .align(Alignment.CenterEnd),
                        enter = slideInHorizontally { it / 2 } + scaleIn() + fadeIn(),
                        exit = slideOutHorizontally { it / 2 } + scaleOut() + fadeOut()
                    ) {// Easter Egg
                        Surface(
                            shape = RoundedCornerShape(
                                topStart = 6.dp,
                                topEnd = 0.dp,
                                bottomStart = 6.dp,
                                bottomEnd = 6.dp,
                            ),
                            color = Color.DarkGray.copy(alpha = 0.75f),
                            contentColor = Color.White,
                            modifier = Modifier.fillMaxHeight()
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(6.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = easterEggMessages[easterEggIndex],
                                    fontWeight = FontWeight.Light,
                                    fontSize = MaterialTheme.typography.headlineSmall.fontSize / 1.75f
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 4.dp)
                )

                // TODO: Body

                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp)
                )

                Spacer(modifier = Modifier.height(24.dp))

                Row(
                    modifier = Modifier.align(Alignment.End),
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp)
                ) {
                    CompositionLocalProvider(LocalContentColor provides MaterialTheme.colorScheme.primary) {
                        TextButton(
                            onClick = { /* TODO */ }
                        ) {
                            Text(text = "오픈소스 라이선스")
                        }
                        TextButton(
                            onClick = { mainViewModel.isInfoDialog = false }
                        ) {
                            Text(text = stringResource(id = R.string.info_dialog_close))
                        }
                    }
                }
            }
        }
    }
}