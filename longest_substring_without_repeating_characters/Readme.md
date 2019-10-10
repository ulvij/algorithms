# Longest Substring Without Repeating Characters

__Dificulty__ : Medium

__Link__ : https://leetcode.com/problems/longest-substring-without-repeating-characters/

Given a string, find the length of the __longest substring__ without repeating characters.

#### Example 1:

```
Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
```

#### Example 2:

```
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1. 
```

#### Example 3:

```
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```


## SOLUTION

```kotlin
fun lengthOfLongestSubstring(s: String): Int {
    var res = ""
    var maxLength = 0
    val ind = s.length
    for (c in s.indices) {
        for (l in c until s.length) {
            if (res.contains(s[l])) {
                res = s[c].toString()
                break
            } else {
                res = res + "" + s[l]
                if (res.length > maxLength) maxLength = res.length
            }
        }
    }
    return maxLength
}
```
