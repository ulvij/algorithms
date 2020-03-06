# Best Time to Buy and Sell Stock
      
**Difficulty** : Easy

**Link** : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

Say you have an array for which the i^th element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

#### Example 1:

```
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
```

#### Example 2:

```
Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.

```

## SOLUTION IN KOTLIN

```kotlin
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
```
