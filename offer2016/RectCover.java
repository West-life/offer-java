package offer2016;

public class Solution {
    public int RectCover(int target) {
		if(target==0){
            return 0;
        }
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        int last=2,lastlast=1,cnt=target-2,tmp;
        while(cnt-->0){
            tmp=last;
            last +=lastlast;
            lastlast=tmp;
        }
        return last;
    }
}