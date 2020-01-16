# Picking Numbers

**Dificulty** : Easy

**Link** : https://www.hackerrank.com/challenges/picking-numbers/problem

Given an array of integers, find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is less than or equal to __1__. For example, if your array is __a = [1,1,2,2,4,4,5,5,5]__, you can create two subarrays meeting the criterion: __[1,1,2,2]__ and [4,4,5,5,5]. The maximum length subarray has __5__ elements.

#### Function Description
Complete the pickingNumbers function in the editor below. It should return an integer that represents the length of the longest array that can be created.

pickingNumbers has the following parameter(s):
- a:an array of integers

#### Input Format
The first line contains a single integer __n__, the size of the array __a__.

The second line contains __n__ space-separated integers __a[i]__ .

#### Input Format
- __2 <= n <= 100__
- __0 <= a[i] <= 100__
- __The answer will be >=2__

#### Output Format
A single integer denoting the maximum number of integers you can choose from the array such that the absolute difference between any two of the chosen integers is __<=1__.

#### Sample Input 0:

```
6
4 6 5 3 3 1
```

#### Sample Output 0:

```
3
```

#### Explanation 0
We choose the following multiset of integers from the array:__{4,3,3}__ . Each pair in the multiset has an absolute difference __<=1__ (i.e.,__|4-3|=1__ and __|3-3|=0__), so we print the number of chosen integers,__3__ , as our answer.


#### Sample Input 1:

```
6
1 2 2 3 1 2
```

#### Sample Output 1:

```
5
```

#### Explanation 1
We choose the following multiset of integers from the array:__{1,2,2,1,2}__ . Each pair in the multiset has an absolute difference __<=1__ (i.e.,__|1-2|=1__ and __|1-1|=0__), so we print the number of chosen integers,__5__ , as our answer.

## SOLUTION IN KOTLIN

```kotlin
fun pickingNumbers(a: Array<Int>): Int {
    val map = mutableMapOf<Int, Int>()
    for (n in a) {
        val value: Int = if (map.keys.contains(n)) {
            map[n]!!.plus(1)
        } else {
            1
        }
        map[n] = value
    }
    var max = 0

    for (k in map.keys) {
        val s: Int = map[k]!!
        var s1 = 0
        if (map.keys.contains(k + 1)) {
            s1 = map[k + 1]!!
        }

        if (max < (s + s1)) max = s + s1
    }

    return max
}
```
