fun selectionSort(a: Array<Int>): Array<Int> {
    var i = 0
    while (i < a.size) {
        var minIndex = i
        for (k in i..a.lastIndex) {
            if (a[minIndex] > a[k]) {
                minIndex = k
            }
        }
        val temp = a[i]
        a[i] = a[minIndex]
        a[minIndex] = temp
        i += 1
    }
    return a
}