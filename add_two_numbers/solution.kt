/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var rest = 0
        var nodeOne = l1
        var nodeTwo = l2
        val finalNode: ListNode = ListNode(0)
        var currNode: ListNode? = finalNode
        while (nodeOne != null || nodeTwo != null) {
            val valOne = nodeOne?.`val` ?: 0
            val valTwo = nodeTwo?.`val` ?: 0

            var sum = valOne + valTwo + rest
            rest = sum / 10
            sum %= 10

            currNode?.next = ListNode(sum)
            currNode = currNode?.next

            nodeOne = nodeOne?.next
            nodeTwo = nodeTwo?.next
        }

        if (rest > 0) {
            currNode?.next = ListNode(rest)
        }
        return finalNode.next
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
    override fun toString(): String {
        return "ListNode(`val`=$`val`, next=$next)"
    }
}