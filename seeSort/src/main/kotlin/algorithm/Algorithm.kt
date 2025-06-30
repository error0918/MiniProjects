package algorithm

import MainViewModel

abstract class Algorithm(
    private val mainViewModel: MainViewModel
) {
    abstract suspend fun run()
    abstract fun realSort(array: Array<Int>): Array<Int>

    private var count = 0
    private suspend fun delay(microSecond: Int) {
        count += microSecond
        if (count >= 1000) {
            kotlinx.coroutines.delay(count / 1000L)
            count %= 1000
        }
    }

    suspend fun reflect(
        accessedIndex: List<Int>? = null,
        comparisonIndex: List<Int>? = null,
        isBeep: Boolean = false,
        isDelay: Boolean = true
    ) {
        accessedIndex?.let { mainViewModel.accessedIndex = accessedIndex }
        comparisonIndex?.let { mainViewModel.comparisonIndex = comparisonIndex }
        if (isBeep && mainViewModel.arrayTime >= 0.2f) mainViewModel.playSound()
        if (isDelay) delay((mainViewModel.arrayTime * 1000).toInt())
    }

    suspend fun endRun() {
        mainViewModel.accessedIndex = listOf()
        mainViewModel.comparisonIndex = listOf()

        for (i in mainViewModel.array.indices) {
            mainViewModel.playSound()
            mainViewModel.verifiedIndex = List(i + 1) { it }
            delay(((mainViewModel.arrayTime * 1000).toInt() * 100).let { if (it < 50000) it else 50000 })
        }

        mainViewModel.turn(isRunning = false, isEnded = true)
    }
}

