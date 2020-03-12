import java.util.*

// Complete the beautifulDays function below.
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