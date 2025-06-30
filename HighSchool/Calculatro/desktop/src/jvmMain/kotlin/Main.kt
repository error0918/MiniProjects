import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.window.WindowDraggableArea
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Fullscreen
import androidx.compose.material.icons.rounded.Minimize
import androidx.compose.material.icons.rounded.Window
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.taeyeon.common.App
import java.awt.Dimension


@OptIn(ExperimentalMaterial3Api::class)
fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(
            size = DpSize(
                width = 400.dp,
                height = 600.dp
            )
        ),
        title = "Calculatro",
        icon = null,
        undecorated = true,
        /*transparent = false,
        onPreviewKeyEvent = {},
        onKeyEvent = {}*/
    ) {
        window.minimumSize = Dimension(
            LocalDensity.current.run { 300.dp.toPx().toInt() },
            LocalDensity.current.run { 500.dp.toPx().toInt() }
        )

        Column(
            modifier = Modifier
                .border(
                    width = 2.dp,
                    color = MaterialTheme.colorScheme.onSurface
                )
                .padding(2.dp)
        ) {
            WindowDraggableArea {
                TopAppBar(
                    title = { Text(text = "Calculatro") },
                    actions = {
                        IconButton(
                            onClick = {
                                window.isMinimized = true
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Minimize,
                                tint = LocalContentColor.current.copy(alpha = 0.5f),
                                contentDescription = "최소화"
                            )
                        }
                        IconButton(
                            onClick = {
                                if (window.placement == WindowPlacement.Fullscreen) window.placement = WindowPlacement.Floating
                                else window.placement = WindowPlacement.Fullscreen
                            }
                        ) {
                            Icon(
                                imageVector = if (window.placement == WindowPlacement.Fullscreen) Icons.Rounded.Window else Icons.Rounded.Fullscreen,
                                tint = LocalContentColor.current.copy(alpha = 0.5f),
                                contentDescription = if (window.placement == WindowPlacement.Fullscreen) "플로팅 화면" else "전체 화면"
                            )
                        }
                        IconButton(
                            onClick = {
                                exitApplication()
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Close,
                                tint = LocalContentColor.current.copy(alpha = 0.5f),
                                contentDescription = "닫기"
                            )
                        }
                    },
                    colors = TopAppBarDefaults.smallTopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                        navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                        actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                )
            }
            App()
        }
    }
}
