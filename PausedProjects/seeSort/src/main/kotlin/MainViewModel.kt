import algorithm.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import java.awt.Toolkit
import java.util.*
import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

class MainViewModel {
    val windowState = WindowState(size = DpSize(1500.dp, 1000.dp))
    val algorithmClassList = listOf(SelectionSort::class, DoubleSelectionSort::class, BubbleSort::class, InsertionSort::class, BogoSort::class)
    private val random = Random()

    var darkTheme by mutableStateOf(true)
    var debugMode by mutableStateOf(false)

    var algorithmClass by mutableStateOf<KClass<out Algorithm>>(SelectionSort::class)
    var algorithm by mutableStateOf<Algorithm?>(null)
        private set
    var isRunning by mutableStateOf(false)
        private set

    var arraySize by mutableStateOf(50)
        private set
    var arrayMaxValue by mutableStateOf(500)
        private set
    var arrayTime by mutableStateOf(0.2f)
        private set

    var array = mutableStateListOf<Int>().apply { repeat(arraySize) { add(random.nextInt(arrayMaxValue) + 1) } }
    var accessedIndex by mutableStateOf(listOf(arraySize - 1))
    var comparisonIndex by mutableStateOf(listOf<Int>())
    var verifiedIndex by mutableStateOf(listOf<Int>())

    var arrayAccessCount by mutableStateOf(0)
        private set
    var comparisonCount by mutableStateOf(0)
        private set


    fun updateAlgorithm() {
        this.algorithm = algorithmClass.primaryConstructor?.call(this)
    }

    fun updateArray(
        arraySize: Int = this.arraySize,
        arrayMaxValue: Int = this.arrayMaxValue,
        arrayTime: Float = this.arrayTime,
        isBeep: Boolean = true,
    ) {
        this.accessedIndex = listOf()
        this.comparisonIndex = listOf()
        this.verifiedIndex = listOf()

        this.arraySize = arraySize
        this.arrayMaxValue = arrayMaxValue
        this.arrayTime = arrayTime

        this.array.clear()
        repeat(this.arraySize) { this.array.add(random.nextInt(this.arrayMaxValue) + 1) }
        this.accessedIndex = listOf(arraySize - 1)

        if (isBeep) playSound()
    }

    fun updateCount(arrayAccessCount: Int = 0, comparisonCount: Int = 0) {
        this.arrayAccessCount += arrayAccessCount
        this.comparisonCount += comparisonCount
    }

    fun turn(isRunning: Boolean, isEnded: Boolean = false) {
        this.isRunning = isRunning
        if (isRunning) {
            this.accessedIndex = listOf()
            this.comparisonIndex = listOf()
            this.verifiedIndex = listOf()
        }
        if (!isEnded) {
            this.arrayAccessCount = 0
            this.comparisonCount = 0
        }
    }

    fun playSound() {
        Toolkit.getDefaultToolkit().beep()
    }
}