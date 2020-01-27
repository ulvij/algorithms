package hackerrank.news

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