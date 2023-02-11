@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.iconviewer.ui

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.taeyeon.iconviewer.data.IconData
import com.taeyeon.iconviewer.data.IconType

@Composable
fun IconWidget(
    iconData: IconData,
    iconType: IconType,
    width: Dp,
    onClick: (() -> Unit)? = null
) {
    if (onClick == null) {
        Surface(
            modifier = Modifier.width(width),
            shape = RoundedCornerShape(4.dp),
            color = Color.Transparent,
            contentColor = LocalContentColor.current,
            content = {}
        )
    } else {
        Surface(
            modifier = Modifier.width(width),
            shape = RoundedCornerShape(4.dp),
            color = Color.Transparent,
            contentColor = LocalContentColor.current,
            onClick = onClick,
            content = {}
        )
    }
}