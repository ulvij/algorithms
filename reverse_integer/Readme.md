# Reverse Integer

**Difficulty** : Easy

**Link** : https://leetcode.com/problems/reverse-integer/

Given a 32-bit signed integer, reverse digits of an integer.

#### Example 1:

```
Input: 123
Output: 321
```


#### Example 2:

```
Input: -123
Output: -321
```

#### Example 3:

```
Input: 120
Output: 21
```

#### Note:

```
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
```


## SOLUTION IN KOTLIN

```kotlin
fun reverse(x: Int): Int {
    val signed = x < 0
    var num = if (signed) {-x}else{x}.toLong()
    var rNum:Long = 0
    while (num > 0) {
        val rest:Long = num % 10
        num /= 10
        rNum = if (rNum.toInt()==0) {
            rest
        } else {
            rNum * 10 + rest
        }
    }
    if (signed) rNum = -rNum

    if(rNum>Int.MAX_VALUE-1 || rNum < Int.MIN_VALUE) return 0
    return rNum.toInt()
}
```
