# Bitwise AND
      
**Difficulty** : Medium

**Link** : https://www.hackerrank.com/challenges/30-bitwise-and/problem

__Objective__

Welcome to the last day! Today, we're discussing bitwise operations. Check out the Tutorial tab for learning materials and an instructional video!

__Task__

Given set __S = {1,2,3,...,N}__. Find two integers, __A__ and __B__ (where __A<B__), from set __S__ such that the value of __A&B__ is the maximum possible and also less than a given integer, __K__. In this case, __&__ represents the bitwise AND operator.

__Input Format__

The first line contains an integer, __T__ , the number of test cases.
Each of the __T__ subsequent lines defines a test case as __2__ space-separated integers, __N__ and __K__, respectively.

__Constraints__
-  1 ≤ T ≤ 10^3
-  2 ≤ N ≤ 10^3
-  2 ≤ K ≤ N

__Output Format__

For each test case, print the maximum possible value of __A&B__ on a new line.

#### Sample Input:

```
3
5 2
8 5
2 2
```

#### Sample Output:

```
1
4
0
```

#### Explanation:

__N = 5, K = 2, S = {1,2,3,4,5}__
All possible values of A and B are: 
1. __A = 1, B = 2; A&B = 0__
2. __A = 1, B = 3; A&B = 1__
3. __A = 1, B = 4; A&B = 0__
4. __A = 1, B = 5; A&B = 1__
5. __A = 2, B = 3; A&B = 2__
6. __A = 2, B = 4; A&B = 0__
7. __A = 2, B = 5; A&B = 0__
8. __A = 3, B = 4; A&B = 0__
9. __A = 3, B = 5; A&B = 1__
10. __A = 4, B = 5; A&B = 4__

The maximum possible value of _A&B_ that is also __<(K=2)__ is __1__, so we print __1__ on a new line

## SOLUTION IN KOTLIN

```kotlin
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()
    var numList = mutableListOf<Int>()

    for (tItr in 1..t) {
        val nk = scan.nextLine().split(" ")

        val n = nk[0].trim().toInt()

        val k = nk[1].trim().toInt()
        var max = 0


        for (i in 1..n) {
            for (j in i + 1..n) {
                val bAnd = i and j
                if (bAnd in (max + 1) until k) {
                    max = bAnd
                }
            }
        }

        numList.add(max)

    }

    numList.forEach(::println)

}
```
