class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {

    fun isValidBST(root: TreeNode?): Boolean {
        if (root == null) return true
        if (root.left==null && root.right==null)return true
        return traverse(root,Long.MIN_VALUE,Long.MAX_VALUE)
    }

    private fun traverse(root: TreeNode?, min: Long, max: Long): Boolean {
        if (root?.`val` == null) return true

        if (root.`val`<=min ||root.`val`>=max) return false

        return traverse(root.left,min, root.`val`.toLong()) && traverse(root.right,root.`val`.toLong(),max)
    }
}