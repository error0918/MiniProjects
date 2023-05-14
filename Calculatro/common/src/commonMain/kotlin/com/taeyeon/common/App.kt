package com.taeyeon.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import net.objecthunter.exp4j.ExpressionBuilder

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    var pre by rememberSaveable { mutableStateOf("") }
    var text by rememberSaveable { mutableStateOf("") }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar() },
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
                        text = pre.ifEmpty { "이전 기록" },
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
                                    } && pre.isNotEmpty()
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
                        text = buildAnnotatedString {
                            append(text)
                            withStyle(
                                SpanStyle(
                                    color = LocalContentColor.current.copy(alpha = 0.5f)
                                )
                            ) {
                                append(")".repeat(text.split("(").size - text.split(")").size))
                                if (text.isEmpty()) append("계산식")
                            }
                        },
                        style = MaterialTheme.typography.displaySmall,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp)
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    CalcButton(
                        text = "e",
                        onClick = { text += "e" }
                    )
                    CalcButton(
                        text = "π",
                        onClick = { text += "π" }
                    )
                    CalcButton(
                        text = "φ",
                        onClick = { text += "φ" }
                    )
                    CalcButton(
                        text = "C",
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary,
                        onClick = { text = "" }
                    )
                    CalcButton(
                        text = "⌫",
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary,
                        onClick = { if (text.isNotEmpty()) text = text.substring(0..text.length - 2) }
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    CalcButton(
                        text = "sin",
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                        onClick = { text += "sin(" }
                    )
                    CalcButton(
                        text = "cos",
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                        onClick = { text += "cos(" }
                    )
                    CalcButton(
                        text = "tan",
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                        onClick = { text += "tan(" }
                    )
                    CalcButton(
                        text = "%",
                        containerColor = MaterialTheme.colorScheme.secondary,
                        contentColor = MaterialTheme.colorScheme.onSecondary,
                        onClick = { text += "%" }
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
                        text = "|x|",
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                        onClick = { text += "abs(" }
                    )
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
                        text = "√x",
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                        onClick = { text += "sqrt(" }
                    )
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
                        text = "log",
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                        onClick = { text += "log10(" }
                    )
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
                                text = ExpressionBuilder(text + ")".repeat(text.split("(").size - text.split(")").size))
                                    .build()
                                    .evaluate()
                                    .toString()
                                    .let {
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
expect fun TopBar()