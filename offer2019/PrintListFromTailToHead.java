package offer2019;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Create by xuzhijun.online on 2019/7/23.
 */
public class PrintListFromTailToHead {

    /**
     * 方法一：递归
     * 缺点：有可能栈溢出
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if (listNode != null){
            recursively(listNode, res);
        }
        return res;
    }

    public void recursively(ListNode listNode, ArrayList<Integer> list){
        if(listNode.next != null){
            recursively(listNode.next, list);
        }
        list.add(listNode.val);
    }

    /**
     * 方法二：栈
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode tmp = listNode;
        while (tmp != null){
            stack.add(tmp.val);
            tmp = tmp.next;
        }
        while (!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }

}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

