package com.taeyeon.wowphonenumber.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material3.Divider
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.taeyeon.wowphonenumber.model.MainViewModel

@Preview
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
                var boxHeight by remember { mutableStateOf(0) }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .onSizeChanged { boxHeight = it.height }
                ) {
                    Text(
                        text = "앱 정보",
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
                            width = 2.dp,
                            color = LocalContentColor.current
                        )
                    ) {
                        Image(
                            imageVector = Icons.Default.Image,
                            contentDescription = null // TODO
                        )
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
                            Text(text = "닫기")
                        }
                    }
                }
            }
        }
    }
}