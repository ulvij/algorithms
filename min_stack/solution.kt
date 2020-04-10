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