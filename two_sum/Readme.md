# Two Sum 

__Difficulty__ : Easy

__Link__ : https://leetcode.com/problems/two-sum/


Given an array of integers, return __indices__ of the two numbers such that they add up to a specific target.

You may assume that each input would have __exactly__ one solution, and you may not use the same element twice.

#### Example:

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

## SOLUTION IN KOTLIN

#### Brute force solution
###### Time Complexity of this solution is Big O(n^2) - Quadratic

```kotlin
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
```

#### HashTable Solution
###### Time Complexity of this solution is Big O(n) - Linear

```kotlin
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
```