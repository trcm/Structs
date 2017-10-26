import io.kotlintest.specs.StringSpec
import List.*
import io.kotlintest.matchers.shouldBe

class ListTest:StringSpec() {
    init {
        "should create an empty list" {
            var l = List<Integer>(null)
            l.length shouldBe 0
        }

        "should add an item to an empty list" {
            var l = List<Int>(null)
            l.length shouldBe 0
            l.addNode(1)
            l.length shouldBe 1
        }

        "Should remove the last element of the list" {
            var l = List(Node(5, null))
            l.addNode(6)
            l.addNode(7)

            var last = l.removeNode()
            last shouldBe 7
        }

        "Should return the "
    }
}
