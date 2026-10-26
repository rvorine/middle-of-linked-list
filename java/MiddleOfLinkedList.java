public class MiddleOfLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode build(int... values) {
        ListNode head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new ListNode(values[i], head);
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println(middleNode(build(1, 2, 3, 4, 5)).val);     // 3
        System.out.println(middleNode(build(1, 2, 3, 4, 5, 6)).val);  // 4 (second middle)
        System.out.println(middleNode(build(1)).val);                 // 1
    }
}
