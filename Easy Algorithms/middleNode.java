import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();

        for (ListNode curr = head; curr != null; curr = curr.next) {
            nodes.add(curr);
        }

        int mid = nodes.size() / 2;
        return nodes.get(mid);
    }
}

 class middleNode {
    public static void main(String[] args) {
        // Tạo danh sách liên kết: 1 -> 2 -> 3 -> 4 -> 5
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        Solution solution = new Solution();
        ListNode middle = solution.middleNode(n1); // gọi hàm tìm node giữa

        // In ra các giá trị từ node giữa đến cuối danh sách
        System.out.print("Output: [");
        while (middle != null) {
            System.out.print(middle.val);
            middle = middle.next;
            if (middle != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

// Input: head = [1,2,3,4,5]
//Output: [3,4,5]