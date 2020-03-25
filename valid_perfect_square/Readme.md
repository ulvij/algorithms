# Valid Perfect Square
      
**Difficulty** : Easy

**Link** : https://leetcode.com/problems/valid-perfect-square/

Given a positive integer num, write a function which returns True if num is a perfect square else False.

__Note: Do not__ use any built-in library function such as sqrt.

#### Example 1:

```
Input: 16
Output: true
```

#### Example 2:

```
Input: 14
Output: false
```

## SOLUTION IN KOTLIN

#### Newton's method

```kotlin
class Solution {

    fun isPerfectSquareNewtonApproach(num: Int): Boolean {
        var res = num.toLong()
        while(res*res>num){
            res = (res + num/res)/2
        }
        return res*res==num.toLong()
    }
}
```

#### Binary search method

```kotlin
class Solution {
    
fun isPerfectSquareBinarySearchApproach(num: Int): Boolean {
        if(num==0 || num==1) return true

        var left = 1.toLong()
        var right = num.toLong()
        while(left<=right){
            val mid = (left+right)/2
            if(mid*mid==num.toLong()) return true

            if(mid*mid>num.toLong()){
                right = mid-1
            }else{
                left = mid+1
            }
        }

        return false
    }
}
```
