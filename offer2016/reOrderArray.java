package offer2016;

//方法一：类似冒泡排序
public class Solution {
    public void reOrderArray(int [] array) {
        if(array==null||array.length==0){
            return;
        }
        int tmp;
		for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(((array[j]&1)==0)&&((array[j+1]&1)==1)){
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }
}
//方法二：再开一个辅助数组，前后指针

//方法s三：前后指针，书上的方法，时间O（n），但是不能保证元素之前的相对位置
public class Solution {
    public void reOrderArray(int [] array) {
        reOrderArray(array,new JudgeOddEven());
    }
    public void reOrderArray(int [] array,Judge judge) {
        if(array==null||array.length==0){
            return;
        }
        int start=0,end=array.length-1;
        while(start<end){
            while(start<end&&!judge.judge(array[start]))
                start++;
            while(start<end&&judge.judge(array[end]))
                end--;
            if(start<end){
                int tmp=array[start];
                array[start]=array[end];
                array[end]=tmp;
            }    
        }
    }
}

interface Judge{
    public boolean judge(int n);
}
class JudgeOddEven implements Judge{
    public boolean judge(int n){
        return (n&1)==0;
    }
}
