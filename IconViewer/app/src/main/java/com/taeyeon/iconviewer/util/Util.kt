package com.taeyeon.iconviewer.util

import android.content.Context
import androidx.annotation.RawRes
import java.io.ByteArrayOutputStream
import kotlin.math.ceil

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


fun <T> List<T>.divideList(per: Int): List<List<T>> {
    val resultSize = ceil(size.toFloat() / per).toInt()
    return List(resultSize) { index ->
        if (index == resultSize - 1) subList(per * index, size - 1)
        else subList(per * index, per * (index + 1))
    }
}