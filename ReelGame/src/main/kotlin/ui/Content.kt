package ui

import MainViewModel
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlin.math.absoluteValue
import kotlin.math.pow


@Composable
fun Content(mainViewModel: MainViewModel = MainViewModel()) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background.copy(alpha = 0.5f))
            .padding(10.dp)
    ) {
        GamePad(mainViewModel = mainViewModel)
        GameBalls(mainViewModel = mainViewModel)
    }
}


@Composable
fun GamePad(mainViewModel: MainViewModel = MainViewModel()) {
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        for (x in 0 until mainViewModel.mapWidth) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                for (y in 0 until mainViewModel.mapHeight) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .background(
                                if (mainViewModel.map[y][x]) MaterialTheme.colors.surface
                                else MaterialTheme.colors.onSurface
                            )
                            .pointerInput(Unit) {
                                detectTapGestures {
                                    mainViewModel.map[y][x] = !mainViewModel.map[y][x]
                                }
                            }
                            .let {
                                if (mainViewModel.isDebug) it.border(width = 0.5.dp, brush = SolidColor(Color.Red), shape = RectangleShape)
                                else it
                            }
                    )
                }
            }
        }
    }
}


@Composable
fun BoxScope.GameBalls(mainViewModel: MainViewModel = MainViewModel()) {
    val boxWidth = mainViewModel.boxWidth / mainViewModel.mapWidth
    val boxHeight = mainViewModel.boxHeight / mainViewModel.mapHeight
    val ballSize = 25.dp

    val debugPoints = remember { mutableStateListOf<Pair<Dp, Dp>>() }

    LaunchedEffect(mainViewModel.isRunning) {
        while (mainViewModel.isRunning) {
            debugPoints.clear()
            mainViewModel.move()

            // 공 부딪힘 검사

            val getDistance: (Pair<Dp, Dp>, Pair<Dp, Dp>) -> Dp = { a, b ->
                val (ax, ay) = a.first.value to a.second.value
                val (bx, by) = b.first.value to b.second.value
                ((bx - ax).pow(2) + (by - ay).pow(2)).pow(0.5f).dp
            }

            // trueBall

            val trueBallCenterX = (mainViewModel.trueBallX + ballSize / 2)
            val trueBallCenterY = (mainViewModel.trueBallY + ballSize / 2)
            val trueBallLeft = mainViewModel.trueBallX
            val trueBallRight = mainViewModel.trueBallX + ballSize
            val trueBallTop = mainViewModel.trueBallY
            val trueBallBottom = mainViewModel.trueBallY + ballSize

            debugPoints.add(trueBallLeft to trueBallCenterY)
            debugPoints.add(trueBallRight to trueBallCenterY)
            debugPoints.add(trueBallCenterX to trueBallCenterY)
            debugPoints.add(trueBallCenterX to trueBallTop)
            debugPoints.add(trueBallCenterX to trueBallBottom)

            val trueBallWall = trueBallCenterX.value.toInt() / boxWidth.value.toInt()
            val trueBallFloor = trueBallCenterY.value.toInt() / boxHeight.value.toInt()
            val trueBallHighFloor = (trueBallTop.value.toInt() / boxHeight.value.toInt()).let { if (it <= -1) 0 else it }
            val trueBallLowFloor = (trueBallBottom.value.toInt() / boxHeight.value.toInt()).let { if (it >= mainViewModel.mapHeight) mainViewModel.mapHeight - 1 else it }

            // 벽 부딪힘 검사

            if (trueBallLeft <= 0.dp) {
                mainViewModel.trueBallHD = HorizontalDirection.ToRight
            }
            if (trueBallRight >= mainViewModel.boxWidth) {
                mainViewModel.trueBallHD = HorizontalDirection.ToLeft
            }
            if (trueBallTop <= 0.dp) {
                mainViewModel.trueBallVD = VerticalDirection.Down
            }
            if (trueBallBottom >= mainViewModel.boxHeight) {
                mainViewModel.trueBallVD = VerticalDirection.Up
            }

            // 모서리 부딪힘 검사

            if (trueBallHighFloor != trueBallLowFloor) {
                // 공 위쪽 검사
                val highFloor = mainViewModel.map[trueBallHighFloor]
                for (i in highFloor.indices) {
                    if (!highFloor[i]) {
                        // 왼쪽 아래 좌표
                        val leftX = boxWidth * i
                        val leftY = boxHeight * (trueBallHighFloor + 1)
                        debugPoints.add(leftX to leftY)
                        // 오른쪽 아래 좌표
                        val rightX = boxWidth * (i + 1)
                        val rightY = boxHeight * (trueBallHighFloor + 1)
                        debugPoints.add(rightX to rightY)

                        if (getDistance(trueBallCenterX to trueBallCenterY, leftX to leftY) <= ballSize / 2) {
                            mainViewModel.trueBallVD = VerticalDirection.Down
                            mainViewModel.trueBallHD = HorizontalDirection.ToLeft
                            mainViewModel.map[trueBallHighFloor][i] = true
                        }
                        if (getDistance(trueBallCenterX to trueBallCenterY, rightX to rightY) <= ballSize / 2) {
                            mainViewModel.trueBallVD = VerticalDirection.Down
                            mainViewModel.trueBallHD = HorizontalDirection.ToRight
                            mainViewModel.map[trueBallHighFloor][i] = true
                        }
                    }
                }

                // 공 아래쪽 검사
                val lowFloor = mainViewModel.map[trueBallLowFloor]
                for (i in lowFloor.indices) {
                    if (!lowFloor[i]) {
                        // 왼쪽 위 좌표
                        val leftX = boxWidth * i
                        val leftY = boxHeight * trueBallLowFloor
                        debugPoints.add(leftX to leftY)
                        // 오른쪽 위 좌표
                        val rightX = boxWidth * (i + 1)
                        val rightY = boxHeight * trueBallLowFloor
                        debugPoints.add(rightX to rightY)

                        if (getDistance(trueBallCenterX to trueBallCenterY, leftX to leftY) <= ballSize / 2) {
                            mainViewModel.trueBallVD = VerticalDirection.Up
                            mainViewModel.trueBallHD = HorizontalDirection.ToLeft
                            mainViewModel.map[trueBallLowFloor][i] = true
                        }
                        if (getDistance(trueBallCenterX to trueBallCenterY, rightX to rightY) <= ballSize / 2) {
                            mainViewModel.trueBallVD = VerticalDirection.Up
                            mainViewModel.trueBallHD = HorizontalDirection.ToRight
                            mainViewModel.map[trueBallLowFloor][i] = true
                        }
                    }
                }
            }

            // 변 부딪힘 검사

            // 좌우 변 검사
            for (i in mainViewModel.map[trueBallFloor].indices) {
                if (!mainViewModel.map[trueBallFloor][i]) {
                    debugPoints.add(boxWidth * i to trueBallCenterY)
                    if ((trueBallRight - boxWidth * i).value.absoluteValue < 2.5f) {
                        mainViewModel.trueBallHD = HorizontalDirection.ToLeft
                        mainViewModel.map[trueBallFloor][i] = true
                    }
                    debugPoints.add(boxWidth * (i + 1) to trueBallCenterY)
                    if ((trueBallLeft - boxWidth * (i + 1)).value.absoluteValue < 2.5f) {
                        mainViewModel.trueBallHD = HorizontalDirection.ToRight
                        mainViewModel.map[trueBallFloor][i] = true
                    }
                }
            }

            // 상하 변 검사
            for (i in mainViewModel.map.indices) {
                if (!mainViewModel.map[i][trueBallWall]) {
                    debugPoints.add(trueBallCenterX to boxHeight * i)
                    if ((trueBallBottom - boxHeight * i).value.absoluteValue < 2.5f) {
                        mainViewModel.trueBallVD = VerticalDirection.Up
                        mainViewModel.map[i][trueBallWall] = true
                    }
                    debugPoints.add(trueBallCenterX to boxHeight * (i + 1))
                    if ((trueBallTop - boxHeight * (i + 1)).value.absoluteValue < 2.5f) {
                        mainViewModel.trueBallVD = VerticalDirection.Down
                        mainViewModel.map[i][trueBallWall] = true
                    }
                }
            }

            // falseBall

            val falseBallCenterX = mainViewModel.boxWidth + mainViewModel.falseBallX - ballSize / 2
            val falseBallCenterY = mainViewModel.boxHeight + mainViewModel.falseBallY - ballSize / 2
            val falseBallLeft = mainViewModel.boxWidth + mainViewModel.falseBallX - ballSize
            val falseBallRight = mainViewModel.boxWidth + mainViewModel.falseBallX
            val falseBallTop = mainViewModel.boxHeight + mainViewModel.falseBallY - ballSize
            val falseBallBottom = mainViewModel.boxHeight + mainViewModel.falseBallY

            debugPoints.add(falseBallLeft to falseBallCenterY)
            debugPoints.add(falseBallRight to falseBallCenterY)
            debugPoints.add(falseBallCenterX to falseBallCenterY)
            debugPoints.add(falseBallCenterX to falseBallTop)
            debugPoints.add(falseBallCenterX to falseBallBottom)

            val falseBallWall = falseBallCenterX.value.toInt() / boxWidth.value.toInt()
            val falseBallFloor = falseBallCenterY.value.toInt() / boxHeight.value.toInt()
            val falseBallHighFloor = (falseBallTop.value.toInt() / boxHeight.value.toInt()).let { if (it <= -1) 0 else it }
            val falseBallLowFloor = (falseBallBottom.value.toInt() / boxHeight.value.toInt()).let { if (it >= mainViewModel.mapHeight) mainViewModel.mapHeight - 1 else it }

            // 벽 부딪힘 검사

            if (falseBallLeft <= 0.dp) {
                mainViewModel.falseBallHD = HorizontalDirection.ToRight
            }
            if (falseBallRight >= mainViewModel.boxWidth) {
                mainViewModel.falseBallHD = HorizontalDirection.ToLeft
            }
            if (falseBallTop <= 0.dp) {
                mainViewModel.falseBallVD = VerticalDirection.Down
            }
            if (falseBallBottom >= mainViewModel.boxHeight) {
                mainViewModel.falseBallVD = VerticalDirection.Up
            }

            // 모서리 부딪힘 검사

            if (falseBallHighFloor != falseBallLowFloor) {
                // 공 위쪽 검사
                val highFloor = mainViewModel.map[falseBallHighFloor]
                for (i in highFloor.indices) {
                    if (highFloor[i]) {
                        // 왼쪽 아래 좌표
                        val leftX = boxWidth * i
                        val leftY = boxHeight * (falseBallHighFloor + 1)
                        debugPoints.add(leftX to leftY)
                        // 오른쪽 아래 좌표
                        val rightX = boxWidth * (i + 1)
                        val rightY = boxHeight * (falseBallHighFloor + 1)
                        debugPoints.add(rightX to rightY)

                        if (getDistance(falseBallCenterX to falseBallCenterY, leftX to leftY) <= ballSize / 2) {
                            mainViewModel.falseBallVD = VerticalDirection.Down
                            mainViewModel.falseBallHD = HorizontalDirection.ToLeft
                            mainViewModel.map[falseBallHighFloor][i] = false
                        }
                        if (getDistance(falseBallCenterX to falseBallCenterY, rightX to rightY) <= ballSize / 2) {
                            mainViewModel.falseBallVD = VerticalDirection.Down
                            mainViewModel.falseBallHD = HorizontalDirection.ToRight
                            mainViewModel.map[falseBallHighFloor][i] = false
                        }
                    }
                }

                // 공 아래쪽 검사
                val lowFloor = mainViewModel.map[falseBallLowFloor]
                for (i in lowFloor.indices) {
                    if (lowFloor[i]) {
                        // 왼쪽 위 좌표
                        val leftX = boxWidth * i
                        val leftY = boxHeight * falseBallLowFloor
                        debugPoints.add(leftX to leftY)
                        // 오른쪽 위 좌표
                        val rightX = boxWidth * (i + 1)
                        val rightY = boxHeight * falseBallLowFloor
                        debugPoints.add(rightX to rightY)

                        if (getDistance(falseBallCenterX to falseBallCenterY, leftX to leftY) <= ballSize / 2) {
                            mainViewModel.falseBallVD = VerticalDirection.Up
                            mainViewModel.falseBallHD = HorizontalDirection.ToLeft
                            mainViewModel.map[falseBallLowFloor][i] = false
                        }
                        if (getDistance(falseBallCenterX to falseBallCenterY, rightX to rightY) <= ballSize / 2) {
                            mainViewModel.falseBallVD = VerticalDirection.Up
                            mainViewModel.falseBallHD = HorizontalDirection.ToRight
                            mainViewModel.map[falseBallLowFloor][i] = false
                        }
                    }
                }
            }

            // 변 부딪힘 검사

            // 좌우 변 검사
            for (i in mainViewModel.map[falseBallFloor].indices) {
                if (mainViewModel.map[falseBallFloor][i]) {
                    debugPoints.add(boxWidth * i to falseBallCenterY)
                    if ((falseBallRight - boxWidth * i).value.absoluteValue < 2.5f) {
                        mainViewModel.falseBallHD = HorizontalDirection.ToLeft
                        mainViewModel.map[falseBallFloor][i] = false
                    }
                    debugPoints.add(boxWidth * (i + 1) to falseBallCenterY)
                    if ((falseBallLeft - boxWidth * (i + 1)).value.absoluteValue < 2.5f) {
                        mainViewModel.falseBallHD = HorizontalDirection.ToRight
                        mainViewModel.map[falseBallFloor][i] = false
                    }
                }
            }

            // 상하 변 검사
            for (i in mainViewModel.map.indices) {
                if (mainViewModel.map[i][falseBallWall]) {
                    debugPoints.add(falseBallCenterX to boxHeight * i)
                    if ((falseBallBottom - boxHeight * i).value.absoluteValue < 2.5f) {
                        mainViewModel.falseBallVD = VerticalDirection.Up
                        mainViewModel.map[i][falseBallWall] = false
                    }
                    debugPoints.add(falseBallCenterX to boxHeight * (i + 1))
                    if ((falseBallTop - boxHeight * (i + 1)).value.absoluteValue < 2.5f) {
                        mainViewModel.falseBallVD = VerticalDirection.Down
                        mainViewModel.map[i][falseBallWall] = false
                    }
                }
            }

            delay(1000L / mainViewModel.fps)
        }
    }

    // TrueBall
    Box(
        modifier = Modifier
            .offset(
                x = mainViewModel.trueBallX,
                y = mainViewModel.trueBallY
            )
            .size(ballSize)
            .align(Alignment.TopStart)
            .background(
                color = MaterialTheme.colors.onSurface,
                shape = CircleShape
            )
    )

    // FalseBall
    Box(
        modifier = Modifier
            .offset(
                x = mainViewModel.falseBallX,
                y = mainViewModel.falseBallY
            )
            .size(ballSize)
            .align(Alignment.BottomEnd)
            .background(
                color = MaterialTheme.colors.surface,
                shape = CircleShape
            )
    )

    // Debug Points
    if (mainViewModel.isDebug) {
        for (debugPoint in debugPoints) {
            Box(
                modifier = Modifier
                    .offset(
                        x = debugPoint.first - 3.dp,
                        y = debugPoint.second - 3.dp
                    )
                    .size(6.dp)
                    .background(
                        color = Color.Cyan,
                        shape = CircleShape
                    )
            )
        }
    }
}