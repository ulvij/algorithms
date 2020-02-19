# Sorting Algorithms

Link for visualize : https://visualgo.net/bn/sorting

Implementations in ```Kotlin ```

### Bubble Sort

__Time Complexity :__ 
- Best - O(n)
- Average - O(n^2)
- Worst - O(n^2)

__Space Complexity :__ 

- Worst - O(1)

```kotlin
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
```

### Selection Sort

__Time Complexity :__ 
- Best - O(n^2)
- Average - O(n^2)
- Worst - O(n^2)

__Space Complexity :__ 

- Worst - O(1)

```kotlin
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
```

### Insertion Sort

__Time Complexity :__ 
- Best - O(n)
- Average - O(n^2)
- Worst - O(n^2)

__Space Complexity :__ 

- Worst - O(1)

```kotlin
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
```

### Merge Sort

__Time Complexity :__ 
- Best - O(n log(n))
- Average - O(n log(n))
- Worst - O(n log(n))

__Space Complexity :__ 

- Worst - O(n)

```kotlin
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
```

### Quick Sort

__Time Complexity :__ 
- Best - O(n log(n))
- Average - O(n log(n))
- Worst - O(n^2)

__Space Complexity :__ 

- Worst - O(log(n))

```kotlin
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
```