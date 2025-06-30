import kotlin.math.min

fun <K, V> listToMap(keys: List<K>, values: List<V>): Map<K, V> {
    val map = mutableMapOf<K, V>()
    for (index in 0 until min(keys.size, values.size))
        map[keys[index]] = values[index]
    return map
}

fun intListToDoubleList(list: List<Int>): List<Double> =
        List(list.size) { list[it].toDouble() }