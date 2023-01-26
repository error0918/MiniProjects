package com.taeyeon.wowphonenumber.util

import com.taeyeon.wowphonenumber.model.MainViewModel

fun moveKey(
    mainViewModel: MainViewModel,
    key: Pair<Int, Int>,
    toPlus: Boolean
): Pair<Int, Int>? {
    val value = key.second + if (toPlus) 1 else -1
    return if (value in 0 until mainViewModel.phoneNumber[key.first].size) {
        key.first to value
    } else if (value < 0) {
        if (key.first - 1 >= 0) key.first - 1 to mainViewModel.phoneNumber[key.first - 1].size - 1
        else null
    } else {
        if (key.first + 1 < mainViewModel.phoneNumber.size) key.first + 1 to 0
        else null
    }
}