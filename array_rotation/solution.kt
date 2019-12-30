//  Using Extra Array
fun rotate(nums: IntArray, k: Int): Unit {
    val a = IntArray(nums.size)
    for (i in nums.indices) {
        a[(i + k) % nums.size] = nums[i]
    }
    for (i in nums.indices) {
        nums[i] = a[i]
    }
}

// Using Cyclic Replacements
fun rotate(nums: IntArray, k: Int): Unit {
    var d = k % nums.size
    var count = 0
    var start = 0
    while (count < nums.size) {
        var current = start
        var prev = nums[start]
        do {
            val next: Int = (current + d) % nums.size

            val temp = nums[next]
            nums[next] = prev
            prev = temp

            current = next
            count++
        } while (start != current)
        start++
    }
}

// Using Reverse
fun rotate(nums: IntArray, k: Int) {
    var k = k
    k %= nums.size
    reverse(nums, 0, nums.size - 1)
    reverse(nums, 0, k - 1)
    reverse(nums, k, nums.size - 1)
}

fun reverse(nums: IntArray, start: Int, end: Int) {
    var start = start
    var end = end
    while (start < end) {
        val temp = nums[start]
        nums[start] = nums[end]
        nums[end] = temp
        start++
        end--
    }
}