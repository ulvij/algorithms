class Solution {
    fun climbStairs(n: Int): Int {
        if (n<3) return n
        var one = 1
        var two = 2
        var sum = 0

        for (i in 0..n-3){
            sum = one+two
            one = two
            two = sum
        }

        return sum
    }
}