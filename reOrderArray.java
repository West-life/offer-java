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