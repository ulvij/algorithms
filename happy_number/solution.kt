class Solution {

    fun isHappyUsingKotlinDSL(n: Int): Boolean {
        var num = n
        val set = hashSetOf<Int>()
        while (set.add(num)) {
            val sum = num
                    .toString()
                    .toCharArray()
                    .map { it.toString().toInt() }
                    .toTypedArray().map { it * it }
                    .sum()
            if (sum == 1) return true else num = sum
        }
        return false
    }

    fun isHappy(n: Int): Boolean {
        var num = n
        val set = hashSetOf<Int>()
        while (set.add(num)) {
            var sum = 0
            while (num > 0) {
                val remain = num % 10
                sum += remain * remain
                num /= 10
            }
            if (sum == 1) return true else num = sum
        }
        return false
    }

}