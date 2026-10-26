using System;

class ListNode
{
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next = null)
    {
        this.val = val;
        this.next = next;
    }
}

class MiddleOfLinkedList
{
    static ListNode MiddleNode(ListNode head)
    {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode Build(params int[] values)
    {
        ListNode head = null;
        for (int i = values.Length - 1; i >= 0; i--)
        {
            head = new ListNode(values[i], head);
        }
        return head;
    }

    static void Main()
    {
        Console.WriteLine(MiddleNode(Build(1, 2, 3, 4, 5)).val);     // 3
        Console.WriteLine(MiddleNode(Build(1, 2, 3, 4, 5, 6)).val);  // 4 (second middle)
        Console.WriteLine(MiddleNode(Build(1)).val);                 // 1
    }
}
