class Solution {
    fun maxProfit(prices:IntArray):Int{
        if(prices.isEmpty()) return 0
        var maxProfit = 0
        var minStock = prices[0]
        for (i in 1 until prices.size){
            maxProfit = maxProfit.coerceAtLeast(prices[i]-minStock)
            minStock = minStock.coerceAtMost(prices[i])
        }
        return maxProfit
    }
}