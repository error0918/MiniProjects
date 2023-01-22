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
import kotlin.math.pow

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

    fun changePhoneNumber(delta: Long) {
        var number = delta
        (phoneNumber[0] + phoneNumber[1] + phoneNumber[2]).reversed().forEachIndexed { index, item ->
            number += (item ?: '0').digitToInt() * 10.0.pow(index.toDouble()).toLong()
        }
        if (delta in 0L .. 999_9999_9999L) {
            val numberString = "$number"
            for (index in phoneNumber[0].indices) phoneNumber[0][index] = if (numberString.length > index) numberString[index] else null
            for (index in phoneNumber[1].indices) phoneNumber[1][index] = if (numberString.length > index + 6) numberString[index + 4] else null
            for (index in phoneNumber[2].indices) phoneNumber[2][index] = if (numberString.length > index + 7) numberString[index + 7] else null
        }
    }
}