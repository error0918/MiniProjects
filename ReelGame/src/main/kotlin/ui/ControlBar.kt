package ui

import MainViewModel
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.window.WindowDraggableArea
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowScope
import ui.theme.Colors
import kotlin.system.exitProcess

@Composable
fun WindowScope.ControlBar(mainViewModel: MainViewModel = MainViewModel()) {
    WindowDraggableArea {
        Surface(
            color = Colors.menuSurface,
            contentColor = Colors.menuContent
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(75.dp)
                    .padding(15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Text(
                    text = "Reel Game",
                    modifier = Modifier.padding(top = 5.dp),
                    style = MaterialTheme.typography.h4,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.weight(1f))

                // 재생/멈춤
                MenuButton(
                    color = if (mainViewModel.isDebug) Colors.debugOnMenuButton else Colors.debugOffMenuButton,
                    onClick = { mainViewModel.isDebug = !mainViewModel.isDebug }
                )

                // 재생/멈춤
                MenuButton(
                    color = if (mainViewModel.isRunning) Colors.playMenuButton else Colors.stopMenuButton,
                    onClick = { mainViewModel.isRunning = !mainViewModel.isRunning }
                )

                // 최소화
                MenuButton(
                    color = Colors.minimizeMenuButton,
                    onClick = { mainViewModel.windowState.isMinimized = true }
                )

                // 끄기
                MenuButton(
                    color = Colors.exitMenuButton,
                    onClick = { exitProcess(0) }
                )
            }
        }
    }
}


@Composable
private fun MenuButton(
    color: Color,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier.size(45.dp)
            .background(color)
            .pointerInput(Unit) {
                detectTapGestures {
                    onClick()
                }
            }
    )
}