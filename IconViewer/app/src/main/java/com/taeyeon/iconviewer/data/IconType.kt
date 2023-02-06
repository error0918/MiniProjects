package com.taeyeon.iconviewer.data

import androidx.compose.ui.graphics.vector.ImageVector

enum class IconType(
    val get: (IconData) -> ImageVector
) {
    Filled(get = { it.filled }),
    Outlined(get = { it.outlined }),
    Rounded(get = { it.rounded }),
    Sharp(get = { it.sharp }),
    TwoTone(get = { it.twoTone })
}