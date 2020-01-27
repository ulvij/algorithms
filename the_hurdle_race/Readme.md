# The Hurdle Race

**Dificulty** : Easy

**Link** : https://www.hackerrank.com/challenges/the-hurdle-race/problem

Dan is playing a video game in which his character competes in a hurdle race. Hurdles are of varying heights, and Dan has a maximum height he can jump. There is a magic potion he can take that will increase his maximum height by __1__ unit for each dose. How many doses of the potion must he take to be able to jump all of the hurdles.

Given an array of hurdle heights __height__, and an initial maximum height Dan can jump, __k__, determine the minimum number of doses Dan must take to be able to clear all the hurdles in the race.

For example, if __height = [1,2,3,3,2]__ and Dan can jump __1__ unit high naturally, he must take __3-1=2__ doses of potion to be able to jump all of the hurdles.

#### Function Description

Complete the hurdleRace function in the editor below. It should return the minimum units of potion Dan needs to drink to jump all of the hurdles.

hurdleRace has the following parameter(s):

- k: an integer denoting the height Dan can jump naturally
- height: an array of integers denoting the heights of each hurdle


#### Input format

The first line contains two space-separated integers __n__ and __k__, the number of hurdles and the maximum height Dan can jump naturally.
The second line contains  space-separated integers __height[i]__ where __0<=i<n__.

#### Constraints

-  __1 ≤ n,k ≤ 100__
-  __1 ≤ height[i] ≤ 100__

#### Output format

Print an integer denoting the minimum doses of magic potion Dan must drink to complete the hurdle race.

#### Sample Input 0:

```
5 4
1 6 3 5 2
```


#### Sample Output 0:

```
0
```
 #### Explanation 0
```
Dan's character can jump a maximum of k=4  units, but the tallest hurdle has a height of h1=6:
To be able to jump all the hurdles, Dan must drink 6-4=2  doses.
```


## SOLUTION IN KOTLIN

```kotlin
import java.util.*

fun hurdleRace(k: Int, height: Array<Int>): Int {
    var max = 0
    for(a in height){
        if(a>k && a-k>max){
            max = a-k
        }
    }

    return max
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val height = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}
```
