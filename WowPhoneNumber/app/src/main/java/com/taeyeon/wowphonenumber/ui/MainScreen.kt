@file:OptIn(ExperimentalMaterial3Api::class,
    ExperimentalPagerApi::class
)
@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package com.taeyeon.wowphonenumber.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ChevronLeft
import androidx.compose.material.icons.rounded.ChevronRight
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.taeyeon.wowphonenumber.R
import com.taeyeon.wowphonenumber.model.MainViewModel
import com.taeyeon.wowphonenumber.model.Screen

@Composable
fun MainContent(
    mainViewModel: MainViewModel = MainViewModel()
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar() },
        bottomBar = { BottomBar(mainViewModel = mainViewModel) }
    ) { paddingValues ->
        val primaryContainer = MaterialTheme.colorScheme.primaryContainer
        val backgroundColor = MaterialTheme.colorScheme.background
        HorizontalPager(
            count = Screen.values().size,
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .drawBehind {
                    // Top
                    drawRect(
                        color = primaryContainer,
                        topLeft = Offset(0f, 0f),
                        size = Size(16.dp.toPx(), 16.dp.toPx())
                    )
                    drawArc(
                        color = backgroundColor,
                        startAngle = 180f,
                        sweepAngle = 90f,
                        useCenter = true,
                        topLeft = Offset(0f, 0f),
                        size = Size(32.dp.toPx(), 32.dp.toPx()),
                    )
                    drawRect(
                        color = primaryContainer,
                        topLeft = Offset(size.width - 16.dp.toPx(), 0f),
                        size = Size(16.dp.toPx(), 16.dp.toPx())
                    )
                    drawArc(
                        color = backgroundColor,
                        startAngle = 270f,
                        sweepAngle = 90f,
                        useCenter = true,
                        topLeft = Offset(size.width - 32.dp.toPx(), 0f),
                        size = Size(32.dp.toPx(), 32.dp.toPx()),
                    )
                    // Bottom
                    drawRect(
                        color = primaryContainer,
                        topLeft = Offset(0f, size.height - 16.dp.toPx()),
                        size = Size(16.dp.toPx(), 16.dp.toPx())
                    )
                    drawArc(
                        color = backgroundColor,
                        startAngle = 90f,
                        sweepAngle = 90f,
                        useCenter = true,
                        topLeft = Offset(0f, size.height - 32.dp.toPx()),
                        size = Size(32.dp.toPx(), 32.dp.toPx()),
                    )
                    drawRect(
                        color = primaryContainer,
                        topLeft = Offset(size.width - 16.dp.toPx(), size.height - 16.dp.toPx()),
                        size = Size(16.dp.toPx(), 16.dp.toPx())
                    )
                    drawArc(
                        color = backgroundColor,
                        startAngle = 0f,
                        sweepAngle = 90f,
                        useCenter = true,
                        topLeft = Offset(size.width - 32.dp.toPx(), size.height - 32.dp.toPx()),
                        size = Size(32.dp.toPx(), 32.dp.toPx()),
                    )
                },
            state = mainViewModel.pagerState,
            contentPadding = PaddingValues(16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) { page ->
            //
        }
    }
}

@Composable
fun TopBar() {
    MediumTopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name)) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            scrolledContainerColor = MaterialTheme.colorScheme.primaryContainer,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    )
}

@Composable
fun BottomBar(
    mainViewModel: MainViewModel = MainViewModel()
) {
    BottomAppBar(
        modifier = Modifier.height(64.dp),
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.onPrimaryContainer
    ) {
        Button(
            onClick = {  },
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .padding(6.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.5f)
            )
        ) {
            Icon(
                imageVector = Icons.Rounded.ChevronLeft,
                contentDescription = null
            )
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            contentAlignment = Alignment.Center
        ) {
            HorizontalPagerIndicator(
                pagerState = mainViewModel.pagerState,
                pageCount = 3,
                activeColor = MaterialTheme.colorScheme.onPrimaryContainer,
                inactiveColor = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.5f),
                indicatorWidth = 6.dp,
                indicatorHeight = 6.dp
            )
        }
        Button(
            onClick = {  },
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .padding(6.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.5f)
            )
        ) {
            Icon(
                imageVector = Icons.Rounded.ChevronRight,
                contentDescription = null
            )
        }
    }
}