// Brute force solution
// Time Complexity of this solution is Big O(n^2) - Quadratic
fun twoSum(array: IntArray, target: Int): IntArray {
    for (n in array.indices) {
        for (m in array.indices) {
            if (n == m) continue
            if (array[n] + array[m] == target) {
                return intArrayOf(n, m)
            }
        }
    }
    return intArrayOf()
}

// HashSet Solution
// Time Complexity of this solution is Big O(n) - Linear
fun twoSum(array: IntArray, target: Int): IntArray {
    val set = HashSet<Int>()
    for (n in array) {
        if (set.contains(n)) {
            return intArrayOf(array.indexOf(target-n),array.indexOf(n))
        }
        set.add(target - n)
    }
    return intArrayOf()
}