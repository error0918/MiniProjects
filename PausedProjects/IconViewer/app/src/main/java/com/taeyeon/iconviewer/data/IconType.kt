package com.taeyeon.iconviewer.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.outlined.Image
import androidx.compose.material.icons.rounded.Image
import androidx.compose.material.icons.sharp.Image
import androidx.compose.material.icons.twotone.Image
import androidx.compose.ui.graphics.vector.ImageVector

enum class IconType(
    val example: ImageVector,
    val get: (IconData) -> ImageVector
) {
    Filled(
        example = Icons.Filled.Image,
        get = { it.filled }
    ),
    Outlined(
        example = Icons.Outlined.Image,
        get = { it.outlined }
    ),
    Rounded(
        example = Icons.Rounded.Image
        ,get = { it.rounded }
    ),
    Sharp(
        example = Icons.Sharp.Image,
        get = { it.sharp }
    ),
    TwoTone(
        example = Icons.TwoTone.Image,
        get = { it.twoTone }
    )
}