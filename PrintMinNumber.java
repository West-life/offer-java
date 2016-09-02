import java.util.*;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
                // Write your code here
    	String result="";
    	if(numbers==null||numbers.length==0){
    		return result;
    	}
        String[] NUMs=new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            NUMs[i]=String.valueOf(numbers[i]);
        }
        Arrays.sort(NUMs,new myComparetor());
        for(int i=0;i<NUMs.length;i++){
            result +=NUMs[i];
        }
        
        return changeToValidOutput(result);
    }
    
    private static String changeToValidOutput(String input){
    	while(input.charAt(0)=='0'){
    		if(input.length()==1){
    			break;
    		}
    		input=input.substring(1);
    	}
    	return input;
    }
}
class myComparetor implements Comparator<String>{

	@Override
	public int compare(String a, String b) {
		// TODO Auto-generated method stub
		if((a+b).compareTo(b+a)<0){
				return -1;
		}else if((a+b).compareTo(b+a)>0){
			return 1;
		}else{
			return 0;
		}
	}
}