fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()
    var numList = mutableListOf<Int>()

    for (tItr in 1..t) {
        val nk = scan.nextLine().split(" ")

        val n = nk[0].trim().toInt()

        val k = nk[1].trim().toInt()
        var max = 0


        for (i in 1..n) {
            for (j in i + 1..n) {
                val bAnd = i and j
                if (bAnd in (max + 1) until k) {
                    max = bAnd
                }
            }
        }

        numList.add(max)

    }

    numList.forEach(::println)

}