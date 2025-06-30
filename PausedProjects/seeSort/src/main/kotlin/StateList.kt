import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import java.awt.Toolkit
import kotlin.random.Random


enum class COMPARE { EQUALS, GREATER, GREATER_EQUALS, LESS, LESS_EQUALS }

class StateList(
    vararg elements: Int = IntArray(50) { Random.nextInt(500) + 1 }
): MutableList<Int> {
    private val list = mutableStateListOf(*elements.toTypedArray())
    val accessedList = mutableStateListOf<Int>()
    val comparedList = mutableStateListOf<Int>()
    val verifiedList = mutableStateListOf<Int>()

    var arrayAccessCount by mutableStateOf(0)
        private set
    var comparisonCount by mutableStateOf(0)
        private set

    var arraySize by mutableStateOf(50)
        private set
    var arrayMaxValue by mutableStateOf(500)
        private set
    var arrayTime by mutableStateOf(0.2f)
        private set

    override val size get() = list.size
    val max get() = list.max()
    val indices get() = list.indices

    override operator fun get(index: Int) = list[index]
    override operator fun set(index: Int, element: Int) = list.set(index, element)
    override operator fun contains(element: Int) = list.contains(element)

    override fun add(element: Int) = list.add(element)
    override fun add(index: Int, element: Int) = list.add(index, element)
    override fun addAll(elements: Collection<Int>) = list.addAll(elements)
    override fun addAll(index: Int, elements: Collection<Int>) = list.addAll(index, elements)
    override fun clear() = list.clear()
    override fun containsAll(elements: Collection<Int>) = list.containsAll(elements)
    override fun indexOf(element: Int) = list.indexOf(element)
    override fun isEmpty() = list.isEmpty()
    override fun iterator() = list.iterator()
    override fun lastIndexOf(element: Int) = list.lastIndexOf(element)
    override fun listIterator() = list.listIterator()
    override fun listIterator(index: Int) = list.listIterator(index)
    override fun remove(element: Int) = list.remove(element)
    override fun removeAll(elements: Collection<Int>) = list.removeAll(elements)
    override fun removeAt(index: Int) = list.removeAt(index)
    override fun retainAll(elements: Collection<Int>) = list.retainAll(elements)
    override fun subList(fromIndex: Int, toIndex: Int) = StateList(*list.subList(fromIndex, toIndex).toIntArray())

    override fun toString() = "[${list.joinToString(", ")}]"
    fun accessedToString() = "[${accessedList.joinToString(", ")}]"
    fun comparedToString() = "[${comparedList.joinToString(", ")}]"
    fun verifiedToString() = "[${verifiedList.joinToString(", ")}]"

    fun replaceAll(elements: Collection<Int>) {
        clear()
        addAll(elements)
    }

    fun update(
        arraySize: Int = this.arraySize,
        arrayMaxValue: Int = this.arrayMaxValue,
        arrayTime: Float = this.arrayTime,
        isBeep: Boolean = true,
    ) {
        clear()
        accessedList.clear()
        comparedList.clear()
        verifiedList.clear()

        this.arraySize = arraySize
        this.arrayMaxValue = arrayMaxValue
        this.arrayTime = arrayTime

        for (dummy in 0 ..< arraySize)
            add(Random.nextInt(arrayMaxValue) + 1)

        if (isBeep) playSound()
    }

    private fun playSound() {
        Toolkit.getDefaultToolkit().beep()
        arrayListOf(9)
    }


    interface AlgorithmList {
        val size: Int
        operator fun get(index: Int): Int
        operator fun set(index: Int, value: Int)
        fun compare(value1: Int? = null, index1: Int? = null, value2: Int? = null, index2: Int? = null, compare: COMPARE): Boolean
        fun resetAccessed()
        fun resetCompared()
    }

    val algorithmList = object : AlgorithmList {
        private val stateList = this@StateList

        override val size: Int get() {
            arrayAccessCount += 1
            return stateList.size
        }
        override operator fun get(index: Int): Int {
            arrayAccessCount += 1
            accessedList.add(index)
            return stateList[index]
        }
        override operator fun set(index: Int, value: Int) {
            arrayAccessCount += 1
            accessedList.add(index)
            stateList[index] = value
        }

        override fun compare(value1: Int?, index1: Int?, value2: Int?, index2: Int?, compare: COMPARE): Boolean {
            if ((value1 == null && index1 == null) || (value2 == null && index2 == null))
                throw Exception()

            val target1 = value1 ?: get(index1!!)
            val target2 = value2 ?: get(index2!!)

            comparisonCount += 1
            if (index1 != null) comparedList.add(index1)
            if (index2 != null) comparedList.add(index2)

            return when (compare) {
                COMPARE.EQUALS -> target1 == target2
                COMPARE.GREATER -> target1 > target2
                COMPARE.GREATER_EQUALS -> target1 >= target2
                COMPARE.LESS -> target1 < target2
                COMPARE.LESS_EQUALS -> target1 <= target2
            }
        }

        override fun resetAccessed() = accessedList.clear()
        override fun resetCompared() = comparedList.clear()
    } // How Can I Suspend It?
}