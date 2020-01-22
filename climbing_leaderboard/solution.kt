package hackerrank

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    val scoresCount = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val aliceCount = scan.nextLine().trim().toInt()

    val alice = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = climbingLeaderboard(scores, alice)

    println(result.joinToString("\n"))
}

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
