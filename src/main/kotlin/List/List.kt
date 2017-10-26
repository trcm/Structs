package List

class List<T>(var head: Node<T>?) {

    var length = 0

    //  addNode :: T -> Int
    //  Add a new node to the list, return the new length of the list.
    fun addNode(data: T): Int {
        if (this.head == null) {
            this.head = Node(data, null)
            this.length++
            return this.length
        } else { // find the end of the list
            var current = head
            while (current!!.next != null) {
                current = current.next
            }
            current.next = Node(data, null)
            this.length++
            return this.length
        }
    }
    // removeNode :: T
    // Pop the last element from the list.
    fun removeNode(): T? {

        if (head == null) {
            return null
        } else if (length === 1) { // only one item in the list
            val temp = head
            head = null
            return temp!!.data
        }
        var current = head
        var previous  = head
        while (current!!.next != null) {
            previous = current
            current = current.next
        }
        previous!!.next = null
        length--
        return current.data
    }

    // peek :: T
    // Check the first element of the list
    fun peek(): T? {
        if (head == null) {
            return null
        }
        return head!!.data
    }

}
