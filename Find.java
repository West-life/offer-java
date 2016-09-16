public class Solution {
    public boolean Find(int [][] array,int target) {
		boolean found=false;
        if(array!=null){
        	int rows=array.length;
        	int cols=array[0].length;
            if(rows>0&&cols>0){
                int row=0;
                int col=cols-1;
                while(row<rows&&col>=0){
                    if(array[row][col]==target){
                        found=true;
                        break;
                    }else if(array[row][col]>target){
                        col--;
                    }else{
                        row++;
                    }
                }
            }
        }
        return found;
    }
}