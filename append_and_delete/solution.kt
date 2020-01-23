fun appendAndDelete(s: String, t: String, k: Int): String {
    if (s.plus(t).length <= k) return "Yes"
    var tempString: String = t

    while (!s.contains(tempString)) {
        tempString = tempString.subSequence(0, tempString.lastIndex).toString()
    }
    val leftS = s.removePrefix(tempString)
    val leftT = t.removePrefix(tempString)
    if (leftS.isEmpty()) {
        return if (leftT.length == k || ((k - leftT.length) % 2 == 0)) "Yes" else "No"
    }

    val diffText = leftS.plus(leftT)
    return if (k >= diffText.length && ((k - diffText.length) % 2 == 0)) "Yes" else "No"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val t = scan.nextLine()

    val k = scan.nextLine().trim().toInt()

    val result = appendAndDelete(s, t, k)

    println(result)
}
