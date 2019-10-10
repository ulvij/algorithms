# Median of Two Sorted Arrays

**Dificulties** : Hard

**Link** : https://leetcode.com/problems/median-of-two-sorted-arrays/

There are two sorted arrays __nums1__ and __nums2__ of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume __nums1__ and __nums2__ cannot be both empty.

#### Example 1:

```
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
```


#### Example 2:

```
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
```


## SOLUTION

```kotlin
fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val full = (nums1 + nums2)
    full.sort()
    return if (full.size % 2 == 0) {
        (full[(full.size / 2)-1] + full[(full.size / 2)]) / 2.0
    } else {
        full[(full.size / 2)].toDouble()
    }
}
```
