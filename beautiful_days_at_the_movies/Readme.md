# Beautiful Days at the Movies
      
**Difficulty** : Easy

**Link** : https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number __12__, its reverse is __21__. Their difference is __9__. The number __120__ reversed is __21__, and their difference is __99__.

She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.

Given a range of numbered days, __[i...j]__  and a number __k__, determine the number of days in the range that are beautiful. Beautiful numbers are defined as numbers where __|i-reverse(i)|__ is evenly divisible by __k__. If a day's value is a beautiful number, it is a beautiful day. Print the number of beautiful days in the range.


### Function description
Complete the beautifulDays function in the editor below. It must return the number of beautiful days in the range.

beautifulDays has the following parameter(s):

- i: the starting day number
- j: the ending day number
- k: the divisor

### Input format

A single line of three space-separated integers describing the respective values of __i__, __j__, and __k__.

__Constraints__

-  1 ≤ i ≤ j ≤ 2x10^6
-  1 ≤ k ≤ 2x10^9

### Output format

Print the number of beautiful days in the inclusive range between __i__ and __j__
.
#### Sample Input:

```
20 23 6
```

#### Sample Output:

```
2
```

__Explanation__:

Lily may go to the movies on days __20__, __21__, __22__, and __23__. We perform the following calculations to determine which days are beautiful:

Day __20__ is beautiful because the following evaluates to a whole number: (|20-02|)/6 = 18/6 = 3
Day __21__ is not beautiful because the following doesn't evaluate to a whole number: (|21-12|)/6 = 9/6 = 1.5
Day __22__ is beautiful because the following evaluates to a whole number: (|22-22|)/6 = 0/6 = 0
Day __23__ is not beautiful because the following doesn't evaluate to a whole number: (|23-32|)/6 = 9/6 = 1.5
Only two days, __20__ and __22__, in this interval are beautiful. Thus, we print __2__ as our answer.


## SOLUTION IN KOTLIN

```kotlin
import java.util.*

fun beautifulDays(i: Int, j: Int, k: Int): Int {
    var count = 0
    val array = (i..j).toList().toTypedArray()
    for (i in array) {
        val iArray = i.toString().toCharArray().toTypedArray()
        iArray.reverse()
        val reverseInt = iArray.joinToString("").toInt()
        if ((i - reverseInt) % k == 0) {
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val ijk = scan.nextLine().split(" ")

    val i = ijk[0].trim().toInt()

    val j = ijk[1].trim().toInt()

    val k = ijk[2].trim().toInt()

    val result = beautifulDays(i, j, k)

    println(result)
}
```
