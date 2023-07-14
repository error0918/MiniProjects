import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.window.WindowDraggableArea
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.*
import kotlinx.coroutines.delay
import kotlin.random.Random


@OptIn(ExperimentalComposeUiApi::class, ExperimentalFoundationApi::class)
fun main() = application {
    MaterialTheme(
        colors = Colors(
            primary =  Color.Green,
            primaryVariant = Color.Green.copy(alpha = 0.7f).compositeOver(background = Color.Black),
            secondary = Color.Red,
            secondaryVariant = Color.Red.copy(alpha = 0.7f).compositeOver(background = Color.Black),
            background = Color.Black,
            surface = Color.DarkGray,
            onPrimary = Color.White,
            onSecondary = Color.White,
            onBackground = Color.LightGray,
            onSurface = Color.LightGray,
            error = Color.Transparent, onError = Color.Transparent, // Not Used
            isLight = false
        ),
        typography = Typography(
            defaultFontFamily = FontFamily(
                Font(
                    resource = "HBIOS.ttf",
                    weight = FontWeight.W400,
                    style = FontStyle.Normal
                )
            )
        )
    ) {
        val windowState = rememberWindowState(
            placement = WindowPlacement.Floating,
            position = WindowPosition(alignment = Alignment.Center)
        )
        val primary = MaterialTheme.colors.primary
        val secondary = MaterialTheme.colors.secondary
        val lines = rememberSaveable { mutableStateListOf<Pair<String, Color>>() }

        LaunchedEffect(true) {
            while (true) {
                lines.add(
                    List(Random.nextInt(50, 100)) { Char(Random.nextInt(32, 126)) }.joinToString("") to
                            if (Random.nextDouble() > 0.2) primary else secondary
                )
                if (lines.size >= 100) lines.removeAt(0)
                delay(Random.nextLong(30, 60))
            }
        }

        Window(
            onCloseRequest = {  },
            state = windowState,
            title = "Like Hack!",
            undecorated = true,
            transparent = true,
            alwaysOnTop = true,
            onKeyEvent = { keyEvent ->
                if (keyEvent.key == Key.X) {
                    exitApplication()
                    true
                } else {
                    false
                }
            },
        ) {
            var boxScope: @Composable (@Composable () -> Unit) -> Unit
                    by rememberSaveable {
                        mutableStateOf(
                            { content -> WindowDraggableArea { content() } }
                        )
                    }

            LaunchedEffect(windowState.placement) {
                boxScope =
                    if (windowState.placement == WindowPlacement.Maximized || windowState.placement == WindowPlacement.Fullscreen) {
                        { content -> Box { content() } }
                    } else {
                        { content -> WindowDraggableArea { content() } }
                    }
            }

            boxScope {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    shape = if (windowState.placement == WindowPlacement.Maximized || windowState.placement == WindowPlacement.Fullscreen) RectangleShape else RoundedCornerShape(
                        12.dp
                    ),
                    color = MaterialTheme.colors.background,
                    contentColor = MaterialTheme.colors.onBackground
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .verticalScroll(
                                    state = rememberScrollState(),
                                    enabled = false,
                                    reverseScrolling = true
                                ),
                            verticalArrangement = Arrangement.spacedBy(space = 4.dp)
                        ) {
                            for (line in lines) {
                                Text(
                                    text = line.first,
                                    color = line.second,
                                    fontSize = 18.sp
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .padding(12.dp)
                                .size(24.dp)
                                .align(Alignment.TopEnd)
                                .background(
                                    color = MaterialTheme.colors.primary,
                                    shape = CircleShape
                                )
                                .border(
                                    border = BorderStroke(
                                        width = 2.dp,
                                        color = MaterialTheme.colors.primaryVariant
                                    ),
                                    shape = CircleShape
                                )
                                .combinedClickable(
                                    onClick = {},
                                    onLongClick = {
                                        if (windowState.placement == WindowPlacement.Maximized || windowState.placement == WindowPlacement.Fullscreen)
                                            windowState.placement = WindowPlacement.Floating
                                        else
                                            windowState.placement = WindowPlacement.Maximized
                                    }
                                )
                        )
                    }
                }
            }
        }
    }
}