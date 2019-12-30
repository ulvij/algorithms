# Maximum Subarray 

__Dificulty__ : Easy

__Link__ : https://leetcode.com/problems/maximum-subarray/


Given an integer array __nums__, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

#### Example:

```
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
```
#### Follow up:
If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

## SOLUTION IN KOTLIN

#### Brute force solution
###### 
- Time Complexity : O(n)
- Space Complexity :  O(1)

```kotlin
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
```