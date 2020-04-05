class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        for (i in 1 until prices.size) {
            maxProfit+=0.coerceAtLeast(prices[i]-prices[i-1])
        }
        return maxProfit
    }
}