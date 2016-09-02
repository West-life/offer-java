import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(input==null||input.length==0||input.length<k||k==0){
            return result;
        }
        TreeSet<Integer> kSet=new TreeSet<Integer>();
        for(int i=0;i<input.length;i++){
            if(kSet.size()<k){
                kSet.add(input[i]);
            }else{
                if(kSet.last()>input[i]){
                    kSet.remove(kSet.last());
                    kSet.add(input[i]);
                }
            }
        }
        result.addAll(kSet);
        return result;
    } 
}