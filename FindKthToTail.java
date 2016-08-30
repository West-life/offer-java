/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null||k==0){
            return null;
        }
        ListNode pFast=head;
        ListNode pSlow=head;
        for(int i=0;i<k-1;i++){
            if(pFast.next!=null){
                pFast=pFast.next;
            }else{
                return null;
            }
        }
        while(pFast.next!=null){
            pFast=pFast.next;
            pSlow=pSlow.next;
        }
        return pSlow;
    }
}