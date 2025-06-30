import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import kotlinx.coroutines.delay
import java.awt.Dimension
import java.awt.Toolkit
import kotlin.math.roundToInt


fun main() {
    val windowState = WindowState(
        size = DpSize(800.dp, 600.dp)
    )

    singleWindowApplication(
        state = windowState,
        title = "Screen Saver Simulator",
        alwaysOnTop = true
    ) {
        LocalDensity.current.run {
            window.minimumSize = Dimension(
                600.dp.toPx().roundToInt(),
                400.dp.toPx().roundToInt()
            )
        }

        val colorList = listOf(Color.Red, Color.Green, Color.Yellow, Color.Blue, Color.Cyan, Color.Magenta)
        val boxWidth = 200.dp
        val boxHeight = 150.dp
        val velocity = 4.dp
        val delayMS = 5L

        var position by remember { mutableStateOf(DpOffset(50.dp, 50.dp)) }
        var direction by remember { mutableStateOf(true to true) } // 가로 세로
        var color by rememberSaveable { mutableStateOf(Color.Red) }
        var backgroundColorCommand by rememberSaveable { mutableStateOf(0) }
        val backgroundColor by animateColorAsState(
            when (backgroundColorCommand) {
                1 -> Color.Red.copy(alpha = 0.5f).compositeOver(Color.Black)
                2 -> Color.Yellow.copy(alpha = 0.5f).compositeOver(Color.Black)
                3 -> Color.Green.copy(alpha = 0.5f).compositeOver(Color.Black)
                4 -> Color.Blue.copy(alpha = 0.5f).compositeOver(Color.Black)
                5 -> Color.Magenta.copy(alpha = 0.5f).compositeOver(Color.Black)
                else -> Color.Black
            }
        )

        val colorShuffle = {
            color = colorList.filter { it != color }.random()
            Toolkit.getDefaultToolkit().beep()
        }
        val backgroundMagic: suspend () -> Unit = {
            backgroundColorCommand = 1
            delay(200)
            backgroundColorCommand = 2
            delay(200)
            backgroundColorCommand = 3
            delay(200)
            backgroundColorCommand = 4
            delay(200)
            backgroundColorCommand = 5
            delay(200)
            backgroundColorCommand = 0
        }

        MaterialTheme {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(backgroundColor)
            ) {
                LaunchedEffect(windowState.size) {
                    position = DpOffset(50.dp, 50.dp)

                    delay(500)
                    while (true) {
                        var x = if (direction.first) position.x + velocity else position.x - velocity
                        var y = if (direction.second) position.y + velocity else position.y - velocity
                        var xDirection = direction.first
                        var yDirection = direction.second
                        val safeZone = 7.dp

                        if (
                            x <= safeZone && y <= safeZone
                            && !direction.first && !direction.second
                        ) {
                            x = 0.dp
                            y = 0.dp
                            xDirection = true
                            yDirection = true
                            colorShuffle()
                            backgroundMagic()
                        } else if (
                            x <= safeZone && y + boxHeight >= windowState.size.height - safeZone
                            && !direction.first && direction.second
                        ) {
                            x = 0.dp
                            y = windowState.size.height - boxHeight
                            xDirection = true
                            yDirection = false
                            colorShuffle()
                            backgroundMagic()
                        } else if (
                            x + boxWidth >= windowState.size.width - safeZone && y <= safeZone
                            && direction.first && !direction.second
                        ) {
                            x = windowState.size.width - boxWidth
                            y = 0.dp
                            xDirection = false
                            yDirection = true
                            colorShuffle()
                            backgroundMagic()
                        } else if (
                            x + boxWidth >= windowState.size.width - safeZone && y + boxHeight >= windowState.size.height - safeZone
                            && direction.first && direction.second
                        ) {
                            x = windowState.size.width - boxWidth
                            y = windowState.size.height - boxHeight
                            xDirection = false
                            yDirection = false
                            colorShuffle()
                            backgroundMagic()
                        } else {

                            if (x <= 0.dp) {
                                x = 0.dp
                                xDirection = true
                                colorShuffle()
                            } else if (x + boxWidth >= windowState.size.width) {
                                x = windowState.size.width - boxWidth
                                xDirection = false
                                colorShuffle()
                            }
                            if (y <= 0.dp) {
                                y = 0.dp
                                yDirection = true
                                colorShuffle()
                            } else if (y + boxHeight >= windowState.size.height) {
                                y = windowState.size.height - boxHeight
                                yDirection = false
                                colorShuffle()
                            }

                        }

                        position = DpOffset(x, y)
                        direction = xDirection to yDirection
                        delay(delayMS)
                    }
                }

                Box(
                    modifier = Modifier
                        .offset(position.x, position.y)
                        .width(boxWidth)
                        .height(boxHeight)
                        .background(color)
                        .padding(10.dp)
                        .pointerInput(Unit) {
                            detectTapGestures {
                                colorShuffle()
                            }
                        }
                ) {
                    Column(
                        modifier = Modifier.align(Alignment.Center),
                        verticalArrangement = Arrangement.spacedBy(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "DVD",
                            modifier = Modifier.padding(end = 5.dp),
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle.Italic,
                            fontSize = 50.sp,
                            letterSpacing = 5.sp
                        )

                        Text(
                            text = "SIM SIM HAE",
                            color = Color.Black,
                            fontSize = 20.sp
                        )
                    }
                }
            }
        }
    }
}