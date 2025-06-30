import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.WindowScope
import androidx.compose.ui.window.singleWindowApplication
import ui.Content
import ui.ControlBar
import ui.theme.ReelGameTheme


@Composable
fun WindowScope.App(mainViewModel: MainViewModel = MainViewModel()) {
    Column(modifier = Modifier.fillMaxSize()) {
        ControlBar(mainViewModel = mainViewModel)
        Content(mainViewModel = mainViewModel)
    }
}


fun main() {
    val mainViewModel = MainViewModel()

    singleWindowApplication(
        state = mainViewModel.windowState,
        title = "Reel Game",
        undecorated = true,
        resizable = false,
        alwaysOnTop = true,
        transparent = true
    ) {
        ReelGameTheme {
            App(mainViewModel = mainViewModel)
        }
    }
}
