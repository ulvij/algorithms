fun maxAreaTwoPointerApproach(height: IntArray): Int {
    var maxArea: Int = 0
    var i = 0
    var j = height.lastIndex
    while (i < j) {
        val level = if (height[i] <= height[j]) {
            height[i]
        } else {
            height[j]
        }

        val step = if (j - i < 0) {
            -(j - i)
        } else {
            j - i
        }
        if (level * step > maxArea) maxArea = level * step
        if (height[i] > height[j]) {
            j -= 1
        } else {
            i += 1
        }
    }

    return maxArea

}