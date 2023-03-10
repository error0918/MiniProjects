@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.iconviewer.ui

import android.content.Intent
import android.net.Uri
import android.provider.Settings
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.Source
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import com.taeyeon.iconviewer.IconViewerViewModel
import com.taeyeon.iconviewer.R
import com.taeyeon.iconviewer.rememberIconViewerState

@Composable
fun InfoDialog(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    if (viewModel.isInfoShowing) {
        AlertDialog(
            onDismissRequest = { viewModel.isInfoShowing = false },
            title = {
                var height by remember { mutableStateOf(0) }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .onSizeChanged { height = it.height }
                ) {
                    Text(
                        text = stringResource(id = R.string.info_dialog_app_info),
                        maxLines = 1,
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.CenterStart)
                            .padding(end = LocalDensity.current.run { height.toDp() } + 4.dp)
                    )
                    Surface(
                        modifier = Modifier
                            .size(LocalDensity.current.run { height.toDp() })
                            .align(Alignment.CenterEnd),
                        color = Color.Transparent,
                        shape = CircleShape,
                        border = BorderStroke(
                            width = 2.dp,
                            color = LocalContentColor.current
                        )
                    ) {
                        Image(
                            imageVector = Icons.Rounded.Info,
                            contentDescription = stringResource(id = R.string.app_name),
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
            },
            text = {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = stringResource(id = R.string.info_dialog_app_explanation)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        color = MaterialTheme.colorScheme.surfaceColorAtElevation(elevation = 15.dp),
                        shape = RoundedCornerShape(size = 8.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                            verticalArrangement = Arrangement.spacedBy(space = 4.dp)
                        ) {
                            val hapticFeedback = LocalHapticFeedback.current
                            val context = LocalContext.current
                            listOf(
                                Triple(
                                    Icons.Rounded.Settings,
                                    stringResource(id = R.string.info_dialog_action_system_settings)
                                ) {
                                    context.startActivity(
                                        Intent(
                                            Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
                                            Uri.parse("package:${context.packageName}")
                                        ).apply {
                                            addCategory(Intent.CATEGORY_DEFAULT)
                                            flags = Intent.FLAG_ACTIVITY_NEW_TASK
                                        }
                                    )
                                },
                                Triple(
                                    Icons.Rounded.Source,
                                    stringResource(id = R.string.info_dialog_action_source)
                                ) {
                                    context.startActivity(
                                        Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("https://github.com/error0918/MiniProjects/tree/main/IconViewer")
                                        )
                                    )
                                },
                                Triple(
                                    Icons.Rounded.Email,
                                    stringResource(id = R.string.info_dialog_action_email)
                                ) {
                                    context.startActivity(
                                        Intent(Intent.ACTION_SEND).apply {
                                            type = "plain/text"
                                            putExtra(Intent.EXTRA_EMAIL, arrayOf("developer.taeyeon@gmail.com"))
                                            putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.app_name))
                                        }
                                    )
                                },
                                Triple(
                                    Icons.Rounded.Info,
                                    stringResource(id = R.string.info_dialog_action_license)
                                ) {
                                    viewModel.isLicenseShowing = true
                                }
                            ).forEach { action ->
                                Surface(
                                    modifier = Modifier.fillMaxWidth(),
                                    color = Color.Transparent,
                                    contentColor = LocalContentColor.current,
                                    shape = RoundedCornerShape(size = 8.dp),
                                    onClick = {
                                        hapticFeedback.performHapticFeedback(HapticFeedbackType.LongPress)
                                        action.third()
                                    }
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(8.dp),
                                        horizontalArrangement = Arrangement.spacedBy(
                                            space = 8.dp,
                                            alignment = Alignment.Start
                                        ),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(
                                            imageVector = action.first,
                                            contentDescription = action.second,
                                            modifier = Modifier.size(16.dp)
                                        )
                                        Text(
                                            text = action.second,
                                            style = MaterialTheme.typography.titleMedium
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(
                    onClick = { viewModel.isInfoShowing = false }
                ) {
                    Text(text = stringResource(id = R.string.info_dialog_dismiss))
                }
            },
            properties = DialogProperties(
                dismissOnBackPress = true,
                dismissOnClickOutside = false
            )
        )
    }
}