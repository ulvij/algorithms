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