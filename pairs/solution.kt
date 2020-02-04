import java.util.*

fun pairs(k: Int, arr: Array<Int>): Int {
    var count = 0
    val set = arr.toSet()
    for (i in arr) {
        if (set.contains(i + k)) count += 1
        if (set.contains(i - k)) count += 1
    }
    return count / 2
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = pairs(k, arr)

    println(result)
}