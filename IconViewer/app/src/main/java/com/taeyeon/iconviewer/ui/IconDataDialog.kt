package com.taeyeon.iconviewer.ui

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.DialogProperties
import com.taeyeon.iconviewer.IconViewerViewModel
import com.taeyeon.iconviewer.data.IconData
import com.taeyeon.iconviewer.data.IconType
import com.taeyeon.iconviewer.rememberIconViewerState
import kotlinx.coroutines.delay

@Composable
fun IconDataDialog(
    viewModel: IconViewerViewModel = IconViewerViewModel(state = rememberIconViewerState())
) {
    val clipboardManager = LocalClipboardManager.current
    val context = LocalContext.current

    if (viewModel.focusedIconData != null) {
        var library by remember { mutableStateOf("") }
        var iconType by remember { mutableStateOf(IconType.Filled) }

        LaunchedEffect(viewModel.focusedIconData) {
            library = if (IconData.core.contains(viewModel.focusedIconData)) "Core"
            else if (IconData.extended.contains(viewModel.focusedIconData)) "Extended"
            else "undefined"
        }
        LaunchedEffect(iconType) {
            delay(2000)
            iconType = when (iconType) {
                IconType.Filled -> IconType.Outlined
                IconType.Outlined -> IconType.Rounded
                IconType.Rounded -> IconType.Sharp
                IconType.Sharp -> IconType.TwoTone
                IconType.TwoTone -> IconType.Filled
            }
        }

        AlertDialog(
            onDismissRequest = { viewModel.focusedIconData = null },
            title = { Text(text = "아이콘 정보: " + viewModel.focusedIconData?.name) },
            text = {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = if (viewModel.focusedIconData != null) iconType.get(viewModel.focusedIconData!!) else Icons.Default.Image,
                        contentDescription = viewModel.focusedIconData?.name,
                        modifier = Modifier
                            .size(150.dp)
                            .background(
                                color = MaterialTheme.colorScheme.surfaceColorAtElevation(elevation = 9.dp),
                                shape = RoundedCornerShape(12.dp)
                            )
                            .padding(12.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconType.values().forEach { iconType ->
                            Column(
                                modifier = Modifier.weight(1f),
                                verticalArrangement = Arrangement.spacedBy(2.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Icon(
                                    imageVector = if (viewModel.focusedIconData != null) iconType.get(viewModel.focusedIconData!!) else Icons.Default.Image,
                                    contentDescription = viewModel.focusedIconData?.name,
                                    modifier = Modifier.size(30.dp)
                                )
                                Text(
                                    text = iconType.name,
                                    fontSize = 10.sp
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    listOf(
                        "라이브러리" to when (library) {
                            "Core" -> "material-icons-core"
                            "Extended" -> "material-icons-extended"
                            else -> "undefined"
                        },
                        "클래스" to "Icons.${iconType.name}.${viewModel.focusedIconData?.name}",
                        "주소" to "androidx.compose.material.icons.${iconType.name.lowercase()}.${viewModel.focusedIconData?.name}"
                    ).forEach { text ->
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(2.dp)
                                .pointerInput(Unit) {
                                    detectTapGestures(
                                        onLongPress = {
                                            clipboardManager.setText(AnnotatedString(text.second))
                                            Toast
                                                .makeText(
                                                    context,
                                                    "${text.second}(이)가 복사되었습니다.",
                                                    Toast.LENGTH_SHORT
                                                )
                                                .show()
                                        }
                                    )
                                }
                        ) {
                            Text(
                                text = text.first,
                                fontWeight = FontWeight.Bold,
                                fontSize = 10.sp,
                                modifier = Modifier.align(Alignment.TopStart)
                            )
                            Text(
                                text = text.second,
                                textAlign = TextAlign.End,
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .padding(start = 32.dp)
                                    .align(Alignment.TopEnd)
                            )
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(
                    onClick = { viewModel.focusedIconData = null }
                ) {
                    Text(text = "닫기")
                }
            },
            properties = DialogProperties(
                dismissOnBackPress = true,
                dismissOnClickOutside = true
            )
        )
    }
}