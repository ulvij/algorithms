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
    fun middleNode(head: ListNode?): ListNode? {
        if (head == null) return null
        var current = head
        var result = head
        while (current?.next != null) {
            result = result?.next
            current = current.next?.next
        }
        return result
    }
}