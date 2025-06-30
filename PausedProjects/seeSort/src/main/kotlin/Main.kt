import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.window.FrameWindowScope
import androidx.compose.ui.window.MenuBar
import androidx.compose.ui.window.singleWindowApplication
import ui.Content
import ui.theme.SeeSortTheme
import java.awt.Dimension


fun main() {
    val mainViewModel = MainViewModel()

    singleWindowApplication(
        state = mainViewModel.windowState,
        title = "seeSort",
        undecorated = true
    ) {
        val density = LocalDensity.current
        LaunchedEffect(density) {
            window.minimumSize = Dimension(1000, 600)
        }
        MenuBar(mainViewModel = mainViewModel)
        SeeSortTheme(darkTheme = mainViewModel.darkTheme) {
            Surface {
                Content(mainViewModel = mainViewModel)
            }
        }
    }
}


@Composable
fun FrameWindowScope.MenuBar(mainViewModel: MainViewModel = MainViewModel()) {
    MenuBar {
        Menu(
            text = "TEST"
        ) {
            Item(
                text = "TEST1",
                onClick = { /* TODO */ }
            )
        }
    }
}



