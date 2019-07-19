package offer2019;

/**
 * Create by xuzhijun.online on 2019/7/19.
 */
public class ReplaceSpace {

    public static String replaceSpace(StringBuffer str) {
        if(str == null){
            return null;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 0x20){
                res.append("%20");
            }else{
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We are happy")));
    }
}
