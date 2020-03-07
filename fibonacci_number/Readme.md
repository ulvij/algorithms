# Fibonacci Number
      
**Difficulty** : Easy

**Link** : https://leetcode.com/problems/fibonacci-number/

The __Fibonacci numbers__, commonly denoted ```F(n)``` form a sequence, called the ___Fibonacci sequence___, such that each number is the sum of the two preceding ones, starting from ```0``` and ```1```. That is,

```text
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
```

Given ```N```, calculate ```F(N)```.

#### Example 1:

```
Input: [7,1,5,3,6,4]
Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
```

#### Example 2:

```
Input: 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
```

#### Example 3:

```
Input: 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
```

## SOLUTION IN KOTLIN (By using Dynamic Programming)

```kotlin
class Solution {
    fun fib(N: Int): Int {
        if (N<2)return N 
        var f = 0
        var s = 1
        var d = 0
      
        for(i in 0..N-2){
          d = f +s
          f = s
          s = d
        }
        
        return s
    }
}
```
