package offer2019;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by xuzhijun.online on 2019/8/16.
 */
public class Stack {

    private static List data = new ArrayList();
    private static List minList = new ArrayList();

    public static void push(int node) {
        data.add(node);
        if (minList.size() == 0 || node < (int) minList.get(minList.size() - 1)) {
            minList.add(node);
        } else {
            minList.add(minList.get(minList.size() - 1));
        }
    }

    public static void pop() {
        data.remove(data.size() - 1);
        minList.remove(minList.size() - 1);
    }

    public static int top() {
        return (int) data.get(data.size() - 1);
    }

    public static int min() {
        return (int) minList.get(minList.size() - 1);
    }

    public static void main(String[] args) {
        push(3);
        min();
    }

}
