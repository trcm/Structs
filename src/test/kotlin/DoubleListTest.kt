import io.kotlintest.specs.StringSpec
import List.DoublyLinkedList
import List.Node
import io.kotlintest.matchers.shouldBe

class DoubleListTest: StringSpec() {
    init {
       "should create an empty doubly linked list" {
           var l = DoublyLinkedList<Int>(null, null)
           l.length shouldBe 0
           l.head shouldBe null
           l.tail shouldBe null
       }

        "should add a node to the end of the list" {
            val l = DoublyLinkedList<Int>(null, null)
            l.addNode(5)
            l.addNode(6)
            l.addNode(7)
            l.head?.data shouldBe 5
            l.tail?.data shouldBe 7
            l.length shouldBe 3
        }

        "should remove a node" {
           val l = DoublyLinkedList<Int>(null, null)
            l.addNode(5)
            l.addNode(6)
            l.addNode(7)
            l.length shouldBe 3
            l.removeNode() shouldBe 7
            l.length shouldBe 2
            l.removeNode() shouldBe 6
            l.removeNode() shouldBe 5
            l.length shouldBe 0
            l.removeNode() shouldBe null
        }

        "should return null when popping an empty list" {
            val l = DoublyLinkedList<Int>(null, null);
            l.removeNode() shouldBe null
        }

        "should add a node to the head of the list" {
            val l = DoublyLinkedList<Int>(null, null)
            l.addNode(5)
            l.addNode(6)
            l.addNodeToHead(4)
            l.head?.data shouldBe 4
            l.length shouldBe 3
        }

        "should remove a node from the head" {
            val l = DoublyLinkedList<Int>(null, null)
            l.addNode(5)
            l.addNode(6)
            l.length shouldBe 2
            l.removeFromHead() shouldBe 5
            l.length shouldBe 1
            l.head?.data shouldBe 6
        }
    }
}