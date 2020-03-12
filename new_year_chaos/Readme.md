# New Year Chaos
      
**Difficulty** : Medium

**Link** : https://www.hackerrank.com/challenges/new-year-chaos/problem

It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. Initial positions increment by __1__ from __1__ at the front of the line to __n__ at the back.

Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if __n=8__ and __Person 5__ bribes __Person 4__, the queue will look like this: __1, 2, 3, 5, 4, 6, 7, 8__ .

Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!

__Function Description__

Complete the function minimumBribes in the editor below. It must print an integer representing the minimum number of bribes necessary, or Too chaotic if the line configuration is not possible.

minimumBribes has the following parameter(s):
- q: an array of integers

__Input Format__

The first line contains an integer __t__, the number of test cases.

Each of the next __t__ pairs of lines are as follows:
- The first line contains an integer __t__, the number of people in the queue
- The second line has __n__ space-separated integers describing the final state of the queue.

__Constraints__
-  1 ≤ t ≤ 10
-  1 ≤ n ≤ 10^5

__Subtasks__

For __60%__ score  __1 ≤ n ≤ 10^3__
For __100%__ score  __1 ≤ n ≤ 10^5__

__Output Format__

Print an integer denoting the minimum number of bribes needed to get the queue into its final state. Print Too chaotic if the state is invalid, i.e. it requires a person to have bribed more than __2__ people.

#### Sample Input:

```
2
5
2 1 5 3 4
5
2 5 1 3 4
```

#### Sample Output:

```
3
Too chaotic
```

## SOLUTION IN KOTLIN

```kotlin
fun minimumBribes(q: Array<Int>): Unit {
    var minBribe = 0
    var firstValue = 1
    var secondValue = 2
    var thirdValue = 3
    for (i in q) {
        when (i) {
            firstValue -> {
                firstValue = secondValue
                secondValue = thirdValue
                ++thirdValue
            }
            secondValue -> {
                secondValue = thirdValue
                ++minBribe
                ++thirdValue
            }
            thirdValue -> {
                ++thirdValue
                minBribe+=2
            }
            else -> {
                println("Too chaotic")
                return
            }
        }
    }
    println(minBribe)
}
```
