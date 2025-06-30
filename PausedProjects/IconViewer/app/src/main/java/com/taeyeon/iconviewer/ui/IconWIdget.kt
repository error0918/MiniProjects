@file:OptIn(ExperimentalMaterial3Api::class)

package com.taeyeon.iconviewer.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.taeyeon.iconviewer.data.IconData
import com.taeyeon.iconviewer.data.IconType

@Composable
fun IconWidget(
    iconData: IconData,
    iconType: IconType,
    width: Dp,
    onClick: (() -> Unit)? = null
) {
    var imageVector by remember { mutableStateOf(iconType.get(iconData)) }

    LaunchedEffect(iconType) {
        imageVector = iconType.get(iconData)
    }

    val content: @Composable () -> Unit = {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = imageVector,
                contentDescription = iconData.name,
                modifier = Modifier.size(width - 8.dp)
            )
            Text(
                text = iconData.name,
                fontSize = 10.sp,
                lineHeight = 12.sp,
                textAlign = TextAlign.Center,
                color = LocalContentColor.current.copy(alpha = 0.6f)
            )
        }
    }

    if (onClick == null) {
        Surface(
            modifier = Modifier.width(width),
            shape = RoundedCornerShape(4.dp),
            color = Color.Transparent,
            contentColor = LocalContentColor.current,
            content = content
        )
    } else {
        Surface(
            modifier = Modifier.width(width),
            shape = RoundedCornerShape(4.dp),
            color = Color.Transparent,
            contentColor = LocalContentColor.current,
            onClick = onClick,
            content = content
        )
    }
}