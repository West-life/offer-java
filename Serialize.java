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
    private int index=0;
    String Serialize(TreeNode root) {
        if(root==null){
            return "#,";
        }
        return root.val+","+Serialize(root.left)+Serialize(root.right);
  }
    TreeNode Deserialize(String str) {
       String[] strArray=str.split(",");
       if(strArray[index].equals("#")){
           return null;
       }else{
           TreeNode root=new TreeNode(Integer.valueOf(strArray[index]));
           index++;
           root.left=Deserialize(str);
           index++;
           root.right=Deserialize(str);
           return root;
       }
  }
}