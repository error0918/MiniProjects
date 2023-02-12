package com.taeyeon.iconviewer.util

import kotlin.math.ceil

fun <T> List<T>.divideList(per: Int): List<List<T>> {
    val resultSize = ceil(size.toFloat() / per).toInt()
    return List(resultSize) { index ->
        if (index == resultSize - 1) subList(per * index, size - 1)
        else subList(per * index, per * (index + 1))
    }
}