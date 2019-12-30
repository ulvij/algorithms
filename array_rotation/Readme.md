# Rotate Array

**Dificulty** : Easy

**Link** : https://leetcode.com/problems/rotate-array/

Given an array, rotate the array to the right by k steps, where k is non-negative.


#### Example 1:

```
Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
```

#### Example 2:

```
Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
```

#### Note:
- Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
- Could you do it in-place with O(1) extra space?


## SOLUTION IN KOTLIN


### 1. Using Extra Array
```kotlin
fun rotate(nums: IntArray, k: Int): Unit {
    val a = IntArray(nums.size)
    for (i in nums.indices) {
        a[(i + k) % nums.size] = nums[i]
    }
    for (i in nums.indices) {
        nums[i] = a[i]
    }
}
```
Complexity Analysis
- Time complexity : O(n). One pass is used to put the numbers in the new array. And another pass to copy the new array to the original one.
- Space complexity : O(n). Another array of the same size is used.

### 2. Using Cyclic Replacements
```kotlin
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
```
Complexity Analysis
- Time complexity : O(n). Only one pass is used.
- Space complexity : O(1). Constant extra space is used.


### 3. Using Reverse
```kotlin
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
```
Complexity Analysis
- Time complexity : O(n). nn elements are reversed a total of three times.
- Space complexity : O(1). No extra space is used.
