方法一：
public class Solution {
   	//java中\需要用\\来表示吧这个你应该知道，
    //而matches中传入的参数是什么呢 他并不是普通的字符串
    //你可以查一下api文档 它要求传入的是正则表达式
    //而正则表达式也需要这个\所以在这里有这个\\
    public boolean isNumeric(char[] str) {
        String string = String.valueOf(str);
        return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
    }
}

方法二：
public class Solution {
    public boolean isNumeric(char[] str) {
        try {
            double re = Double.parseDouble(new String(str));
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}