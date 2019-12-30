
// Hash Table Approcach
fun containsDuplicate(nums: IntArray): Boolean {
    val map = HashSet<Int>()
    for (n in nums) {
        if (map.contains(n)) {
            return true
        }
        map.add(n)
    }
    return false
}

// Naive Linear Search Approach
fun containsDuplicate(nums: IntArray): Boolean {
    for (i in nums.indices) {
        for (j in 0 until i) {
            if (nums[j] == nums[i]) return true
        }
    }
    return false
}

// Sorting Approach
fun containsDuplicate(nums: IntArray): Boolean {
    Arrays.sort(nums)
    for (i in 0 until nums.size - 1) {
        if (nums[i] == nums[i + 1]) return true
    }
    return false
}