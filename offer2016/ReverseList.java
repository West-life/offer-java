package offer2016;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
		ListNode headReverse=null;
        ListNode node=head,preNode=null,nextNode=null;
        while(node!=null){
            nextNode=node.next;
            if(nextNode==null){
                headReverse=node;
            }
            node.next=preNode;
            preNode=node;
            node=nextNode;
            
        }
        return headReverse;
    }
}