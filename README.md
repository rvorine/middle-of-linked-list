[![Instagram](https://img.shields.io/badge/Instagram-lacopydepastel-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/lacopydepastel)
[![YouTube](https://img.shields.io/badge/YouTube-%40rvorine-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://youtube.com/@rvorine)

# Middle of the Linked List (LeetCode 876)

## Problem

Given the `head` of a singly linked list, return the **middle node**. If there are two middle nodes (even length), return the **second** one.

Example:

```
Input:  1 -> 2 -> 3 -> 4 -> 5          Output: node 3
Input:  1 -> 2 -> 3 -> 4 -> 5 -> 6     Output: node 4
Input:  1                              Output: node 1
```

## Solution

**Slow and fast pointers** — one pass, no length counting.

- `slow` moves one step at a time.
- `fast` moves two steps at a time.

When `fast` reaches the end, `slow` has covered half the distance, so it sits on the middle.

Loop while `fast != null && fast.next != null`:
- odd length: `fast` stops on the last node, `slow` is the exact middle.
- even length: `fast` becomes `null`, `slow` lands on the second middle, as the problem asks.

A naive version counts the nodes first and walks again; this does it in a single traversal.

**Time:** O(n) — one pass.
**Space:** O(1) — two pointers.

## Implementations

| Language | File |
|---|---|
| Python | [`python/middle_of_linked_list.py`](python/middle_of_linked_list.py) |
| Java | [`java/MiddleOfLinkedList.java`](java/MiddleOfLinkedList.java) |
| Kotlin | [`kotlin/MiddleOfLinkedList.kt`](kotlin/MiddleOfLinkedList.kt) |
| JavaScript | [`javascript/middleOfLinkedList.js`](javascript/middleOfLinkedList.js) |
| C# | [`csharp/MiddleOfLinkedList.cs`](csharp/MiddleOfLinkedList.cs) |
