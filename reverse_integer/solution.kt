fun reverse(x: Int): Int {
    val signed = x < 0
    var num = if (signed) {-x}else{x}.toLong()
    var rNum:Long = 0
    while (num > 0) {
        val rest:Long = num % 10
        num /= 10
        rNum = if (rNum.toInt()==0) {
            rest
        } else {
            rNum * 10 + rest
        }
    }
    if (signed) rNum = -rNum

    if(rNum>Int.MAX_VALUE-1 || rNum < Int.MIN_VALUE) return 0
    return rNum.toInt()
}