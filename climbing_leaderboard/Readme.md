# Climbing the Leaderboard

**Dificulty** : Medium

**Link** : https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem

Alice is playing an arcade game and wants to climb to the top of the leaderboard and wants to track her ranking. The game uses Dense Ranking, so its leaderboard works like this:

- The player with the highest score is ranked number __1__ on the leaderboard.
- Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.

For example, the four players on the leaderboard have high scores of __100, 90, 90, and 80__. Those players will have ranks __1, 2, 2, and 3,__ respectively. If Alice's scores are __70, 80 and 105,__ her rankings after each game are __4th, 3rd and 1st__.

__Function Description__

Complete the climbingLeaderboard function in the editor below. It should return an integer array where each element __res[j]__ represents Alice's rank after the __j th__ game.

climbingLeaderboard has the following parameter(s):

- scores: an array of integers that represent leaderboard scores
- alice: an array of integers that represent Alice's scores

__Input Format__

- The first line contains an integer __n__, the number of players on the leaderboard.
- The next line contains __n__ space-separated integers __scores[i]__, the leaderboard scores in decreasing order.
- The next line contains an integer, __m__, denoting the number games Alice plays.
- The last line contains __m__ space-separated integers __alice[j]__, the game scores.

__Constraints__

-  1 ≤ n ≤ 2 * 10^5
-  1 ≤ m ≤ 2* 10^5
-  0 ≤ scores[i] ≤ 10^9 for 0 ≤ i <n 
-  0 ≤ alice[i] ≤ 10^9 for 0 ≤ j <m 
-  The existing leaderboard, __scores__ , is in descending order.
-  Alice's scores, __alice__ , are in ascending order.


__Subtask__

for __60%__ of the maximum score:
-  1 ≤ n ≤ 200
-  1 ≤ m ≤ 200

__Output Format__

Print __m__ integers. The __jth__ integer should indicate Alice's rank after playing the __jth__ game.

#### Sample Input 1:

```
7
100 100 50 40 40 20 10   // scores array
4
5 25 50 120   // alice array
```

#### Sample Output 1:

```
6
4
2
1
```

#### Explanation 1:

Alice starts playing with __7__ players already on the leaderboard, which looks like this:
- After Alice finishes game __0__, her score is __5__ and her ranking is __6__:
- After Alice finishes game __1__, her score is __25__ and her ranking is __4__:
- After Alice finishes game __2__, her score is __50__ and her ranking is tied with Caroline at  __2__:
- After Alice finishes game __3__, her score is __120__ and her ranking is __1__:


#### Sample Input 2:

```
6
100 90 90 80 75 60   // scores array
5
50 65 77 90 102   // alice array
```

#### Sample Output 2:

```
6
5
4
2
1
```

## SOLUTION IN KOTLIN

```kotlin
fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
    val existRanks = mutableListOf<Int>()
    val aliceRanks = mutableListOf<Int>()
    for (i in scores.indices) {
        if (i == 0) {
            existRanks.add(1)
            continue
        }
        if (scores[i] == scores[i - 1]) existRanks.add(i, existRanks[i - 1]) else existRanks.add(existRanks[i - 1] + 1)
    }

    for (a in alice) {
        if (a >= scores[0]) {
            aliceRanks.add(1)
            continue
        }

        if (a <= scores[scores.size - 1]) {
            if (a == scores[scores.size - 1]) aliceRanks.add(existRanks.last()) else aliceRanks.add(existRanks.last() + 1)
            continue
        }

        var low = 0
        var high = scores.size - 1

        loop@ while (low < high) {
            val mid = (high + low) / 2
            when {
                scores[mid] == a -> {
                    aliceRanks.add(existRanks[mid])
                    break@loop
                }
                scores[mid] > a && scores[mid + 1] <= a -> {
                    aliceRanks.add(existRanks[mid + 1])
                    break@loop
                }
                scores[mid] < a && scores[mid - 1] >= a -> {
                    if (scores[mid - 1] == a) aliceRanks.add(existRanks[mid - 1]) else aliceRanks.add(existRanks[mid])
                    break@loop
                }
                scores[mid] > a -> {
                    low = mid + 1
                }
                scores[mid] < a -> {
                    high = mid - 1
                }
            }
        }
    }

    return aliceRanks.toTypedArray()
}
```
