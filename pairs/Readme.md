# Pairs
      
**Dificulty** : Medium

**Link** : https://www.hackerrank.com/challenges/pairs/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

You will be given an array of integers and a target value. Determine the number of pairs of array elements that have a difference equal to a target value.

For example, given an array of [1, 2, 3, 4] and a target value of 1, we have three values meeting the condition: __2-1=1, 3-2=2 , and 4-3=1__.

__Function Description__

Complete the pairs function below. It must return an integer representing the number of element pairs having the required difference.
pairs has the following parameter(s):

- k: an integer, the target difference
- arr: an array of integers

__Input Format__

The first line contains two space-separated integers __n__ and __k__, the size of __arr__ and the target value.
The second line contains __n__ space-separated integers of the array __arr__.


__Constraints__
-  2 ≤ n ≤ 10^5
-  0 < k < 10^9
-  0 < arr[i] < 2^31-1
-  each integer __arr[i]__ will be unique

__Output Format__

An integer representing the number of pairs of integers whose difference is __k__.

#### Sample Input:

```
5 2  
1 5 3 4 2 
```

#### Sample Output:

```
3
```

#### Explanation:

There are 3 pairs of integers in the set with a difference of 2: [5,3], [4,2] and [3,1] .

## SOLUTION IN KOTLIN

```kotlin
fun pairs(k: Int, arr: Array<Int>): Int {
    var count = 0
    val set = arr.toSet()
    for (i in arr) {
        if (set.contains(i + k)) count += 1
        if (set.contains(i - k)) count += 1
    }
    return count / 2
}
```
