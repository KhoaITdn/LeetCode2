
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // lưu node tiếp theo
            curr.next = prev;          // đảo chiều
            prev = curr;               // di chuyển prev
            curr = next;               // di chuyển curr
        }

        return prev; // prev là node đầu mới sau khi đảo
    }
}
//206. Reverse Linked List
// đảo ngược linked list
