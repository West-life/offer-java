package offer2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Create by xuzhijun.online on 2019/9/2.
 */
public class Permutation {

    public static ArrayList<String> Permutation(String str) {
        char[] ch = str.toCharArray();
        ArrayList<String> res = new ArrayList<String>();
        res.addAll(permutation(ch, 0));
        Collections.sort(res);
        return res;
    }

    private static HashSet<String> permutation(char[] ch, int start) {
        char[] ch2 = ch.clone();
        HashSet<String> res = new HashSet<>();
        for (int i = start; i < ch2.length; i++) {
            char tmp = ch2[start];
            ch2[start] = ch2[i];
            ch2[i] = tmp;
            res.add(new String(ch2));
            res.addAll(permutation(ch2.clone(), start + 1));
            ch2 = ch.clone();
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList al = Permutation("aab");
        System.out.println(al);
    }
}
