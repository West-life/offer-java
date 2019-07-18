package offer2016;

/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead==null||pHead.next==null){
            return null;
        }
        ListNode slow=pHead;
        ListNode fast=pHead;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=pHead;
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
}