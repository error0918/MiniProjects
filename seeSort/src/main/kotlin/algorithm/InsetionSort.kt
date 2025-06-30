package algorithm

import MainViewModel

class InsertionSort(
    private val mainViewModel: MainViewModel = MainViewModel()
): Algorithm(mainViewModel) {
    override suspend fun run() {
        mainViewModel.updateCount(arrayAccessCount = 1)
        reflect()
        for (i in 1 until mainViewModel.array.size) {
            val temp = mainViewModel.array[i]
            var j = i - 1
            mainViewModel.updateCount(arrayAccessCount = 1)
            reflect(accessedIndex = listOf(i))

            while (j >= 0 && mainViewModel.array[j] > temp) {
                mainViewModel.updateCount(arrayAccessCount = 1, comparisonCount = 2)
                reflect(); reflect(); reflect(comparisonIndex = listOf(i, j))

                mainViewModel.array[j + 1] = mainViewModel.array[j]
                j -= 1
                mainViewModel.updateCount(arrayAccessCount = 2)
                reflect(); reflect(accessedIndex = listOf(j, j + 1))
            }

            mainViewModel.array[j + 1] = temp
            mainViewModel.updateCount(arrayAccessCount = 1)
            reflect(accessedIndex = listOf(i, j + 1), isBeep = true)
        }

        super.endRun()
    }

    override fun realSort(array: Array<Int>): Array<Int> {
        for (i in 1 until array.size) {
            val temp = array[i]
            var j = i - 1
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j]
                j -= 1
            }
            array[j + 1] = temp
        }
        return array
    }
}