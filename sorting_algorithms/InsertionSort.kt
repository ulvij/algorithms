fun insertionSort(a: Array<Int>): Array<Int> {
    val list: MutableList<Int> = a.toMutableList()

    for (i in 0..list.lastIndex) {
        var item = 0
        if (list[i] < list[0]) {
            item = list[i]
            list.removeAt(i)
            list.add(0, item)
            continue
        }

        var index = -1
        var j = i
        while (j >= 0) {
            if (list[i] < list[j]) {
                index = j
            }
            j -= 1
        }
        if (index != -1) {
            item = list[i]
            list.removeAt(i)
            list.add(index, item)
        }
    }

    return list.toTypedArray()
}