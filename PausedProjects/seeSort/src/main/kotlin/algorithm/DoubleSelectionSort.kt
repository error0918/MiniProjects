package algorithm

import MainViewModel

class DoubleSelectionSort(
    private val mainViewModel: MainViewModel = MainViewModel()
): Algorithm(mainViewModel) {

    override suspend fun run() {
        mainViewModel.updateCount(arrayAccessCount = 1)
        reflect()
        for (i in 0 until mainViewModel.array.size / 2) {
            var min = i
            var max = i

            mainViewModel.updateCount(arrayAccessCount = 1)
            reflect()
            for (j in i until mainViewModel.array.size - i) {
                mainViewModel.updateCount(arrayAccessCount = 4, comparisonCount = 2)
                reflect(); reflect(); reflect(); reflect(); reflect(); reflect(comparisonIndex = listOf(j, min, max))
                if (mainViewModel.array[j] < mainViewModel.array[min]) min = j
                if (mainViewModel.array[j] > mainViewModel.array[max]) max = j
            }

            mainViewModel.updateCount(arrayAccessCount = 4)
            reflect(); reflect(); reflect(); reflect(accessedIndex = listOf(i, min))
            val temp1 = mainViewModel.array[min]
            mainViewModel.array[min] = mainViewModel.array[i]
            mainViewModel.array[i] = temp1

            mainViewModel.updateCount(arrayAccessCount = 4, comparisonCount = 1)
            reflect(); reflect(); reflect(); reflect(); reflect(accessedIndex = listOf(max, mainViewModel.array.size - i - 1), isBeep = true)
            if (i == max) max = min
            val temp2 = mainViewModel.array[max]
            mainViewModel.array[max] = mainViewModel.array[mainViewModel.array.size - i - 1]
            mainViewModel.array[mainViewModel.array.size - i - 1] = temp2
            mainViewModel.array = mainViewModel.array
        }

        super.endRun()
    }

    override fun realSort(array: Array<Int>): Array<Int> {
        for (i in 0 until array.size / 2) {
            var min = i
            var max = i

            for (j in i until array.size - i) {
                if (array[j] < array[min]) min = j
                if (array[j] > array[max]) max = j
            }

            val temp1 = array[min]
            array[min] = array[i]
            array[i] = temp1

            if (i == max) max = min
            val temp2 = array[max]
            array[max] = array[array.size - i - 1]
            array[array.size - i - 1] = temp2
        }
        return array
    }
}