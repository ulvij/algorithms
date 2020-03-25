# Sqrt(x)
      
**Difficulty** : Easy

**Link** : https://leetcode.com/problems/sqrtx/

Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

#### Example 1:

```
Input: 4
Output: 2
```

#### Example 2:

```
Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.
```

## SOLUTION IN KOTLIN

#### Newton's method

```kotlin
class Solution {

    fun mySqrtNewtonApproach(x: Int): Int {
        if (x==0) return 0

        var res:Long = x.toLong()
        while (res*res>x){
            res = (res+x/res)/2
        }

        return res.toInt()
    }
}
```

#### Binary search method

```kotlin
class Solution {
    
    fun mySqrtBinarySearchApproach(x: Int): Int {
        if (x == 0 || x == 1) return x
        var left :Long= 1
        var right = x.toLong()
        var sqrtNum :Long= 0

        while (left <= right) {
            val mid = (left + right) / 2
            if (mid * mid == x.toLong()) {
                sqrtNum = mid
                break
            } else if ((mid * mid) > x) {
                right = mid - 1
            } else {
                sqrtNum = mid
                left = mid + 1
            }
        }
        return sqrtNum.toInt()
    }
}
```
