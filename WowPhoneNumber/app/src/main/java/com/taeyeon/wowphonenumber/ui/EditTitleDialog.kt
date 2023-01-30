@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.wowphonenumber.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.taeyeon.wowphonenumber.R
import com.taeyeon.wowphonenumber.model.MainViewModel

@Composable
fun EditTitleDialog(
    mainViewModel: MainViewModel = MainViewModel(LocalContext.current)
) {
    var temporaryTitle by rememberSaveable { mutableStateOf(mainViewModel.title) }
    var errorMessage by rememberSaveable { mutableStateOf<String?>("a") }

    val emptyMessage = stringResource(id = R.string.edit_title_dialog_empty_error)
    val tooLongMessage = stringResource(id = R.string.edit_title_dialog_too_long_error)

    LaunchedEffect(mainViewModel.title) {
        temporaryTitle = mainViewModel.title
    }
    LaunchedEffect(temporaryTitle) {
        errorMessage = when {
            temporaryTitle.isBlank() -> emptyMessage
            temporaryTitle.length > 50 -> tooLongMessage
            else -> null
        }
    }

    AlertDialog(
        onDismissRequest = { mainViewModel.isEditTitleDialog = false },
        dismissButton = {
            TextButton(
                onClick = { mainViewModel.isEditTitleDialog = false }
            ) {
                Text(text = stringResource(id = R.string.edit_title_dialog_close_dialog))
            }
        },
        confirmButton = {
            TextButton(
                onClick = {
                    mainViewModel.isEditTitleDialog = false
                    mainViewModel.title = temporaryTitle
                },
                enabled = errorMessage == null
            ) {
                Text(text = stringResource(id = R.string.edit_title_dialog_finish))
            }
        },
        icon = {
            Icon(
                imageVector = Icons.Rounded.Edit,
                contentDescription = stringResource(id = R.string.edit_title_dialog_edit_title)
            )
        },
        title = { Text(text = stringResource(id = R.string.edit_title_dialog_edit_title)) },
        text = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                OutlinedTextField(
                    value = temporaryTitle,
                    onValueChange = { value ->
                        temporaryTitle = value
                    },
                    label = { Text(text = stringResource(id = R.string.edit_title_dialog_message)) },
                    trailingIcon = {
                        IconButton(
                            onClick = { temporaryTitle = "" },
                            enabled = temporaryTitle.isNotEmpty()
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Clear,
                                contentDescription = stringResource(id = R.string.edit_title_dialog_clear)
                            )
                        }
                    },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
                errorMessage?.let {
                    Text(
                        text = it,
                        color = MaterialTheme.colorScheme.error,
                        modifier = Modifier.align(Alignment.End)
                    )
                }
            }
        }
    )
}