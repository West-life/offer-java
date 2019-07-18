package offer2016;

import java.util.ArrayList;
/**
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
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> fatherList=new ArrayList<Integer>();
        myFindPath(root,target,ans,fatherList);
        return ans;
    }
    private void myFindPath(TreeNode root,int target,
                ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> fatherList) {
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            if(sum(fatherList)+root.val==target){
                fatherList.add(root.val);
                ans.add(fatherList);
            }
            return;
        }
        ArrayList<Integer> oneOfAns=new ArrayList<Integer>();
        oneOfAns.addAll(fatherList);
        oneOfAns.add(root.val);
        if(root.left!=null){
            myFindPath(root.left,target,ans,oneOfAns);
        }
        if(root.right!=null){
            myFindPath(root.right,target,ans,oneOfAns);
        }
    }
    private int sum(ArrayList<Integer> list){
        int ans=0;
        for(Integer num:list){
            ans +=num;
        }
        return ans;
    }
}