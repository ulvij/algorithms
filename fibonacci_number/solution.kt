class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0

        if (prices.size == 1) return 0

        if (prices.size == 2) {
            if (prices[0] < prices[1]) {
                return prices[1] - prices[0]
            }
        }

        val maxProfArray = IntArray(prices.size)
        maxProfArray[0] = 0
        var min = prices[0]
        maxProfArray[1] = if (prices[0] < prices[1]) prices[1] - prices[0] else 0
        min = min.coerceAtMost(prices[1])
        for (i in 2..prices.lastIndex){
            min = min.coerceAtMost(prices[i])
            val cProfit = if (min < prices[i]) prices[i] - min else 0
            maxProfArray[i] = maxProfArray[i-1].coerceAtLeast(cProfit)
        }
        return maxProfArray.last()
    }
}