package com.taeyeon.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Backspace
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.objecthunter.exp4j.ExpressionBuilder

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    var pre by rememberSaveable { mutableStateOf("이전기록") }
    var text by rememberSaveable { mutableStateOf("") }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text(text = "Calculatro") },
                actions = {
                    IconButton(
                        onClick = {
                            pre = "이전기록"
                            text = ""
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Clear,
                            contentDescription = "초기화"
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
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues = paddingValues)
                    .padding(4.dp),
                verticalArrangement = Arrangement.spacedBy(space = 4.dp)
            ) {
                Spacer(
                    modifier = Modifier.weight(1f)
                )

                Surface(
                    shape = RoundedCornerShape(size = 4.dp),
                    color = Color.Transparent,
                    contentColor = LocalContentColor.current
                ) {
                    Text(
                        text = pre,
                        style = MaterialTheme.typography.labelMedium,
                        color = LocalContentColor.current.copy(alpha = 0.5f),
                        modifier = Modifier
                            .let {
                                if (
                                    try {
                                        pre.toFloat()
                                        true
                                    } catch (_: Exception) {
                                        false
                                    }
                                ) {
                                    it.clickable {
                                        text = pre
                                    }
                                } else {
                                    it
                                }
                            }
                            .padding(4.dp)
                    )
                }

                SelectionContainer {
                    Text(
                        text = text,
                        style = MaterialTheme.typography.displayMedium,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp)
                    )
                }

                IconButton(
                    onClick = {
                        if (text.isNotEmpty()) text = text.substring(0..text.length - 2)
                    },
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.Backspace,
                        contentDescription = "지우기"
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    CalcButton(
                        text = "C",
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                        onClick = { text = "" }
                    )
                    CalcButton(
                        text = "(",
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                        onClick = { text += "(" }
                    )
                    CalcButton(
                        text = ")",
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                        onClick = { text += ")" }
                    )
                    CalcButton(
                        text = "/",
                        containerColor = MaterialTheme.colorScheme.secondary,
                        contentColor = MaterialTheme.colorScheme.onSecondary,
                        onClick = { text += "/" }
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    CalcButton(
                        text = "7",
                        onClick = { text += "7" }
                    )
                    CalcButton(
                        text = "8",
                        onClick = { text += "8" }
                    )
                    CalcButton(
                        text = "9",
                        onClick = { text += "9" }
                    )
                    CalcButton(
                        text = "*",
                        containerColor = MaterialTheme.colorScheme.secondary,
                        contentColor = MaterialTheme.colorScheme.onSecondary,
                        onClick = { text += "*" }
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    CalcButton(
                        text = "4",
                        onClick = { text += "4" }
                    )
                    CalcButton(
                        text = "5",
                        onClick = { text += "5" }
                    )
                    CalcButton(
                        text = "6",
                        onClick = { text += "6" }
                    )
                    CalcButton(
                        text = "-",
                        containerColor = MaterialTheme.colorScheme.secondary,
                        contentColor = MaterialTheme.colorScheme.onSecondary,
                        onClick = { text += "-" }
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    CalcButton(
                        text = "1",
                        onClick = { text += "1" }
                    )
                    CalcButton(
                        text = "2",
                        onClick = { text += "2" }
                    )
                    CalcButton(
                        text = "3",
                        onClick = { text += "3" }
                    )
                    CalcButton(
                        text = "+",
                        containerColor = MaterialTheme.colorScheme.secondary,
                        contentColor = MaterialTheme.colorScheme.onSecondary,
                        onClick = { text += "+" }
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    CalcButton(
                        text = "00",
                        onClick = { text += "00" }
                    )
                    CalcButton(
                        text = "0",
                        onClick = { text += "0" }
                    )
                    CalcButton(
                        text = ".",
                        onClick = { text += "." }
                    )
                    CalcButton(
                        text = "=",
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary,
                        onClick = {
                            try {
                                text = ExpressionBuilder(text).build().evaluate().toString().let {
                                    if (it.endsWith(".0")) it.substring(0 until it.length - 2)
                                    else it
                                }
                                pre = text
                            } catch (_: Exception) {
                                // TODO
                            }
                        }
                    )
                }
            }
        }
    )
}

@Composable
fun RowScope.CalcButton(
    text: String,
    containerColor: Color = MaterialTheme.colorScheme.primaryContainer,
    contentColor: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .weight(1f)
            .let {
                it.layout { measurable, constraints ->
                    val placeable = measurable.measure(
                        constraints.copy(minHeight = constraints.maxHeight)
                    )
                    layout(placeable.width, placeable.height) {
                        placeable.placeRelative(0, 0)
                    }
                }
            },
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = contentColor
        )
    ) {
        Text(
            text = text,
            fontSize = 20.sp
        )
    }
}