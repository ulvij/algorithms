import java.util.*

// Complete the designerPdfViewer function below.
fun designerPdfViewer(h: Array<Int>, word: String): Int {
    val asOfA = 'a'.toLong()
    var maxWeight = 0

    for (c in word) {
        val diff = c.toLong() - asOfA
        if (h[(diff).toInt()] > maxWeight)
            maxWeight = h[(diff).toInt()]
    }
    return maxWeight*(word.length)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val word = scan.nextLine()

    val result = designerPdfViewer(h, word)

    println(result)
}