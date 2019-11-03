fun romanToInt(s: String): Int {
    var text = 0
    for (i in s.indices) {
        when(s[i]){
            'I' -> text = text.plus(1)
            'V' -> text = if (i!=0 && s[i-1]=='I') text.plus(3) else text.plus(5)
            'X' -> text = if (i!=0 && s[i-1]=='I') text.plus(8) else text.plus(10)
            'L' -> text = if (i!=0 && s[i-1]=='X') text.plus(30) else text.plus(50)
            'C' -> text = if (i!=0 && s[i-1]=='X') text.plus(80) else text.plus(100)
            'D' -> text = if (i!=0 && s[i-1]=='C') text.plus(300) else text.plus(500)
            'M' -> text = if (i!=0 && s[i-1]=='C') text.plus(800) else text.plus(1000)
        }
    }
    return text
}