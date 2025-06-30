package algorithm

import MainViewModel

class BubbleSort(
    private val mainViewModel: MainViewModel = MainViewModel()
): Algorithm(mainViewModel) {
    override suspend fun run() {
        mainViewModel.updateCount(arrayAccessCount = 1)
        reflect()
        for (i in 0 .. mainViewModel.array.size - 2) {
            mainViewModel.updateCount(arrayAccessCount = 1)
            reflect()
            for (j in 0 .. mainViewModel.array.size - 2 - i) {
                mainViewModel.updateCount(arrayAccessCount = 2, comparisonCount = 1)
                reflect(); reflect(); reflect(comparisonIndex = listOf(j, j + 1))
                if (mainViewModel.array[j] > mainViewModel.array[j + 1]) {
                    mainViewModel.updateCount(arrayAccessCount = 4)
                    reflect(); reflect(); reflect(); reflect(accessedIndex = listOf(j, j + 1), isBeep = true)
                    val temp = mainViewModel.array[j]
                    mainViewModel.array[j] = mainViewModel.array[j + 1]
                    mainViewModel.array[j + 1] = temp
                }
            }
        }

        super.endRun()
    }

    override fun realSort(array: Array<Int>): Array<Int> {
        for (i in 0 .. array.size - 2) {
            for (j in 0 .. array.size - 2 - i) {
                if (array[j] > array[j + 1]) {
                    val temp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temp
                }
                println("TRY$i-$j: ${array.joinToString(", ")}")
            }
        }
        return array
    }
}