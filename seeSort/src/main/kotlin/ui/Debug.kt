package ui

import MainViewModel
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp

@Composable
fun DebugContent(
    mainViewModel: MainViewModel = MainViewModel()
) {
    if (mainViewModel.debugMode) {
        Box(
            modifier = Modifier
                .width(400.dp)
                .fillMaxHeight()
        ) {
            Divider(
                modifier = Modifier
                    .width(5.dp)
                    .fillMaxHeight()
                    .align(Alignment.CenterStart)
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp, bottom = 30.dp, start = 35.dp, end = 30.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {

                // Content
                AdjustIntWidget(
                    title = "배열 크기",
                    data = mainViewModel.arraySize.toString(),
                    onMinusClicked = {
                        mainViewModel.turn(false)
                        if (mainViewModel.arraySize > 25) mainViewModel.updateArray(arraySize = mainViewModel.arraySize - 25)
                    },
                    onPlusClicked = {
                        mainViewModel.turn(false)
                        if (mainViewModel.arraySize < 500) mainViewModel.updateArray(arraySize = mainViewModel.arraySize + 25)
                    },
                    onStarClicked = {
                        mainViewModel.turn(false)
                        mainViewModel.updateArray(arraySize = 50)
                    }
                )
                AdjustIntWidget(
                    title = "최댓값",
                    data = mainViewModel.arrayMaxValue.toString(),
                    onMinusClicked = {
                        mainViewModel.turn(false)
                        if (mainViewModel.arrayMaxValue > 100) mainViewModel.updateArray(arrayMaxValue = mainViewModel.arrayMaxValue - 100)
                    },
                    onPlusClicked = {
                        mainViewModel.turn(false)
                        if (mainViewModel.arrayMaxValue < 2000) mainViewModel.updateArray(arrayMaxValue = mainViewModel.arrayMaxValue + 100)
                    },
                    onStarClicked = {
                        mainViewModel.turn(false)
                        mainViewModel.updateArray(arrayMaxValue = mainViewModel.arrayMaxValue)
                    }
                )
                AdjustIntWidget(
                    title = "지연 시간",
                    data = "${String.format("%.2f", mainViewModel.arrayTime)} 밀리초",
                    onMinusClicked = {
                        mainViewModel.turn(false)
                        if (mainViewModel.arrayTime > 0.0505f) mainViewModel.updateArray(arrayTime = mainViewModel.arrayTime - 0.05f)
                    },
                    onPlusClicked = {
                        mainViewModel.turn(false)
                        if (mainViewModel.arrayTime < 2f) mainViewModel.updateArray(arrayTime = mainViewModel.arrayTime + 0.05f)
                    },
                    onStarClicked = {
                        mainViewModel.turn(false)
                        mainViewModel.updateArray(arrayTime = 0.2f)
                    }
                )

                SelectionContainer {
                    Text(
                        text = buildAnnotatedString {
                            withStyle(MaterialTheme.typography.body1.toSpanStyle()) {
                                append("algorithm: ")
                            }
                            withStyle(
                                MaterialTheme.typography.body2.copy(
                                    fontSize = MaterialTheme.typography.body2.fontSize * 0.7f,
                                    lineHeight = MaterialTheme.typography.body2.lineHeight * 0.7f
                                ).toSpanStyle()
                            ) {
                                append("${mainViewModel.algorithmClass.simpleName}\n")
                                append("\n")
                            }
                            withStyle(MaterialTheme.typography.body1.toSpanStyle()) {
                                append("array: ")
                            }
                            withStyle(
                                MaterialTheme.typography.body2.copy(
                                    fontSize = MaterialTheme.typography.body2.fontSize * 0.7f,
                                    lineHeight = MaterialTheme.typography.body2.lineHeight * 0.7f
                                ).toSpanStyle()
                            ) {
                                append("[${mainViewModel.array.joinToString(", ")}]\n")
                                append("\n")
                            }
                            withStyle(MaterialTheme.typography.body1.toSpanStyle()) {
                                append("accessedIndex: ")
                            }
                            withStyle(
                                MaterialTheme.typography.body2.copy(
                                    fontSize = MaterialTheme.typography.body2.fontSize * 0.7f,
                                    lineHeight = MaterialTheme.typography.body2.lineHeight * 0.7f
                                ).toSpanStyle()
                            ) {
                                append("[${mainViewModel.accessedIndex.joinToString(", ")}]\n")
                            }
                            withStyle(MaterialTheme.typography.body1.toSpanStyle()) {
                                append("comparisonIndex: ")
                            }
                            withStyle(
                                MaterialTheme.typography.body2.copy(
                                    fontSize = MaterialTheme.typography.body2.fontSize * 0.7f,
                                    lineHeight = MaterialTheme.typography.body2.lineHeight * 0.7f
                                ).toSpanStyle()
                            ) {
                                append("[${mainViewModel.comparisonIndex.joinToString(", ")}]\n")
                            }
                            withStyle(MaterialTheme.typography.body1.toSpanStyle()) {
                                append("verifiedIndex: ")
                            }
                            withStyle(
                                MaterialTheme.typography.body2.copy(
                                    fontSize = MaterialTheme.typography.body2.fontSize * 0.7f,
                                    lineHeight = MaterialTheme.typography.body2.lineHeight * 0.7f
                                ).toSpanStyle()
                            ) {
                                append("[${mainViewModel.verifiedIndex.joinToString(", ")}]\n")
                            }
                        },
                        modifier = Modifier.verticalScroll(state = rememberScrollState())
                    )
                }

            }
        }
    }
}


@Composable
fun AdjustIntWidget(
    title: String,
    data: String,
    onMinusClicked: () -> Unit,
    onPlusClicked: () -> Unit,
    onStarClicked: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 5.dp,
                brush = SolidColor(LocalContentColor.current),
                shape = RectangleShape
            )
            .padding(15.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            text = "$title: $data",
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(10.dp).padding(end = 5.dp)
        )
        Row(
            modifier = Modifier.align(Alignment.End),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            SquareButton(
                modifier = Modifier.size(50.dp),
                color = MaterialTheme.colors.secondary,
                contentColor = MaterialTheme.colors.onSecondary,
                onClick = onMinusClicked
            ) {
                Text(
                    text = "-",
                    style = MaterialTheme.typography.h5
                )
            }
            SquareButton(
                modifier = Modifier.size(50.dp),
                color = MaterialTheme.colors.secondary,
                contentColor = MaterialTheme.colors.onSecondary,
                onClick = onPlusClicked
            ) {
                Text(
                    text = "+",
                    style = MaterialTheme.typography.h5
                )
            }
            SquareButton(
                modifier = Modifier.size(50.dp),
                color = MaterialTheme.colors.primary,
                contentColor = MaterialTheme.colors.onPrimary,
                onClick = onStarClicked
            ) {
                Text(
                    text = "*",
                    style = MaterialTheme.typography.h5
                )
            }
        }
    }
}

