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
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) return false
        var slow = head
        var fast = head.next
        while (slow != null && fast != null) {
            if (slow == fast) return true else {
                slow = slow.next
                fast = fast.next?.next
            }
        }

        return false
    }
}