class Solution {
    fun plusOne(digits: IntArray): IntArray {
        if (digits.last() < 9) {
            digits[digits.lastIndex] = digits.last() + 1
            return digits
        }

        var leftIndex = 1
        digits[digits.lastIndex] = 0
        var rest = true
        while (leftIndex < digits.size) {
            if (digits[digits.lastIndex - leftIndex] < 9) {
                digits[digits.lastIndex - leftIndex] = digits[digits.lastIndex - leftIndex] + 1
                rest = false
                break
            }
            digits[digits.lastIndex - leftIndex] = 0
            leftIndex += 1
        }

        if (rest) {
            val array = IntArray(digits.size + 1)
            array[0] = 1
            var index = 1
            digits.forEach {
                array[index] = it
                index += 1
            }
            return array
        }

        return digits
    }
}