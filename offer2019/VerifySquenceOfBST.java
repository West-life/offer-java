package offer2019;

import java.util.Arrays;

/**
 * Create by xuzhijun.online on 2019/8/27.
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0){
            return false;
        }
        if (sequence.length < 3){
            return true;
        }
        int root = sequence[sequence.length - 1];
        //在二叉搜索树中左子树的节点小于根节点
        int i = 0;
        for (; i < sequence.length - 1; i++) {
            if (sequence[i] > root){
                break;
            }
        }
        //在二叉搜索树中右子树的节点大于根节点
        int j = i;
        for (; j < sequence.length - 1; j++) {
            if (sequence[j] < root){
                return false;
            }
        }
        boolean left = true;
        if (i > 0){
            left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));

        }
        boolean right = true;
        if (i < sequence.length - 1){
            right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, sequence.length - 1));
        }
        return left && right;
    }
}
