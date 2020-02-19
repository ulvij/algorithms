fun quickSort(a: Array<Int>, left: Int, right: Int): Array<Int> {
    var pivot = 0
    var partitionIndex = 0

    if (left < right) {
        pivot = right
        partitionIndex = partition(a, pivot, left, right)

        quickSort(a, left, partitionIndex - 1)
        quickSort(a, partitionIndex + 1, right)
    }

    return a
}

fun partition(a: Array<Int>, pivot: Int, left: Int, right: Int): Int {
    val pivotValue = a[pivot]
    var partitionIndex = left

    for (i in left..right) {
        if (a[i] < pivotValue) {
            swap(a, i, partitionIndex)
            partitionIndex += 1
        }
    }

    swap(a, right, partitionIndex)
    return partitionIndex
}

fun swap(a: Array<Int>, i: Int, partitionIndex: Int) {
    val temp = a[i]
    a[i] = a[partitionIndex]
    a[partitionIndex] = temp
}