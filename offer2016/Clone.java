package offer2016;

/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        cloneNodes(pHead);
        connectSiblingNodes(pHead);
        return reconnectNodes(pHead);
    }
    private void cloneNodes(RandomListNode pHead){
        RandomListNode pos=pHead;
        while(pos!=null){
            RandomListNode cloneNode=new RandomListNode(pos.label);
            cloneNode.next=pos.next;
            pos.next=cloneNode;
            pos=cloneNode.next;
        }
    }
    private void connectSiblingNodes(RandomListNode pHead){
        RandomListNode pos=pHead;
        while(pos!=null){
            if(pos.random!=null){
                pos.next.random=pos.random.next;
            }
            pos=pos.next.next;
        }
    }
    private RandomListNode reconnectNodes(RandomListNode pHead){
        if(pHead==null){
            return null;
        }
        RandomListNode node=pHead;
        RandomListNode cloneHead=node.next;
        RandomListNode cloneNode=cloneHead;
        while(cloneNode.next!=null){
            node.next=cloneNode.next;
            node=node.next;
            cloneNode.next=node.next;
            cloneNode=cloneNode.next;
        }
        node.next=null;
        return cloneHead;
    }
}