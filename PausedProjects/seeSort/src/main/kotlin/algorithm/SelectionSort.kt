package algorithm

import MainViewModel

class SelectionSort(
    private val mainViewModel: MainViewModel = MainViewModel()
): Algorithm(mainViewModel) {

    override suspend fun run() {
        mainViewModel.updateCount(arrayAccessCount = 1)
        reflect()
        for (i in mainViewModel.array.indices) {
            var min = i

            mainViewModel.updateCount(arrayAccessCount = 1)
            reflect()
            for (j in i until mainViewModel.array.size) {
                mainViewModel.updateCount(arrayAccessCount = 2, comparisonCount = 2)
                reflect(); reflect(); reflect(); reflect(comparisonIndex = listOf(j, min))
                if (mainViewModel.array[j] < mainViewModel.array[min]) min = j
            }

            mainViewModel.updateCount(arrayAccessCount = 4)
            reflect(); reflect(); reflect(); reflect(accessedIndex = listOf(i, min), isBeep = true)
            val temp = mainViewModel.array[i]
            mainViewModel.array[i] = mainViewModel.array[min]
            mainViewModel.array[min] = temp
        }

        super.endRun()
    }

    override fun realSort(array: Array<Int>): Array<Int> {
        for (i in array.indices) {
            var min = i
            for (j in i until array.size) {
                if (array[j] < array[min]) min = j
            }

            val temp = array[i]
            array[i] = array[min]
            array[min] = temp
        }
        return array
    }
}