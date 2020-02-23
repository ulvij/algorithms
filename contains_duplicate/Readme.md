# Contains Duplicate

**Difficulty** : Easy

**Link** : https://leetcode.com/problems/contains-duplicate/

Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

#### Example 1:
```
Input: [1,2,3,1]
Output: true
```

#### Example 2:
```
Input: [1,2,3,4]
Output: false
```

#### Example 3:
```
Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
```
## SOLUTION IN KOTLIN

### 1.Naive Linear Search approach
```kotlin
fun containsDuplicate(nums: IntArray): Boolean {
    for (i in nums.indices) {
        for (j in 0 until i) {
            if (nums[j] == nums[i]) return true
        }
    }
    return false
}
```
Complexity Analysis
- Time complexity : O(n^2). In the worst case, there are (n(n+1))/2 pairs of integers to check. Therefore, the time complexity is O(n^2)
- Space complexity : O(1). We only used constant extra space.

### 2.Sorting approach
```kotlin
fun containsDuplicate(nums: IntArray): Boolean {
    Arrays.sort(nums)
    for (i in 0 until nums.size - 1) {
        if (nums[i] == nums[i + 1]) return true
    }
    return false
}
```
Complexity Analysis
- Time complexity : O(nlogn). Sorting is O(nlogn)and the sweeping is O(n). The entire algorithm is dominated by the sorting step, which is O(nlogn).
- Space complexity : O(1). Space depends on the sorting implementation which, usually, costs O(1) auxiliary space if heapsort is used.

### 3. Hash Table approach
```kotlin
fun containsDuplicate(nums: IntArray): Boolean {
    val map = HashSet<Int>()
    for (n in nums) {
        if (map.contains(n)) {
            return true
        }
        map.add(n)
    }
    return false
}
```
Complexity Analysis
- Time complexity : O(n). We do search() and insert() for n times and each operation takes constant time.
- Space complexity : O(n). The space used by a hash table is linear with the number of elements in it.

