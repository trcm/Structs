package List

import List.Node

class DoublyLinkedList<T>(var head: Node<T>?, var tail: Node<T>?) {
    var length = 0

    fun addNode(data: T): Int {
        val new = Node(data, null, null)
        if (head == null) { // This is the new head and tail
            head = new
            tail = new
        } else {
            tail?.next = new
            new.prev = tail
            tail = new
        }
        return ++length
    }

    fun removeNode(): T? {
        if (tail == null) {
            return null
        } else if (length == 1){
            val temp = tail?.data
            tail = null
            head = null
            --length
            return temp
        } else {
            val temp = tail?.data
            tail = tail?.prev
            tail?.next = null
            --length
            return temp
        }
    }

    fun addNodeToHead(data: T): Int {
        val n = Node(data,null ,null)
        if (head == null) {
            return addNode(data)
        } else {
            n.next = head
            head = n
            return ++length
        }
    }

    fun removeFromHead(): T? {
        var ret: T? = null
        when (head) {
            null -> ret = null
            else -> {
                ret = head!!.data
                head = head!!.next
                --length
            }
        }
        return ret
    }
}
