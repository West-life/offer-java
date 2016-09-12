import java.util.*;
public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        int[] pathLength={0};
        boolean visited[]=new boolean[rows*cols];
    	for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
                if(hasPathCore(matrix,rows,cols,i,j,str,pathLength,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean hasPathCore(char[] matrix, int rows, int cols,int row,int col, char[] str,int[] pathLength,boolean[] visited){
        if(pathLength[0]>=str.length){
            return true;
        }
        boolean hasPath=false;
        if(row>=0&&row<rows&&col>=0&&col<cols&&matrix[row*cols+col]==str[pathLength[0]]&&!visited[row*cols+col]){
            pathLength[0]++;
            visited[row*cols+col]=true;
            hasPath=hasPathCore(matrix,rows,cols,row,col-1,str,pathLength,visited)
                ||hasPathCore(matrix,rows,cols,row,col+1,str,pathLength,visited)
                ||hasPathCore(matrix,rows,cols,row-1,col,str,pathLength,visited)
                ||hasPathCore(matrix,rows,cols,row+1,col,str,pathLength,visited);
            if(!hasPath){
                pathLength[0]--;
                visited[row*cols+col]=false;
        	}
        }
        return hasPath;
    }


}