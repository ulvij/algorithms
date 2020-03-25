class Solution {

    // Newton's method

    fun mySqrtNewtonApproach(x: Int): Int {
        if (x==0) return 0

        var res:Long = x.toLong()
        while (res*res>x){
            res = (res+x/res)/2
        }

        return res.toInt()
    }

    // Binary search method

    fun mySqrtBinarySearchApproach(x: Int): Int {
        if (x == 0 || x == 1) return x
        var left :Long= 1
        var right = x.toLong()
        var sqrtNum :Long= 0

        while (left <= right) {
            val mid = (left + right) / 2
            if (mid * mid == x.toLong()) {
                sqrtNum = mid
                break
            } else if ((mid * mid) > x) {
                right = mid - 1
            } else {
                sqrtNum = mid
                left = mid + 1
            }
        }
        return sqrtNum.toInt()
    }
}