package com.taeyeon.common

enum class Platform {
    DESKTOP, ANDROID
}

expect fun getPlatform(): Platform