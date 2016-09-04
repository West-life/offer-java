import java.util.ArrayList;
public class Solution {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(array==null||array.length==0){
            return ans;
        }
        for(int i=0,j=array.length-1;i<j;){
            if(array[i]+array[j]>sum){
                j--;
            }else if(array[i]+array[j]<sum){
                i++;
            }else{
                ans.add(array[i]);
                ans.add(array[j]);
                break;
            }
        }
        return ans;
    }
}