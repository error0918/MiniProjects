import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.taeyeon.common.App


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        /*state =,*/
        title = "Calculatro",
        icon = null,
        /*undecorated = false,
        transparent = false,
        resizable = false,
        enabled = false,
        focusable = false,
        alwaysOnTop = false,
        onPreviewKeyEvent = {},
        onKeyEvent = {}*/
    ) {
        App()
    }
}
