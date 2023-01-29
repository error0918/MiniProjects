package com.taeyeon.wowphonenumber.util

import android.content.Context
import androidx.annotation.RawRes
import com.taeyeon.wowphonenumber.model.MainViewModel
import java.io.ByteArrayOutputStream

fun Context.readRaw(@RawRes id: Int): String {
    val inputStream = resources.openRawResource(id)
    val byteArrayOutputStream = ByteArrayOutputStream()
    var index = inputStream.read()
    while (index != -1) {
        byteArrayOutputStream.write(index)
        index = inputStream.read()
    }
    val result = String(byteArrayOutputStream.toByteArray(), Charsets.UTF_8)
    byteArrayOutputStream.close()
    return result
}

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