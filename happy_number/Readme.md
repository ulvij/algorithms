# Happy Number
      
**Difficulty** : Easy

**Link** : https://leetcode.com/problems/happy-number/

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

#### Example:

```
Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
```

## SOLUTION IN KOTLIN

```kotlin
class Solution {

    fun isHappyUsingKotlinDSL(n: Int): Boolean {
        var num = n
        val set = hashSetOf<Int>()
        while (set.add(num)) {
            val sum = num
                    .toString()
                    .toCharArray()
                    .map { it.toString().toInt() }
                    .toTypedArray().map { it * it }
                    .sum()
            if (sum == 1) return true else num = sum
        }
        return false
    }

    fun isHappy(n: Int): Boolean {
        var num = n
        val set = hashSetOf<Int>()
        while (set.add(num)) {
            var sum = 0
            while (num > 0) {
                val remain = num % 10
                sum += remain * remain
                num /= 10
            }
            if (sum == 1) return true else num = sum
        }
        return false
    }

}
```
