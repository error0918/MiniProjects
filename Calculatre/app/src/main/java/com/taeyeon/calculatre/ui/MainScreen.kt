package com.taeyeon.calculatre.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import com.taeyeon.calculatre.data.DialButtonDefaults
import com.taeyeon.calculatre.model.MainViewModel


@Preview
@Composable
fun MainScreen(
    viewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    BoxWithConstraints {
        val size = DpSize(width = (min(maxWidth, maxHeight) - 16.dp * 5) / 4, height = (min(maxWidth, maxHeight) - 16.dp * 5) / 4)
        val functionKeyColors = DialButtonDefaults.dialButtonColors(
            contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            borderColor = MaterialTheme.colorScheme.onSecondaryContainer
        )
        val calculationKeyColors = DialButtonDefaults.dialButtonColors(
            contentColor = MaterialTheme.colorScheme.onPrimary,
            containerColor = MaterialTheme.colorScheme.primary,
            borderColor = MaterialTheme.colorScheme.onPrimary
        )

        val numberKey = @Composable { number: String ->
            DialButtonDefaults.dialButtonData(
                text = number,
                size = size,
                onClick = { viewModel.addToCalc(number) }
            )
        }

        val dialList = listOf(
            listOf(
                numberKey("7"),
                numberKey("8"),
                numberKey("9"),
                DialButtonDefaults.dialButtonData(
                    text = "+",
                    size = size,
                    colors = functionKeyColors,
                    onClick = { viewModel.addToCalc("+") }
                )
            ),
            listOf(
                numberKey("7"),
                numberKey("8"),
                numberKey("9"),
                DialButtonDefaults.dialButtonData(
                    text = "+",
                    size = size,
                    colors = functionKeyColors,
                    onClick = { viewModel.addToCalc("+") }
                )
            ),
            listOf(
                numberKey("4"),
                numberKey("5"),
                numberKey("6"),
                DialButtonDefaults.dialButtonData(
                    text = "-",
                    size = size,
                    colors = functionKeyColors,
                    onClick = { viewModel.addToCalc("-") }
                )
            ),
            listOf(
                numberKey("1"),
                numberKey("2"),
                numberKey("3"),
                DialButtonDefaults.dialButtonData(
                    text = "*",
                    size = size,
                    colors = functionKeyColors,
                    onClick = { viewModel.addToCalc("*") }
                )
            ),
            listOf(
                DialButtonDefaults.dialButtonData(
                    text = "+/-",
                    size = size,
                    colors = functionKeyColors,
                    onClick = { viewModel.addToCalc("1") }
                ),
                numberKey("0"),
                DialButtonDefaults.dialButtonData(
                    text = ".",
                    size = size,
                    colors = functionKeyColors,
                    onClick = { viewModel.addToCalc("1") }
                ),
                DialButtonDefaults.dialButtonData(
                    text = "=",
                    size = size,
                    colors = calculationKeyColors,
                    onClick = {  }
                )
            )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(space = 16.dp)
        ) {
            Box(modifier = Modifier.weight(1f)) {
                Text(text = viewModel.calc)
            }
            //
            for (dialRow in dialList) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(space = 16.dp)
                ) {
                    for (dial in dialRow) {
                        DialButton(dialButtonData = dial)
                    }
                }
            }
        }
    }
}
