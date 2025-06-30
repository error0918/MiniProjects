import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.InternalFoundationTextApi
import androidx.compose.foundation.text.TextDelegate
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFontFamilyResolver
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.*
import getcool.composeapp.generated.resources.*
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.imageResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.roundToInt


@Preview
@Composable
fun App() {
    MaterialTheme {
        val nanumSquareNeo = FontFamily(
            Font(Res.font.nanum_square_neo_a_light, FontWeight.Light),
            Font(Res.font.nanum_square_neo_b_regular, FontWeight.Normal),
            Font(Res.font.nanum_square_neo_c_bold, FontWeight.Bold),
            Font(Res.font.nanum_square_neo_d_extra_bold, FontWeight.ExtraBold),
            Font(Res.font.nanum_square_neo_e_heavy, FontWeight.Black)
        )

        var isDialogShowing by rememberSaveable { mutableStateOf(false) }

        BoxWithConstraints(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            val weightList = listOf(FontWeight.Light, FontWeight.Normal, FontWeight.Bold, FontWeight.ExtraBold, FontWeight.Black)
            val textList = listOf("시원해진다!", "심지어추워진다!", "사실덥다!", "이스터에그!!")
            val colorList = listOf(Color(red = 167, green = 191, blue = 232), Color(red = 233, green = 83, blue = 156), Color(red = 247, green = 180, blue = 130), Color(red = 0, green = 166, blue = 156))

            var weightOrder by rememberSaveable { mutableStateOf(0) }
            LaunchedEffect(Unit) {
                while (true) {
                    if (weightOrder != weightList.size - 1) weightOrder += 1
                    else weightOrder = 0
                    delay(100)
                }
            }
            var textOrder by rememberSaveable { mutableStateOf(0) }
            var colorOrder by rememberSaveable { mutableStateOf(0) }

            val textSize = 50.sp
            val textStyle = TextStyle(
                fontFamily = nanumSquareNeo,
                color = colorList[colorOrder],
                fontSize = textSize
            )
            val textMeasure = with (LocalDensity.current) {
                rememberTextMeasure(
                    text = "쀍",
                    style = textStyle.copy(fontWeight = FontWeight.ExtraBold)
                ).size.let { intSize ->
                    DpSize(intSize.width.toDp(), intSize.height.toDp())
                }
            }

            val (cols, rows) = with (LocalDensity.current) {
                remember(constraints) {
                    ceil(constraints.maxWidth.toDp().value / textMeasure.width.value).toInt() to
                            ceil(constraints.maxHeight.toDp().value / textMeasure.height.value).toInt()
                }
            }

            Box(
                modifier = Modifier.requiredSize(
                    width = textMeasure.width * cols,
                    height = textMeasure.height * rows
                )
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    for (i in 0 ..< rows) {
                        Row(modifier = Modifier.fillMaxWidth()) {
                            for (ii in 0 ..< cols) {
                                val order = i * cols + ii

                                Text(
                                    text = textList[textOrder][order % textList[textOrder].length].toString(),
                                    style = textStyle.copy(
                                        fontWeight = weightList[(order + weightOrder) % weightList.size]
                                    ),
                                    modifier = Modifier.size(textMeasure),
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
            }

            var isClickedFancyGuy by remember { mutableStateOf(false) }
            var fancyGuySize by remember { mutableStateOf(80f) }
            var fancyGuyRotate by remember { mutableStateOf(0f) }
            var fancyGuyX by remember { mutableStateOf(0f) }
            var fancyGuyY by remember { mutableStateOf(0f) }

            LaunchedEffect(isClickedFancyGuy) {
                if (isClickedFancyGuy) {
                    repeat(200) {
                        fancyGuySize += (if (it < 100) 1f else -1f) * 0.03f * (it % 100).toFloat().pow(0.8f)
                        fancyGuyRotate += 8f
                        if (fancyGuyRotate % 360f == 0f) fancyGuyRotate = 0f
                        delay(10)
                    }
                    isClickedFancyGuy = false
                }
            }

            Image(
                imageResource(Res.drawable.fancy_guy),
                contentDescription = "Super Fancy Guy!!",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(16.dp)
                    .offset {
                        IntOffset(fancyGuyX.roundToInt(), fancyGuyY.roundToInt())
                    }
                    .pointerInput(Unit) {
                        detectDragGestures { change, dragAmount ->
                            change.consume()
                            fancyGuyX += dragAmount.x
                            fancyGuyY += dragAmount.y
                        }
                    }
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onTap = {
                                isClickedFancyGuy = true
                            },
                            onDoubleTap = {
                                isDialogShowing = true
                            },
                            onLongPress = {
                                isClickedFancyGuy = false
                                fancyGuySize = 80f
                                fancyGuyRotate = 0f
                                fancyGuyX = 0f
                                fancyGuyY = 0f
                            }
                        )
                    }
                    .size(fancyGuySize.dp)
                    .rotate(fancyGuyRotate)
            )

            var fanRotate by rememberSaveable { mutableStateOf(0f) }

            LaunchedEffect(Unit) {
                while (true) {
                    fanRotate += 3f
                    if (fanRotate % 360f == 0f) fanRotate = 0f
                    delay(10)
                }
            }

            Image(
                imageResource(Res.drawable.fan),
                contentDescription = "Super Fancy FAN!!",
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(16.dp)
                    .clip(CircleShape)
                    .sizeIn(
                        maxWidth = with (LocalDensity.current) { constraints.maxWidth.toDp() * 0.8f },
                        maxHeight = with (LocalDensity.current) { constraints.maxHeight.toDp() * 0.8f }
                    )
                    .rotate(fanRotate)
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onTap = {
                                if (colorOrder == colorList.size - 1) colorOrder = 0
                                else colorOrder += 1
                            },
                            onLongPress = {
                                if (textOrder == textList.size - 1) textOrder = 0
                                else textOrder += 1
                            }
                        )
                    }
            )

        }

        SuperDialog(
            isDialogShowing = isDialogShowing,
            onDismissRequest = { isDialogShowing = false },
            fontFamily = nanumSquareNeo
        )
    }
}


@Composable
fun SuperDialog(isDialogShowing: Boolean, onDismissRequest: () -> Unit, fontFamily: FontFamily) {
    if (isDialogShowing) {
        AlertDialog(
            onDismissRequest = onDismissRequest,
            modifier = Modifier,
            title = { Text(text = "당신은 무려 Super Fancy Guy를 더블 클릭하였습니다!!", fontFamily = fontFamily) },
            text = {
                SelectionContainer {
                    Text(
                        text = " 여기에는 심심하니까 아무 텍스트나 적어볼게요.\n" +
                                " 도로교통법에서 규정된 절차에 따라서 갓길 및 반대편 차로를 가변적으로 운영하는 통행 방식이다. 양방향 도로의 통행량이 일정하지 않을 때 1차로 또는 2차로의 통행 방향을 자동 또는 수동으로 바꾸어 사용할 수 있는 차로이다. 가변차로제는 자동차 교통의 혼잡성을 줄이기 위해 규정되었다. \n" +
                                " 도로의 양쪽의 가장자리나 갓길 등을 '가변', '가변차로'라고 칭하는 경우가 있으나 이는 틀린 표현이다. 가변차로의 가변은 변할 수 있다는 의미이므로 완전히 다른 뜻이다. 도로의 가장자리나 갓길을 칭하는 표현으로는 '노변', '도로변', '가로변', '노측', '노견' 등이 있다. '가'와 '변'이라는 말이 측면을 연상시키거나 고속도로에서 갓길을 가변차로로 활용하는 경우가 많은 것 등이 잘못된 표현의 기원으로 보인다.",
                        fontFamily = fontFamily
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        onDismissRequest()
                    }
                ) {
                    Text(text = "안 닫기", fontFamily = fontFamily)
                }
            },
            dismissButton = {
                var text by rememberSaveable { mutableStateOf("닫기") }
                Button(
                    onClick = {
                        text = "안 닫을건데"
                    }
                ) {
                    Text(text = text, fontFamily = fontFamily)
                }
            }
        )
    }
}


// textMeasure을 Remeber하게 만들어주는 함수
@Composable
fun rememberTextMeasure(
    text: String,
    style: TextStyle,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    softWrap: Boolean = true,
    overflow: TextOverflow = TextOverflow.Clip,
    constraints: Constraints = Constraints()
): TextLayoutResult {
    val density = LocalDensity.current
    val layoutDirection = LocalLayoutDirection.current
    val fontFamilyResolver = LocalFontFamilyResolver.current

    return remember(
        text, style, maxLines, minLines, softWrap, overflow, constraints,
        density, layoutDirection, fontFamilyResolver
    ) {
        textMeasure(
            text = text,
            style = style,
            maxLines = maxLines,
            minLines = minLines,
            softWrap = softWrap,
            overflow = overflow,
            density = density,
            layoutDirection = layoutDirection,
            fontFamilyResolver = fontFamilyResolver,
            constraints = constraints
        )
    }
}

// @Composable Text()를 실행했을 때, 그 Composable의 크기를 계산해주는 함수
@OptIn(InternalFoundationTextApi::class)
fun textMeasure(
    text: String,
    style: TextStyle,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    softWrap: Boolean = true,
    overflow: TextOverflow = TextOverflow.Clip,
    density: Density,
    layoutDirection: LayoutDirection,
    fontFamilyResolver: FontFamily.Resolver,
    constraints: Constraints = Constraints()
): TextLayoutResult {
    return TextDelegate(
        text = AnnotatedString(text),
        style = style,
        maxLines = maxLines,
        minLines = minLines,
        softWrap = softWrap,
        overflow = overflow,
        density = density,
        fontFamilyResolver = fontFamilyResolver
    ).layout(
        constraints = constraints,
        layoutDirection = layoutDirection
    )
}