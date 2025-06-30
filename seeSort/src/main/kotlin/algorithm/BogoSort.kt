package algorithm

import MainViewModel
import java.util.*

class BogoSort(
    private val mainViewModel: MainViewModel = MainViewModel()
): Algorithm(mainViewModel) {
    private val random = Random()
    private val allIndex = List(mainViewModel.arraySize) { it }

    override suspend fun run() {
        reflect(accessedIndex = listOf(), isDelay = false)
        while (true) {
            shuffle()
            if (comparison()) break
        }
        super.endRun()
    }

    private suspend fun shuffle() {
        for (i in mainViewModel.array.lastIndex downTo 1) {
            mainViewModel.updateCount(arrayAccessCount = 4)
            val j = random.nextInt(i + 1)
            val temp = mainViewModel.array[i]; reflect()
            mainViewModel.array[i] = mainViewModel.array[j]; reflect(); reflect()
            mainViewModel.array[j] = temp; reflect()
        }
        reflect(accessedIndex = allIndex, isBeep = true, isDelay = false)
    }

    private suspend fun comparison(): Boolean {
        mainViewModel.updateCount(arrayAccessCount = 1)
        var last = mainViewModel.array[0]; reflect()
        for (i in 1 until mainViewModel.arraySize) {
            mainViewModel.updateCount(comparisonCount = 1)
            reflect(comparisonIndex = List(i + 1) { it }, isBeep = true, isDelay = false)
            if (mainViewModel.array[i] < last) return false; reflect()
            mainViewModel.updateCount(arrayAccessCount = 1)
            last = mainViewModel.array[i]; reflect()
        }
        return true
    }

    override fun realSort(array: Array<Int>): Array<Int> {
        while (true) {
            array.shuffle()
            for (i in 1 until array.size) {
                if (array[i] < array[i - 1]) break
                if (i == array.size - 1) return array
            }
        }
    }
}