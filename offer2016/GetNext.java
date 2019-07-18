package offer2016;

/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        TreeLinkNode myNode=pNode;
        if(myNode==null){
            return null;
        }
        if(myNode.right!=null){
            myNode=myNode.right;
            while(myNode.left!=null){
                myNode=myNode.left;
            }
            return myNode;
        }else if(myNode.next!=null&&myNode==myNode.next.left){
            return myNode.next;
        }else{
            while(myNode.next!=null&&myNode!=myNode.next.left){
                myNode=myNode.next;
            }
            return myNode.next;
        }
    }
}