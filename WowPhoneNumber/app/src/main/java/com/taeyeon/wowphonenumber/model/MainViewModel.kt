@file:OptIn(
    ExperimentalPagerApi::class
)
@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package com.taeyeon.wowphonenumber.model

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.taeyeon.wowphonenumber.R

class MainViewModel(context: Context): ViewModel() {
    val pagerState = PagerState()

    var title by mutableStateOf(context.getString(R.string.app_name))
    var isEditTitleDialog by mutableStateOf(false)
    var isInfoDialog by mutableStateOf(false)

    val phoneNumber: Array<SnapshotStateList<Char?>> =
        arrayOf(
            mutableStateListOf('0', '1', '0'),
            mutableStateListOf('1', '2', '3', '4'),
            mutableStateListOf('5', '6', '7', '8')
        )
}