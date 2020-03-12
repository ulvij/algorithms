import java.util.*

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

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val q = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        minimumBribes(q)
    }
}