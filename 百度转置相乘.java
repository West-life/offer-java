package test;

import java.util.Arrays;
import java.util.Scanner;



public class Main{

	public static void main(String args[]) {
		int[][] res=transposeMultMatrix(1,3,3);
		for (int i = 0; i < res.length; i++) {
			System.out.println(Arrays.toString(res[i]));
		}
	}
	public static int[][] transposeMultMatrix(int initialValue,int rows, int columns){
		int val=initialValue;
		int[][] matrix=new int[rows][columns];
		int[][] transpose=new int[columns][rows];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){  
				matrix[i][j]=val;  
				transpose[j][i]=val;  
				val++;  
			}
		}
		return multiple(matrix,transpose);
	}
    public static int[][] multiple(int[][] a, int[][] b) {
        int [][] result = new int[a.length][b[0].length]; 
        for (int i = 0; i<a.length; i++) {
            for (int j = 0; j<b[0].length; j++) { 
                for (int k = 0; k<a[0].length; k++) { 
                    result[i][j]= result[i][j]+a[i][k]*b[k][j]; 
                } 
            } 
        }
        return result; 
    }
}