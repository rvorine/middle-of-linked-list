class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def middle_node(head):
    slow = fast = head
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
    return slow


def build(values):
    head = None
    for v in reversed(values):
        head = ListNode(v, head)
    return head


if __name__ == "__main__":
    print(middle_node(build([1, 2, 3, 4, 5])).val)     # 3
    print(middle_node(build([1, 2, 3, 4, 5, 6])).val)  # 4 (second middle)
    print(middle_node(build([1])).val)                 # 1
