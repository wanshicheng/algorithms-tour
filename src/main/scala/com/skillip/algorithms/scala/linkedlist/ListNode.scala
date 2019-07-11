package com.skillip.algorithms.scala.linkedlist


class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}
object Solution {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    val dummyHead = new ListNode(0)
    var curr = dummyHead
    var p = l1
    var q = l2
    var carry = 0
    var sum = 0
    while (p != null || q != null) {
      val x = if (p != null) p.x else 0
      val y = if (q != null) q.x else 0
      sum = carry + x + y
      carry = sum / 10
      curr.next = new ListNode(sum % 10)
      curr = curr.next
      if (p != null) p = p.next
      if (q != null) q = q.next
    }
    if (carry != 0) {
      curr.next = new ListNode(carry)
    }
    dummyHead.next
  }
}