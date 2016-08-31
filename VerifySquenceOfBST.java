public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
 		return myVerifySquenceOfBST(sequence,0,sequence.length-1);
    }
    private boolean myVerifySquenceOfBST(int [] sequence,int start,int end) {
        if(sequence==null||sequence.length==0){
            return false;
        }
        if(start>=end){
            return true;
        }
       	int root=sequence[end];
        //在二叉搜索树中左子树的节点小于根节点
        int i=0,j=0;
        for(;i<end;i++){
            if(sequence[i]>root){
                break;
            }
        }
        //在二叉搜索树中右子树的节点大于根节点
        for(j=i;j<end;j++){
            if(sequence[j]<root){
                return false;
            }
        }
        //判断左子树是不是二叉搜索树
        boolean left=myVerifySquenceOfBST(sequence,start,i-1);
        //判断右子树是不是二叉搜索树
        boolean right=myVerifySquenceOfBST(sequence,i,end-1);
        return left&&right;
    }
}