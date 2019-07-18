package offer2016;

import java.util.*;
public class Solution {
    public boolean isContinuous(int [] numbers) {
		if(numbers==null||numbers.length<1){
            return false;
        }
        Arrays.sort(numbers);
        int numberOfZreo=0;
        int numberOfGap=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                numberOfZreo++;
            }
        }
        int small=numberOfZreo;
        int big=small+1;
        while(big<numbers.length){
            if(numbers[big]==numbers[small]){
                return false;
            }
            numberOfGap +=numbers[big]-numbers[small]-1;
            small=big;
            big++;
        }
        return numberOfZreo>=numberOfGap?true:false;
    }
}