class Solution {

    // Newton's method
    fun isPerfectSquareNewtonApproach(num: Int): Boolean {
        var res = num.toLong()
        while(res*res>num){
            res = (res + num/res)/2
        }

        return res*res==num.toLong()
    }

    // Binary search method

    fun isPerfectSquareBinarySearchApproach(num: Int): Boolean {
        if(num==0 || num==1) return true

        var left = 1.toLong()
        var right = num.toLong()
        while(left<=right){
            var mid = (left+right)/2
            if(mid*mid==num.toLong()) return true

            if(mid*mid>num.toLong()){
                right = mid-1
            }else{
                left = mid+1
            }
        }

        return false
    }
}