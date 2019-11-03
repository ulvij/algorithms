# Roman to Integer

**Dificulty** : Easy

**Link** : https://leetcode.com/problems/roman-to-integer/

Roman numerals are represented by seven different symbols: __I__, __V__, __X__, __L__, __C__, __D__ and __M__.
```
Symbol       Value

I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```

For example, two is written as __II__ in Roman numeral, just two one's added together. Twelve is written as, __XII__, which is simply __X__ + __II__. The number twenty seven is written as __XXVII__, which is __XX__ + __V__ + __II__.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not __IIII__. Instead, the number four is written as __IV__. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as __IX__. There are six instances where subtraction is used:

- __I__ can be placed before __V__ (5) and __X__ (10) to make 4 and 9. 
- __X__ can be placed before __L__ (50) and __C__ (100) to make 40 and 90. 
- __C__ can be placed before __D__ (500) and __M__ (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

#### Example 1:

```
Input: "III"
Output: 3
```


#### Example 2:

```
Input: "IV"
Output: 4
```

#### Example 3:

```
Input: "IX"
Output: 9
```

#### Example 4:

```
Input: "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
```

#### Example 5:

```
Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
```

## SOLUTION IN KOTLIN

```kotlin
fun romanToInt(s: String): Int {
    var text = 0
    for (i in s.indices) {
        when(s[i]){
            'I' -> text = text.plus(1)
            'V' -> text = if (i!=0 && s[i-1]=='I') text.plus(3) else text.plus(5)
            'X' -> text = if (i!=0 && s[i-1]=='I') text.plus(8) else text.plus(10)
            'L' -> text = if (i!=0 && s[i-1]=='X') text.plus(30) else text.plus(50)
            'C' -> text = if (i!=0 && s[i-1]=='X') text.plus(80) else text.plus(100)
            'D' -> text = if (i!=0 && s[i-1]=='C') text.plus(300) else text.plus(500)
            'M' -> text = if (i!=0 && s[i-1]=='C') text.plus(800) else text.plus(1000)
        }
    }
    return text
}
```
