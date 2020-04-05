# Single Number
      
**Difficulty** : Easy

**Link** : https://leetcode.com/problems/single-number/

Given a __non-empty__ array of integers, every element appears twice except for one. Find that single one.

__Note:__

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

#### Example 1:

```
Input: [2,2,1]
Output: 1
```

#### Example 2:

```
Input: [4,1,2,1,2]
Output: 4
```

## SOLUTION IN KOTLIN

```kotlin
class Solution {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (i in nums) {
            result = result xor i
        }
        return result
    }
}
```
