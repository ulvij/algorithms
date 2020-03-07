class Solution {
    fun fib(N: Int): Int {
        if (N<2)return N
        var f = 0
        var s = 1
        var d = 0

        for(i in 0..N-2){
            d = f +s
            f = s
            s = d
        }

        return s
    }
}