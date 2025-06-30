package ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font


val galmuri = FontFamily(
    Font("font/Galmuri11-Condensed.ttf", FontWeight.Light),
    Font("font/Galmuri11.ttf", FontWeight.Normal),
    Font("font/Galmuri11-Bold.ttf", FontWeight.Bold)
)

val galmuriTypography = Typography().run {
    Typography(
        defaultFontFamily = galmuri,
        h1 = h1.copy(fontFamily = galmuri),
        h2 = h2.copy(fontFamily = galmuri),
        h3 = h3.copy(fontFamily = galmuri),
        h4 = h4.copy(fontFamily = galmuri),
        h5 = h5.copy(fontFamily = galmuri),
        subtitle1 = subtitle1.copy(fontFamily = galmuri),
        subtitle2 = subtitle2.copy(fontFamily = galmuri),
        body1 = body1.copy(fontFamily = galmuri),
        body2 = body2.copy(fontFamily = galmuri),
        button = button.copy(fontFamily = galmuri),
        caption = caption.copy(fontFamily = galmuri),
        overline = overline.copy(fontFamily = galmuri)
    )
}


val primaryLight = Color(0xFF116B57)
val onPrimaryLight = Color(0xFFFFFFFF)
val primaryContainerLight = Color(0xFFA3F2D8)
val secondaryLight = Color(0xFF30628C)
val onSecondaryLight = Color(0xFFFFFFFF)
val secondaryContainerLight = Color(0xFFCEE5FF)
val errorLight = Color(0xFFBA1A1A)
val onErrorLight = Color(0xFFFFFFFF)
val backgroundLight = Color(0xFFF5FBF6)
val onBackgroundLight = Color(0xFF171D1A)
val surfaceLight = Color(0xFFF6FAFE)
val onSurfaceLight = Color(0xFF171C1F)

val primaryDark = Color(0xFF87D6BD)
val onPrimaryDark = Color(0xFF00382C)
val primaryContainerDark = Color(0xFF005140)
val secondaryDark = Color(0xFF9CCBFB)
val onSecondaryDark = Color(0xFF003354)
val secondaryContainerDark = Color(0xFF104A73)
val errorDark = Color(0xFFFFB4AB)
val onErrorDark = Color(0xFF690005)
val backgroundDark = Color(0xFF0F1512)
val onBackgroundDark = Color(0xFFDEE4E0)
val surfaceDark = Color(0xFF0F1417)
val onSurfaceDark = Color(0xFFDFE3E7)


private val lightThemeColors = lightColors(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryVariant = primaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryVariant = secondaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight
)

private val darkThemeColors = darkColors(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryVariant = primaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryVariant = secondaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark
)


@Composable
fun SeeSortTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) darkThemeColors else lightThemeColors,
        typography = galmuriTypography,
        content = content
    )
}