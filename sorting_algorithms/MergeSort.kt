fun mergeSort(a: Array<Int>): Array<Int> {
    val list: MutableList<Int> = a.toMutableList()
    if (a.size == 1) return a

    return merge(
            mergeSort(list.subList(0, list.size / 2).toTypedArray()),
            mergeSort(list.subList(list.size / 2, list.size).toTypedArray())
    )
}

fun merge(left: Array<Int>, right: Array<Int>): Array<Int> {
    val result = mutableListOf<Int>()
    var leftIndex = 0
    var rightIndex = 0
    while (leftIndex < left.size && rightIndex < right.size) {
        if (left[leftIndex] < right[rightIndex]) {
            result.add(left[leftIndex])
            leftIndex += 1
        } else {
            result.add(right[rightIndex])
            rightIndex += 1
        }
    }

    result.addAll(left.asList().subList(leftIndex, left.size))
    result.addAll(right.asList().subList(rightIndex, right.size))
    return result.toTypedArray()
}