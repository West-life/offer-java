package offer2016;

import java.util.*;


/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if(pRoot==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(pRoot);
        int curSize=1,nextSize=0;
        while(!queue.isEmpty()){
            ArrayList<Integer> list=new ArrayList<Integer>();
            while(curSize-->0){
                TreeNode node=queue.poll();
                list.add(node.val);
            	if(node.left!=null){
                	queue.offer(node.left);
                    nextSize++;
            	}
            	if(node.right!=null){
                	queue.offer(node.right);
                    nextSize++;
            	}
            }
            curSize=nextSize;nextSize=0;
            result.add(list);
        }
        return result;
    }
}