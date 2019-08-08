package offer2019;

/**
 * Create by xuzhijun.online on 2019/8/8.
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k == 0) {
            return null;
        }
        ListNode pos1 = head, pos2 = head;
        for (int i = 0; i < k - 1; i++) {
            if (pos1.next == null) {
                return null;
            }
            pos1 = pos1.next;
        }
        while (pos1.next != null) {
            pos1 = pos1.next;
            pos2 = pos2.next;
        }
        return pos2;
    }
}