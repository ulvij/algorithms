# Arrays: Left Rotation

**Difficulty** : Easy

**Link** : https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem



A left rotation operation on an array shifts each of the array's elements __1__ unit to the left. For example, if __2__ left rotations are performed on array __[1, 2, 3, 4, 5]__, then the array would become __[3, 4, 5, 1, 2]__.

Given an array __a__ of __n__ integers and a number, __d__, perform __d__ left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

__Function Description__

Complete the function rotLeft in the editor below. It should return the resulting array of integers.

rotLeft has the following parameter(s):
- An array of integers __a__.
- An integer __d__, the number of rotations.

__Input Format__

The first line contains two space-separated integers __n__ and __d__, the size of __a__ and the number of left rotations you must perform.
The second line contains __n__ space-separated integers __a[i]__.

__Constraints__

-  1 ≤ n ≤ 10^5
-  1 ≤ d ≤ n
-  1 ≤ a[i] ≤ 10^6

__Output Format__

Print a single line of __n__ space-separated integers denoting the final state of the array after performing __d__ left rotations.

#### Sample Input:

```
5 4
1 2 3 4 5
```

#### Sample Output:

```
5 1 2 3 4
```

#### Explanation:

When we perform __d=4__ left rotations, the array undergoes the following sequence of changes:

__[1,2,3,4,5] -> [2,3,4,5,1] -> [3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4]__

## SOLUTION IN KOTLIN

```kotlin
fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    var list = a.toCollection(ArrayList())
    var fullList = ArrayList<Int>()
    var leftList = list.subList(0,d)
    var rightList = list.subList(d,list.size)
    fullList.addAll(rightList)
    fullList.addAll(leftList)
    val array = arrayOfNulls<Int>(fullList.size)
    return fullList.toArray(array)
}
```
