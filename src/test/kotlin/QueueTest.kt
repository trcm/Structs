import io.kotlintest.specs.StringSpec

import Queue.Queue
import io.kotlintest.matchers.shouldBe

class QueueTest:StringSpec() {
    init {
        "should create a new queue" {
            val q = Queue<Int>()
            q.length() shouldBe 0
        }

        "should push to the head" {
            val q = Queue<Int>()
            q.push(5)
            q.push(4)
            q.push(3)
            q.push(2)
            q.length() shouldBe 4
            q.peek() shouldBe 2
            q.poll() shouldBe 5
        }

        "should handle pop" {
            val q = Queue<Int>()
            q.push(5)
            q.push(4)
            q.push(3)
            q.pop() shouldBe 5
            q.length() shouldBe 2
        }

        "should handle multiple push and pop operations" {
            val q = Queue<Int>()
            q.push(5)
            q.push(4)
            q.push(3)
            print(q.pop()) // 5
            print(q.pop()) // 4
            print(q.toString())
            q.length() shouldBe 1
            q.peek() shouldBe q.poll()
            q.push(3)
            q.pop() // 3 [3]
            q.push(2)  // [2, 3]
            q.length() shouldBe 2
            q.peek() shouldBe 2
            q.poll() shouldBe 3
        }
    }
}