# Min Stack
      
**Difficulty** : Easy

**Link** : https://leetcode.com/problems/min-stack/

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 
- push(x) -- Push element x onto stack.
- pop() -- Removes the element on top of the stack.
- top() -- Get the top element.
- getMin() -- Retrieve the minimum element in the stack.

#### Example:

```
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
```

## SOLUTION IN KOTLIN

```kotlin
class MinStack() {

    data class Node(var value: Int, var currentMin: Int, var prevNode: Node?)

    private var stack: Node? = null

    fun push(x: Int) {
        stack = if (stack == null) {
            Node(x, x, null)
        } else {
            Node(x, getMin().coerceAtMost(x), stack)
        }
    }

    fun pop() {
        stack = stack?.prevNode
    }

    fun top() = stack?.value ?: Int.MAX_VALUE

    fun getMin() = stack?.currentMin ?: Int.MAX_VALUE

}



/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
```
