# Plus One
      
**Difficulty** : Easy

**Link** : https://leetcode.com/problems/plus-one/

Given a __non-empty__ array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

#### Example 1:

```
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
```

#### Example 2:

```
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
```

## SOLUTION IN KOTLIN

```kotlin
class Solution {
    fun plusOne(digits: IntArray): IntArray {
        if (digits.last() < 9) {
            digits[digits.lastIndex] = digits.last() + 1
            return digits
        }

        var leftIndex = 1
        digits[digits.lastIndex] = 0
        var rest = true
        while (leftIndex < digits.size) {
            if (digits[digits.lastIndex - leftIndex] < 9) {
                digits[digits.lastIndex - leftIndex] = digits[digits.lastIndex - leftIndex] + 1
                rest = false
                break
            }
            digits[digits.lastIndex - leftIndex] = 0
            leftIndex += 1
        }

        if (rest) {
            val array = IntArray(digits.size + 1)
            array[0] = 1
            var index = 1
            digits.forEach {
                array[index] = it
                index += 1
            }
            return array
        }

        return digits
    }
}
```
