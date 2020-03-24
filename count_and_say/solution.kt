class Solution {
    fun countAndSay(n: Int): String {
        var result = StringBuilder()
        result.append("1")
        repeat(n - 1) {
            var index = 0
            var count = 0
            val current = StringBuilder()
            for (i in 0..result.lastIndex) {
                if (result[index] == result[i]) {
                    count += 1
                } else {
                    current.append(count).append(result[index])
                    index = i
                    count = 1
                }
            }
            if (count>0){
                current.append(count).append(result.last())
            }
            result = current
        }

        return result.toString()
    }
}