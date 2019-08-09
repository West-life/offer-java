package offer2019;

/**
 * Create by xuzhijun.online on 2019/8/9.
 */

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

public class ReverseList {

    public ListNode ReverseList(ListNode head) {
        ListNode pos1 = null, pos2 = head, pos3 = head;
        while (pos3 != null){
            pos3 = pos2.next;
            pos2.next = pos1;
            pos1 = pos2;
            pos2 = pos3;
        }
        return pos1;
    }
}
