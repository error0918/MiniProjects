package ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
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


val colors = lightColors(
    //primary = COMPILED_CODE,
    //primaryVariant = COMPILED_CODE,
    //secondary = COMPILED_CODE,
    //secondaryVariant = COMPILED_CODE,
    background = Color(0xFFffffff),
    surface = Color(0xFFfcf3e1),
    //error = COMPILED_CODE,
    //onPrimary = COMPILED_CODE,
    //onSecondary = COMPILED_CODE,
    onBackground = Color(0xFF000000),
    onSurface = Color(0xFF121211),
    //onError = COMPILED_CODE
)

object Colors {
    val menuSurface = Color(0xFF151515)
    val menuContent = Color(0xFFffffff)

    val debugOnMenuButton = Color(0xFFb8b8b8)
    val debugOffMenuButton = Color(0xFF4b4b4b)
    val playMenuButton = Color(0xFF7aeb80)
    val stopMenuButton = Color(0xFFf5a23d)
    val minimizeMenuButton = Color(0xFFfce26d)
    val exitMenuButton = Color(0xFFfc6d85)
}


@Composable
fun ReelGameTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = colors,
        typography = galmuriTypography,
        content = content
    )
}