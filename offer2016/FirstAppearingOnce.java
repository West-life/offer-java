package offer2016;

public class Solution {
    private int occurrence[]=new int[256];
    private int index=0;
    //Insert one char from stringstream
    public Solution(){
        for(int i=0;i<256;i++){
            occurrence[i]=-1;
        }
    }
    public void Insert(char ch){
        if(occurrence[ch]==-1){
            occurrence[ch]=index;
        }else{
            occurrence[ch]=-2;
        }
        index++;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce(){
        int minIndex=Integer.MAX_VALUE;
        char ans='#';
    	for(int i=0;i<256;i++){
            if(occurrence[i]>=0&&occurrence[i]<=minIndex){
                minIndex=occurrence[i];
                ans=(char)i;
            }
        }
        return ans;
    }
}