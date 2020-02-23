# Container With Most Water

__Difficulty__ : Medium

__Link__ : https://leetcode.com/problems/container-with-most-water/

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

__Note :__  You may not slant the container and n is at least 2.

#### Example 1:

```
Input: [1,8,6,2,5,4,8,3,7]
Output: 49
```

## SOLUTION IN KOTLIN

### BRUTE FORCE

```kotlin
fun maxAreaBruteForce(height: IntArray): Int {
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
```

### TWO POINTER APPROACH

```kotlin
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
```
