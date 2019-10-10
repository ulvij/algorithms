# Two Sum 

__Dificulty__ : Easy

__Link__ : https://leetcode.com/problems/two-sum/


Given an array of integers, return __indices__ of the two numbers such that they add up to a specific target.

You may assume that each input would have __exactly__ one solution, and you may not use the same element twice.

#### Example:

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

## SOLUTION

```kotlin
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
```
