# Decode Ways
      
**Difficulty** : Medium

**Link** : https://leetcode.com/problems/decode-ways/

A message containing letters from ``A-Z`` is being encoded to numbers using the following mapping:

```text
'A' -> 1
'B' -> 2
...
'Z' -> 26
```

Given a __non-empty__ string containing only digits, determine the total number of ways to decode it.

#### Example 1:

```
Input: "12"
Output: 2
Explanation: It could be decoded as "AB" (1 2) or "L" (12).
```

#### Example 2:

```
Input: "226"
Output: 3
Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).

```

## SOLUTION IN KOTLIN

```kotlin
class Solution {
    fun numDecodings(s: String): Int {
        val dp = IntArray(s.length + 1)
        dp[0] = 1
        dp[1] = if (s.toCharArray()[0].toString().toInt() == 0) 0 else 1

        for (i in 2..s.length) {
            val v1 = s.substring(i - 1, i).toString().toInt()
            val v2 = s.substring(i - 2, i).toString().toInt()
            
            if (v1 > 0) dp[i] += dp[i - 1]
            
            if (v2 in 10..26) dp[i] += dp[i - 2]
        }
        return dp[s.length]
    }
}
```
