package offer2016;

import java.util.*;
public class Solution {
    public ArrayList<String> Permutation(String str) {
       ArrayList<String> ans=new ArrayList<String>();
       TreeSet<String>  dupAns=new TreeSet<String>();
       if(str!=null&&str.length()>0){
           myPermutation(str.toCharArray(),0,dupAns);
       }
       ans.addAll(dupAns);
       return ans;
    }
    private void myPermutation(char[] charArray,int index,TreeSet<String> dupAns){
         if(index==charArray.length-1){
             dupAns.add(String.valueOf(charArray));
             return;
         }
         int i=index;
         char[] fatherChar=charArray;
         while(i<charArray.length){
             fatherChar=swap(charArray,index,i);
             myPermutation(fatherChar,index+1,dupAns);
             i++;
         }
        return;
    }
   	private char[] swap(char[] charArray,int start,int end){
    	 char[] result=Arrays.copyOf(charArray,charArray.length);
    	 char tmp=result[start];
    	 result[start]=result[end];
    	 result[end]=tmp;
    	 return result;
     }
}