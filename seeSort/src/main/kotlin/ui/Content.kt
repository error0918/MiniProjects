package ui

import MainViewModel
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowScope
import ui.theme.onPrimaryDark
import ui.theme.onPrimaryLight
import ui.theme.onSecondaryDark
import ui.theme.onSecondaryLight


@Composable
fun WindowScope.Content(mainViewModel: MainViewModel = MainViewModel()) {
    Column(modifier = Modifier.fillMaxSize()) {
        ControlBar(mainViewModel = mainViewModel)
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            MainContent(mainViewModel = mainViewModel)
            DebugContent(mainViewModel = mainViewModel)
        }
    }
}


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun RowScope.MainContent(mainViewModel: MainViewModel = MainViewModel()) {
    LaunchedEffect(mainViewModel.isRunning) {
        if (mainViewModel.isRunning) {
            mainViewModel.algorithm?.run()
        }
    }

    Column(
        modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
            .padding(30.dp),
        verticalArrangement = Arrangement.spacedBy(25.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .horizontalScroll(state = rememberScrollState()),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Text(
                    text = "알고리즘: ",
                    style = MaterialTheme.typography.h4,
                    modifier = Modifier.padding(top = 10.dp)
                )
                for (index in mainViewModel.algorithmClassList.indices) {
                    SquareButton(
                        modifier = Modifier.height(80.dp),
                        color = if (mainViewModel.algorithmClassList[index] == mainViewModel.algorithmClass) MaterialTheme.colors.primaryVariant else MaterialTheme.colors.secondaryVariant,
                        contentColor = if (mainViewModel.algorithmClassList[index] == mainViewModel.algorithmClass) (if (mainViewModel.darkTheme) onPrimaryLight else onPrimaryDark) else (if (mainViewModel.darkTheme) onSecondaryLight else onSecondaryDark),
                        onClick = {
                            mainViewModel.turn(false)
                            mainViewModel.algorithmClass = mainViewModel.algorithmClassList[index]
                        }
                    ) {
                        Text(
                            text = mainViewModel.algorithmClassList[index].simpleName ?: "ERROR",
                            style = MaterialTheme.typography.h5
                        )
                    }
                }
            }

            Divider(
                modifier = Modifier
                    .width(5.dp)
                    .fillMaxHeight(),
                color = MaterialTheme.colors.onSurface
            )

            SquareButton(
                modifier = Modifier.fillMaxHeight(),
                color = MaterialTheme.colors.secondary,
                contentColor = MaterialTheme.colors.onSecondary,
                onClick = {
                    mainViewModel.turn(false)
                    mainViewModel.updateArray()
                }
            ) {
                Text(
                    text = "배열 생성",
                    style = MaterialTheme.typography.h4,
                    modifier = Modifier.padding(top = 10.dp)
                )
            }

            SquareButton(
                modifier = Modifier.fillMaxHeight(),
                color = if (mainViewModel.isRunning) (if (mainViewModel.darkTheme) Color(0xFFEE4E4E) else Color(
                    0xFFC73659
                )) else MaterialTheme.colors.primary,
                contentColor = if (mainViewModel.isRunning) (if (mainViewModel.darkTheme) Color(0xFFE8CACA) else Color(
                    0xFFEDD1D7
                )) else MaterialTheme.colors.onPrimary,
                onClick = {
                    if (!mainViewModel.isRunning) mainViewModel.updateAlgorithm()
                    mainViewModel.turn(!mainViewModel.isRunning)
                }
            ) {
                Text(
                    text = if (mainViewModel.isRunning) "중단" else "시작",
                    style = MaterialTheme.typography.h4,
                    modifier = Modifier.padding(top = 10.dp)
                )
            }
        }

        BoxWithConstraints(
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        MaterialTheme.colors.primaryVariant.copy(alpha = 0.1f)
                            .compositeOver(MaterialTheme.colors.surface)
                    ),
            ) {
                var hoveredIndex by remember { mutableStateOf<Int?>(null) }

                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.Bottom
                ) {
                    for (index in mainViewModel.array.indices) {
                        Box(
                            modifier = Modifier
                                .weight(3f)
                                .height(this@BoxWithConstraints.maxHeight * (mainViewModel.array[index] / mainViewModel.arrayMaxValue.toFloat()))
                                .onPointerEvent(PointerEventType.Enter) { hoveredIndex = index }
                                .onPointerEvent(PointerEventType.Exit) { hoveredIndex = null }
                                .background(
                                    when (index) {
                                        in mainViewModel.verifiedIndex -> MaterialTheme.colors.primaryVariant.copy(alpha = 0.2f).compositeOver(MaterialTheme.colors.primary)
                                        in mainViewModel.comparisonIndex -> MaterialTheme.colors.secondary
                                        in mainViewModel.accessedIndex -> MaterialTheme.colors.primary
                                        else -> MaterialTheme.colors.onSurface
                                    }
                                )
                        )
                        if (index != mainViewModel.array.size - 1) Spacer(modifier = Modifier.weight(1f))
                    }
                }

                hoveredIndex?.let {
                    Text(
                        text = "HOVERED ($it): ${mainViewModel.array[it]} / ${mainViewModel.arrayMaxValue}",
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .background(MaterialTheme.colors.primaryVariant)
                            .padding(5.dp),
                        style = MaterialTheme.typography.h6,
                        color = MaterialTheme.colors.onSurface
                    )
                }
            }
        }

        if (mainViewModel.algorithm != null) {
            SelectionContainer {
                Text(
                    text = "연산 횟수: ${mainViewModel.arrayAccessCount + mainViewModel.comparisonCount}회, " +
                            "배열 접근 횟수: ${mainViewModel.arrayAccessCount}회, " +
                            "비교 횟수: ${mainViewModel.comparisonCount}회, " +
                            "소요 시간: ${String.format("%.5f", (mainViewModel.arrayAccessCount + mainViewModel.comparisonCount) * mainViewModel.arrayTime / 1_000f)}초",
                    modifier = Modifier.horizontalScroll(state = rememberScrollState()),
                    style = MaterialTheme.typography.h4,
                    maxLines = 1
                )
            }
        }
    }
}


@Composable
fun SquareButton(modifier: Modifier = Modifier, color: Color, contentColor: Color, onClick: () -> Unit, content: @Composable () -> Unit) {
    Surface(
        modifier = modifier.then(
            Modifier
                .focusable()
                .pointerInput(Unit) {
                    detectTapGestures { onClick() }
                }
        ),
        color = color,
        contentColor = contentColor
    ) {
        Box(
            modifier = Modifier.padding(15.dp),
            contentAlignment = Alignment.Center,
            content = { content() }
        )
    }
}

