# Backspace String Compare
      
**Difficulty** : Easy

**Link** : https://leetcode.com/problems/backspace-string-compare/

The count-and-say sequence is the sequence of integers with the first five terms as following:

Given two strings ``S`` and ``T``, return if they are equal when both are typed into empty text editors. ``#`` means a backspace character.

#### Example 1:

```
Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
```

#### Example 2:

```
Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
```

#### Example 3:

```
Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
```

#### Example 4:

```
Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
```


__Note:__
1. ``1<= S.lenght <=200``
1. ``1<= T.lenght <=200``
1. ``S`` and ``T`` only contain lowercase letters and ``#`` characters

__Follow up:__
- Can you solve it in ``O(N)`` time and ``O(1)`` space?

## SOLUTION IN KOTLIN

```kotlin
class Solution {
    fun Char.isBackspace(): Boolean {
        return this == '#'
    }

    fun backspaceCompare(S: String, T: String): Boolean {       // Time O(n) , Space O(n)
        if (S.isEmpty() && T.isEmpty()) return true
        if (S.length == 1 && T.length == 1) return S == T
        val resultS = StringBuilder()
        val resultT = StringBuilder()

        for (char in S) {
            if (char.isBackspace()) {
                if (resultS.isNotEmpty()) resultS.setLength(resultS.length - 1)
                continue
            }
            resultS.append(char)
        }

        for (char in T) {
            if (char.isBackspace()) {
                if (resultT.isNotEmpty()) resultT.setLength(resultT.length - 1)
                continue
            }
            resultT.append(char)
        }

        return resultS.toString() == resultT.toString()
    }
}
```
