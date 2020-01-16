fun pickingNumbers(a: Array<Int>): Int {
    val map = mutableMapOf<Int, Int>()
    for (n in a) {
        val value: Int = if (map.keys.contains(n)) {
            map[n]!!.plus(1)
        } else {
            1
        }
        map[n] = value
    }
    var max = 0

    for (k in map.keys) {
        val s: Int = map[k]!!
        var s1 = 0
        if (map.keys.contains(k + 1)) {
            s1 = map[k + 1]!!
        }

        if (max < (s + s1)) max = s + s1
    }

    return max
}