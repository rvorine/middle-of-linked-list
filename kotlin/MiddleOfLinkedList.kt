class ListNode(var `val`: Int, var next: ListNode? = null)

fun middleNode(head: ListNode?): ListNode? {
    var slow = head
    var fast = head
    while (fast != null && fast.next != null) {
        slow = slow!!.next
        fast = fast.next!!.next
    }
    return slow
}

fun build(vararg values: Int): ListNode? {
    var head: ListNode? = null
    for (i in values.indices.reversed()) {
        head = ListNode(values[i], head)
    }
    return head
}

fun main() {
    println(middleNode(build(1, 2, 3, 4, 5))!!.`val`)     // 3
    println(middleNode(build(1, 2, 3, 4, 5, 6))!!.`val`)  // 4 (second middle)
    println(middleNode(build(1))!!.`val`)                 // 1
}
