package ui

import MainViewModel
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.window.WindowDraggableArea
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowScope
import kotlin.system.exitProcess

@Composable
fun WindowScope.ControlBar(mainViewModel: MainViewModel = MainViewModel()) {
    WindowDraggableArea {
        Surface(
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.8f).compositeOver(MaterialTheme.colors.surface),
            contentColor = MaterialTheme.colors.surface
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Text(
                    text = "seeSort",
                    modifier = Modifier.padding(start = 10.dp, top = 3.dp),
                    style = MaterialTheme.typography.h2,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.weight(1f))

                // 디버그 창
                MenuButton(
                    color = if (mainViewModel.darkTheme) Color(0xFFFF0080) else Color(0xFFFF5580),
                    contentColor = LocalContentColor.current,
                    icon = if (mainViewModel.debugMode) Icons.AutoMirrored.Filled.KeyboardArrowRight else Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                    contentDescription = "Debug",
                    onClick = { mainViewModel.debugMode = !mainViewModel.debugMode }
                )
                // 다크 모드
                MenuButton(
                    color = if (mainViewModel.darkTheme) Color(0xFFFF7F3E) else Color(0xFF26355D),
                    contentColor = LocalContentColor.current,
                    icon = Icons.Default.PlayArrow,
                    contentDescription = "Dark Mode",
                    onClick = { mainViewModel.darkTheme = !mainViewModel.darkTheme }
                )
                // 최소화
                MenuButton(
                    color = if (mainViewModel.darkTheme) Color(0xFFCFFBF00) else Color(0xFFA67B5B),
                    contentColor = LocalContentColor.current,
                    icon = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Minimize",
                    onClick = { mainViewModel.windowState.isMinimized = true }
                )
                // 최대화
                MenuButton(
                    color = if (mainViewModel.darkTheme) Color(0xFF0A6847) else Color(0xFF40A578),
                    contentColor = LocalContentColor.current,
                    icon = Icons.Default.Add,
                    contentDescription = "FullScreen",
                    onClick = {
                        if (mainViewModel.windowState.placement != WindowPlacement.Maximized) {
                            mainViewModel.windowState.placement = WindowPlacement.Maximized
                        } else {
                            mainViewModel.windowState.placement = WindowPlacement.Floating
                        }
                    }
                )
                // 닫기
                MenuButton(
                    color = if (mainViewModel.darkTheme) Color(0xFFC80036) else Color(0xFFFF6969),
                    contentColor = LocalContentColor.current,
                    icon = Icons.Default.Close,
                    contentDescription = "Close",
                    onClick = { exitProcess(0) }
                )
            }
        }
    }
}


@Composable
fun MenuButton(color: Color, contentColor: Color, icon: ImageVector, contentDescription: String, onClick: () -> Unit) {
    Surface(
        modifier = Modifier
            .size(70.dp)
            .focusable()
            .pointerInput(Unit) {
                detectTapGestures { onClick() }
            },
        color = color,
        contentColor = contentColor
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            modifier = Modifier.fillMaxSize()
        )
    }
}
