import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState

enum class VerticalDirection { Up, Down }
enum class HorizontalDirection { ToRight, ToLeft }

class MainViewModel {
    val boxWidth = 500.dp
    val boxHeight = 550.dp
    val windowState = WindowState(
        position = WindowPosition(Alignment.Center),
        size = DpSize(boxWidth + 20.dp, boxHeight + 20.dp + 75.dp)
    )

    // Settings
    val mapWidth = 10
    val mapHeight = 11
    val fps = 240
    private val trueBallSpeed = 1.4.dp
    private val falseBallSpeed = 1.6.dp

    // Values
    val map = makeMap(mapWidth, mapHeight)
    var isDebug by mutableStateOf(false)
    var isRunning by mutableStateOf(false)

    // TrueBall
    var trueBallX by mutableStateOf(10.dp)
    var trueBallY by mutableStateOf(20.dp)
    var trueBallVD by mutableStateOf(VerticalDirection.Down)
    var trueBallHD by mutableStateOf(HorizontalDirection.ToRight)

    // FalseBall
    var falseBallX by mutableStateOf((-10).dp)
    var falseBallY by mutableStateOf((-20).dp)
    var falseBallVD by mutableStateOf(VerticalDirection.Up)
    var falseBallHD by mutableStateOf(HorizontalDirection.ToLeft)


    fun makeMap(mapWidth: Int, mapHeight: Int): SnapshotStateList<SnapshotStateList<Boolean>> {
        val result = SnapshotStateList<SnapshotStateList<Boolean>>()

        for (i in 1 .. mapHeight) {
            val line = mutableStateListOf<Boolean>()
            val falseLen = mapWidth * i / mapHeight
            val trueLen = mapWidth - falseLen
            repeat(trueLen) { line.add(true) }
            repeat(falseLen) { line.add(false) }
            result.add(line)
        }

        println("Map Made")
        for (line in result) {
            println("  " + line.joinToString(", "))
        }

        return result
    }

    fun move() {
        if (trueBallVD == VerticalDirection.Up) trueBallY -= trueBallSpeed
        else trueBallY += trueBallSpeed
        if (trueBallHD == HorizontalDirection.ToRight) trueBallX += trueBallSpeed
        else trueBallX -= trueBallSpeed

        if (falseBallVD == VerticalDirection.Up) falseBallY -= falseBallSpeed
        else falseBallY += falseBallSpeed
        if (falseBallHD == HorizontalDirection.ToRight) falseBallX += falseBallSpeed
        else falseBallX -= falseBallSpeed
    }
}