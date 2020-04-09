class Solution {
    fun Char.isBackspace(): Boolean {
        return this == '#'
    }

    fun backspaceCompare(S: String, T: String): Boolean {       // Time O(n) , Space O(n)
        if (S.isEmpty() && T.isEmpty()) return true
        if (S.length == 1 && T.length == 1) return S == T
        val resultS = StringBuilder()
        val resultT = StringBuilder()

        for (char in S) {
            if (char.isBackspace()) {
                if (resultS.isNotEmpty()) resultS.setLength(resultS.length - 1)
                continue
            }
            resultS.append(char)
        }

        for (char in T) {
            if (char.isBackspace()) {
                if (resultT.isNotEmpty()) resultT.setLength(resultT.length - 1)
                continue
            }
            resultT.append(char)
        }

        return resultS.toString() == resultT.toString()
    }
}