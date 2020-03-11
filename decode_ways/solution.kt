class Solution {
    fun numDecodings(s: String): Int {
        val dp = IntArray(s.length + 1)
        dp[0] = 1
        dp[1] = if (s.toCharArray()[0].toString().toInt() == 0) 0 else 1

        for (i in 2..s.length) {
            val v1 = s.substring(i - 1, i).toString().toInt()
            val v2 = s.substring(i - 2, i).toString().toInt()

            if (v1 > 0) dp[i] += dp[i - 1]

            if (v2 in 10..26) dp[i] += dp[i - 2]
        }
        return dp[s.length]
    }
}