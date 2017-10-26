package List

// Represents a node in a singly or doubly linked list.
data class Node<T>(var data: T, var next: Node<T>?, var prev: Node<T>? = null)