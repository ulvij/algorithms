# Add Two Numbers
      
**Difficulty** : Medium

**Link** : https://leetcode.com/problems/add-two-numbers/

You are given two __non-empty__ linked lists representing two non-negative integers. The digits are stored in __reverse order__ and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.


#### Example:

```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```

## SOLUTION IN KOTLIN

```kotlin
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
```
