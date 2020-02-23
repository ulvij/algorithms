# Longest Palindromic Substring

__Difficulty__ : Medium

__Link__ : https://leetcode.com/problems/longest-palindromic-substring/

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

#### Example 1:

```
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
```

#### Example 2:

```
Input: "cbbd"
Output: "bb"
```

## SOLUTION IN KOTLIN

```kotlin
fun longestPalindrome(s: String): String {
    val length = s.length
    
    if (length < 2) return s
    
    val isPalindrome = Array(length) { BooleanArray(length) }

    var left = 0
    var right = 0

    for (j in 1 until length) {
        for (i in 0 until j) {
            val isInnerPalindrome = isPalindrome[i + 1][j - 1] || j - i <= 2
            if (s[i] == s[j] && isInnerPalindrome) {
                isPalindrome[i][j] = true
                if (j - i > right - left) {
                    left = i
                    right = j
                }
            }
        }
    }

    return s.substring(left, right + 1)
}
```
