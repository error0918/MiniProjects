package com.taeyeon.calculatre.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.taeyeon.calculatre.data.DialButtonDefaults
import com.taeyeon.calculatre.model.MainViewModel


@Preview
@Composable
fun MainScreen(
    viewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    val size = DpSize(64.dp, 64.dp)
    val dialList = listOf(
        listOf(
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            ),
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            ),
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            ),
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            )
        ),
        listOf(
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            ),
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            ),
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            ),
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            )
        ),
        listOf(
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            ),
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            ),
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            ),
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            )
        ),
        listOf(
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            ),
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            ),
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            ),
            DialButtonDefaults.dialButtonData(
                text = "1",
                size = size,
                onClick = {  }
            )
        )
    )

    BoxWithConstraints {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(space = 16.dp)
        ) {
            Box(modifier = Modifier.weight(1f))
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
