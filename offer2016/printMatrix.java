package offer2016;

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list=new ArrayList<Integer>();
       	if(matrix==null||matrix.length==0){
            return list;
        }
        int columnStart=0,columnEnd=matrix.length-1;
        int rowStart=0,rowEnd=matrix[0].length-1;
        while(true){
            //从左到右
            for(int i=rowStart;i<=rowEnd;i++){
                list.add(matrix[columnStart][i]);
            }
            if(++columnStart>columnEnd){
                break;
            }
            //从上到下
            for(int i=columnStart;i<=columnEnd;i++){
                list.add(matrix[i][rowEnd]);
            }
            if(--rowEnd<rowStart){
                break;
            }
            //从右到左
            for(int i=rowEnd;i>=rowStart;i--){
                list.add(matrix[columnEnd][i]);
            }
            if(--columnEnd<columnStart){
                break;
            }
            //从下到上
            for(int i=columnEnd;i>=columnStart;i--){
                list.add(matrix[i][rowStart]);
            }
            if(++rowStart>rowEnd){
                break;
            }
        }
        return list;
    }
}