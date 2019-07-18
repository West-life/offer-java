package offer2016;

public class BeautifulHomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid1={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		int[][] grid2={{0,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,0}};
		int[][] grid3={{0,0,0,0,0},{0,1,1,0,0},{0,0,1,1,0},{0,0,0,0,0}};
		int[][] grid4={{1,1,1,1},{0,0,0,0},{0,0,1,0},{0,1,1,1}};
		System.out.println(getCount(grid1,4,4));
		System.out.println(getCount(grid2,4,4));
		System.out.println(getCount(grid3,4,5));
		System.out.println(getCount(grid4,4,4));

	}
    public static int getCount(int[][] grid, int rows, int cols){
        boolean[] visited=new boolean[rows*cols];
        int result=0;
        for(int row=0;row<rows;row++){
        	for(int col=0;col<cols;col++){
        		if(getCountCore(grid,rows,cols,row,col,visited)){
        			result++;
        		}
        	}
        }
        return result;
    }
    public static boolean getCountCore(int[][] grid,int rows, int cols,int row,int col,boolean[] visited){
    	boolean res=false;
        if(check(grid,rows,cols,row,col,visited)){
            visited[row*cols+col]=true;
            getCountCore(grid,rows,cols,row,col-1,visited);
            getCountCore(grid,rows,cols,row,col+1,visited);
            getCountCore(grid,rows,cols,row-1,col,visited);
            getCountCore(grid,rows,cols,row+1,col,visited);
            res=true;
        }
        return res;
    }
    public static boolean check(int[][] grid,int rows, int cols,int row,int col,boolean[] visited){
        if(row>=0&&row<rows&&col>=0&&col<cols&&grid[row][col]==1&&!visited[row*cols+col]){
            return true;
        }
        return false;
    }
}
