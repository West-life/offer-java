public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(!checkInvalidArray(array)){
            return 0;
        }
        int result=array[0];
        int times=1;
        for(int i=1;i<array.length;i++){
            if(times==0){
                result=array[i];
                times=1;
            }else if(array[i]==result){
                times++;
            }else{
                times--;
            }
        }
        if(!checkMoreThanHalf(array,result)){
            result=0;
        }
        return result;
    }
    
    private boolean checkInvalidArray(int[] array){
        if(array==null||array.length==0){
            return false;
        }
        return true;
    }
    
    private boolean checkMoreThanHalf(int[] array,int num){
        int times=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                times++;
            }
        }
        if(times*2<=array.length){
            return false;
        }else{
            return true;
        }
    }
}