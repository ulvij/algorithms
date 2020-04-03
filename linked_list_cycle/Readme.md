# Linked List Cycle
      
**Difficulty** : Easy

**Link** : https://leetcode.com/problems/linked-list-cycle/

Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

#### Example 1:

```
Input: 1
Output: "1"
Explanation: This is the base case.
```

#### Example 2:

```
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the first node.
```

#### Example 3:

```
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
```

__Follow up:__

Can you solve it using O(1) (i.e. constant) memory?

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
```
