fun bubbleSort(a: Array<Int>): Array<Int> {
    repeat(a.size) {
        for (i in 0 until a.lastIndex) {
            if (a[i] > a[i + 1]) {
                val temp = a[i]
                a[i] = a[i + 1]
                a[i + 1] = temp
            }
        }
    }
    return a
}