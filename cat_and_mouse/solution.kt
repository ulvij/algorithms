fun catAndMouse(x: Int, y: Int, z: Int): String {
    if ((if ((z - x) < 0) (-1 * (z - x)) else (z - x)) == (if ((z - y) < 0) (-1 * (z - y)) else (z - y))) return "Mouse C"

    return if (x <= z && y <= z) {
        "Cat ${if (x > y) "A" else "B"}"
    } else if (x >= z && y >= z) {
        "Cat ${if (x > y) "B" else "A"}"
    } else {
        "Cat ${if ((if ((z - x) < 0) (-1 * (z - x)) else (z - x)) > (if ((z - y) < 0) (-1 * (z - y)) else (z - y))) "B" else "A"}"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}