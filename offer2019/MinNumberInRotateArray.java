package offer2019;

/**
 * Create by xuzhijun.online on 2019/7/29.
 */
public class MinNumberInRotateArray {

    public int minNumberInRotateArray(int [] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        int index1 = 0;
        int index2 = array.length - 1;
        int indexMid = (index1 + index2)/2;
        while (index2 - index1 > 1){
            if (array[index1] == array[indexMid] && array[indexMid] == array[index2]){
                minInOrder(array);
            }else if (array[index1] > array[indexMid]){
                index2 = indexMid;
                indexMid = (index1 + index2)/2;
            }else if (array[index1] <= array[indexMid]){
                index1 = indexMid;
                indexMid = (index1 + index2)/2;
            }
        }
        return array[index2];
    }
    public int minInOrder(int [] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
