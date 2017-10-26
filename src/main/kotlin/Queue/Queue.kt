package Queue

import List.DoublyLinkedList

class Queue<T> {
    val list = DoublyLinkedList<T>(null, null)
    fun push(data: T) = list.addNodeToHead(data)
    fun pop(): T? = list.removeNode()
    fun length(): Int = list.length
    fun peek(): T? = list.head?.data
    fun poll(): T? = list.tail?.data

    override fun toString(): String {
        var sb = StringBuilder()
        sb.append("[ ")

        var current = list.head
        while (current?.next != null) {
            sb.append(current.data)
            sb.append(", ")
            current = current.next
        }
        sb.append("]")

        return sb.toString()
    }
}