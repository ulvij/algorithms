fun twoSum(nums: IntArray, target: Int): IntArray {
    var fn: Int
    var fl: Int
    for (n in nums.indices) {
        fn = nums[n]
        for (l in nums.indices) {
            if (n == l) continue
            fl = nums[l]
            if (fn + fl == target) {
                return intArrayOf(n, l)
            }
        }
    }
    return intArrayOf(-1, -1)
}