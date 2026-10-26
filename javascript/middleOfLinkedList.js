class ListNode {
  constructor(val = 0, next = null) {
    this.val = val;
    this.next = next;
  }
}

function middleNode(head) {
  let slow = head, fast = head;
  while (fast && fast.next) {
    slow = slow.next;
    fast = fast.next.next;
  }
  return slow;
}

function build(values) {
  let head = null;
  for (let i = values.length - 1; i >= 0; i--) {
    head = new ListNode(values[i], head);
  }
  return head;
}

console.log(middleNode(build([1, 2, 3, 4, 5])).val);     // 3
console.log(middleNode(build([1, 2, 3, 4, 5, 6])).val);  // 4 (second middle)
console.log(middleNode(build([1])).val);                 // 1

module.exports = { ListNode, middleNode, build };
