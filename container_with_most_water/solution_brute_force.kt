fun maxArea(height: IntArray): Int {
    var maxArea = 0
    for (i in height.indices) {
        for (j in height.indices) {
            var level = if (height[i] <= height[j]) {
                height[i]
            } else {
                height[j]
            }

            val step = if (j - i < 0) {
                -(j - i)
            } else {
                j - i
            }
            if (step==0) level = 0
            if (level * step > maxArea) {
                maxArea = level*step
            }
        }
    }
    return maxArea
}