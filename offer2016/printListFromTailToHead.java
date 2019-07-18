package offer2016; /**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    private ArrayList<Integer> list=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode==null){
            return list;
        }
        list=printListFromTailToHead(listNode.next);
        list.add(listNode.val);
        return list;
    }
}