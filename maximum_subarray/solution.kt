fun maxSubArray(nums: IntArray): Int {
    if (nums.size==1)return nums[0]
    var max = nums[0]
    var current = nums[0]

    for (i in 1..nums.lastIndex){
        current = nums[i].coerceAtLeast(current + nums[i])
        max = max.coerceAtLeast(current)
    }

    return max
}