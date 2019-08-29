package offer2019;

/**
 * Create by xuzhijun.online on 2019/8/29.
 */
public class Clone {

    public static RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null){
            return null;
        }
        //1, 复制链表
        RandomListNode pos = pHead;
        while (pos != null){
            RandomListNode node = new RandomListNode(pos.label);
            node.next = pos.next;
            pos.next = node;
            pos = node.next;
        }
        //2, 设置random指针
        RandomListNode pos2 = pHead;
        while (pos2 != null){
            if (pos2.random != null){
                pos2.next.random = pos2.random.next;
            }
            pos2 = pos2.next.next;
        }
        //3, 分离链表
        RandomListNode pos3 = pHead;
        RandomListNode pCloneHead = pHead.next;
        RandomListNode pos4 = pCloneHead;
        while (pos3 != null){
            pos3.next = pos3.next.next;
            pos3 = pos3.next;
            if (pos4.next != null){
                pos4.next = pos4.next.next;
                pos4 = pos4.next;
            }

        }
        return pCloneHead;
    }

    public static void main(String[] args) {
        RandomListNode A = new RandomListNode(1);
        RandomListNode B = new RandomListNode(2);
        RandomListNode C = new RandomListNode(3);
        RandomListNode D = new RandomListNode(4);
        RandomListNode E = new RandomListNode(5);

        A.next = B;
        A.random = C;
        B.next = C;
        B.random = E;
        C.next = D;
        D.next = E;
        D.random = B;

        System.out.println(Clone(A));
    }


}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}