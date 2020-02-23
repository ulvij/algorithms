# Implement Queue using Stacks

**Difficulty** : Easy

**Link** : https://leetcode.com/problems/implement-queue-using-stacks/

Implement the following operations of a queue using stacks.

- push(x) -- Push element x to the back of queue.
- pop() -- Removes the element from in front of queue.
- peek() -- Get the front element.
- empty() -- Return whether the queue is empty.

You may assume __nums1__ and __nums2__ cannot be both empty.

#### Example:

```
MyQueue queue = new MyQueue();

queue.push(1);
queue.push(2);  
queue.peek();  // returns 1
queue.pop();   // returns 1
queue.empty(); // returns false
```


#### Notes:

- You must use only standard operations of a stack -- which means only __push to top__, __peek/pop from top__, __size__, and __is empty__ operations are valid.
- Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
- You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).

## SOLUTION IN KOTLIN

```kotlin
class MyQueue() {
    var stack: MutableList<Int>? = null

    init {
        stack = mutableListOf()
    }

    /** Push element x to the back of queue. */
    fun push(x: Int) {
        stack?.add(x)
    }

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
        var element: Int = 0
        stack?.let {
            element = it.removeAt(0)
            it.remove(element)
        }

        return element
    }

    /** Get the front element. */
    fun peek(): Int {
        stack?.let {
            return it[0]
        }
        return -1
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean {
        stack?.let {
            return it.size <= 0
        } ?: run {
            return true
        }
    }

}
```
