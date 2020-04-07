class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        if (k == 1) return nums

        val maxNumArray = arrayListOf<Int>()
        var index = 0

        while (index <= nums.size - k) {
            var subIndex = 0
            var max = 0

            while (subIndex < k) {
                max = if (max > nums[index + subIndex]) max else nums[index + subIndex]
                subIndex += 1
            }

            maxNumArray.add(max)
            index += 1
        }

        return maxNumArray.toIntArray()
    }
}