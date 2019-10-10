fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val full = (nums1 + nums2)
    full.sort()
    return if (full.size % 2 == 0) {
        (full[(full.size / 2)-1] + full[(full.size / 2)]) / 2.0
    } else {
        full[(full.size / 2)].toDouble()
    }
}
