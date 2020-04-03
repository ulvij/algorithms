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
    fun detectCycle(head: ListNode?): ListNode? {
        if (head == null) return null

        val resultNode: ListNode?

        var slow = head
        var fastParent = head
        var fast = fastParent.next

        val containSet = hashSetOf<ListNode?>()
        containSet.add(slow)

        while (true) {
            if (!containSet.contains(fast)) {
                slow = slow?.next
                fastParent = fast?.next
                fast = fastParent?.next
                containSet.add(slow)
            } else {
                resultNode = if (containSet.contains(fastParent)) return fastParent else fast
                break
            }
        }

        return resultNode
    }
}