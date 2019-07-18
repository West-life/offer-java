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
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
 		int length1=getListLenght(pHead1);
        int length2=getListLenght(pHead2);
        int lengthDif=length1-length2;
        ListNode pListHeadLong=pHead1;
        ListNode pListHeadShort=pHead2;
        if(length2>length1){
            pListHeadLong=pHead2;
        	pListHeadShort=pHead1;
            lengthDif=length2-length1;
        }
        for(int i=0;i<lengthDif;i++){
            pListHeadLong=pListHeadLong.next;
        }
        while(pListHeadShort!=null&&pListHeadShort!=pListHeadLong){
            pListHeadLong=pListHeadLong.next;
        	pListHeadShort=pListHeadShort.next;
        }
        ListNode pFirstCommonNode=pListHeadLong;
        return pFirstCommonNode;
    }
    
    private int getListLenght(ListNode pHead){
        int length=0;
        ListNode pNode=pHead;
        while(pNode!=null){
            length++;
            pNode=pNode.next;
        }
        return length;
    }
}