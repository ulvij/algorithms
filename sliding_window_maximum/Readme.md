# Sliding Window Maximum
      
**Difficulty** : Hard

**Link** : https://leetcode.com/problems/sliding-window-maximum/

Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.

Follow up: Could you solve it in linear time?

#### Example :

```
Input: nums = [1,3,-1,-3,5,3,6,7], and k = 3
Output: [3,3,5,5,6,7] 
Explanation: 

Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
```

#### Constraints:

```
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4
- 1 <= k <= nums.length
```

## SOLUTION IN KOTLIN 
#### Time complexity : O(NK) (N - size of array)

```kotlin
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
```
