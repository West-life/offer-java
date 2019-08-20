package offer2019;

/**
 * Create by xuzhijun.online on 2019/8/20.
 */
public class IsPopOrder {
    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || popA == null || pushA.length != popA.length) {
            return false;
        }

        java.util.Stack<Integer> stack1 = new java.util.Stack<Integer>();

        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack1.push(pushA[i]);
            while (stack1.isEmpty() == false && stack1.peek() == popA[j]){
                stack1.pop();
                j++;
            }
        }
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,3,2,1};
        System.out.println(IsPopOrder(pushA,popA));
    }
}
