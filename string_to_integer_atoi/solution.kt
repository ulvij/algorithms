fun myAtoi(str: String): Int {
    val digits = arrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    val rs = str.trim()
    var number: Long = -1
    var sign = false
    for (i in rs.indices) {
        if (i == 0) {
            if (rs[i] == '-') {
                sign = true
                continue
            } else if (rs[i] == '+') {
                sign = false
                continue
            }
        }

        if (!digits.contains(rs[i])) break

        val e: Long = digits.indexOf(rs[i]).toLong()
        if (Int.MAX_VALUE - number < e) {
            return if (sign) {
                Int.MIN_VALUE
            } else {
                Int.MAX_VALUE
            }
        }
        number = if (number > -1) {
            number * 10 + e
        } else {
            e
        }
    }
    if (number.toInt() == -1) number = 0
    if (sign) number = -number
    if (number > Int.MAX_VALUE) return Int.MAX_VALUE else if (number < Int.MIN_VALUE) return Int.MIN_VALUE
    return number.toInt()
}