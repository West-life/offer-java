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
    public ListNode deleteDuplication(ListNode pHead){
        ListNode curNode=pHead;
        ListNode newHead=new ListNode(0);
        newHead.next=pHead;
        ListNode preNode=newHead;
        while(curNode!=null&&curNode.next!=null){
            if(curNode.val!=curNode.next.val){
                preNode=preNode.next;
                curNode=curNode.next;
            }else{
                while(curNode.next!=null&&curNode.val==curNode.next.val){
                	curNode=curNode.next;
            	}
            	curNode=curNode.next;
            	preNode.next=curNode;
            }
        }
        return newHead.next;
    }
}