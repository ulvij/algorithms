fun lengthOfLongestSubstring(s: String): Int {
    var res = ""
    var maxLength = 0
    val ind = s.length
    for (c in s.indices) {
        for (l in c until s.length) {
            if (res.contains(s[l])) {
                res = s[c].toString()
                break
            } else {
                res = res + "" + s[l]
                if (res.length > maxLength) maxLength = res.length
            }
        }
    }
    return maxLength
}
