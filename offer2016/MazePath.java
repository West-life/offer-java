package offer2016;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid1={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,9}};
		int[][] grid2={{1,0,0,0},{1,1,0,0},{0,1,1,0},{0,0,9,0}};
		int[][] grid3={{1,1,0,0,0},{0,1,1,9,0},{0,0,1,1,0},{0,0,0,0,0}};
		int[][] grid4={{0,0,0,0,0},{0,1,1,0,0},{0,0,1,1,0},{0,0,0,0,0}};
		int[][] grid5={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,9}};
		System.out.println(isPath(grid1));
		System.out.println(isPath(grid2));
		System.out.println(isPath(grid3));
		System.out.println(isPath(grid4));
		System.out.println(isPath(grid5));
	}
    public static int isPath(int[][] grid){
    	boolean[] visited=new boolean[grid.length*grid[0].length];
    	boolean[] flag={false};
        if(myHasPath(grid, grid.length,grid[0].length,0,0,visited,flag))
            return 1;
        else
            return 0;
    }
    
    public static boolean myHasPath(int[][] grid,int rows, int cols,int row,int col,boolean[] visited,boolean[] flag){
        if(check(grid,rows,cols,row,col,visited,flag)){
            visited[row*cols+col]=true;
            myHasPath(grid,rows,cols,row,col-1,visited,flag);
            myHasPath(grid,rows,cols,row,col+1,visited,flag);
            myHasPath(grid,rows,cols,row-1,col,visited,flag);
            myHasPath(grid,rows,cols,row+1,col,visited,flag);
        }
        return flag[0];
    }
    public static boolean check(int[][] grid,int rows, int cols,int row,int col,boolean[] visited,boolean[] flag){
        if(row>=0&&row<rows&&col>=0&&col<cols&&grid[row][col]==1&&!visited[row*cols+col]){
            return true;
        }else if(row>=0&&row<rows&&col>=0&&col<cols&&grid[row][col]==9&&!visited[row*cols+col]){
        	flag[0]=true;
        	return false;
        }
        return false;
    }
    

    public static boolean hasPath(int i, int j, int[][] grid){

        boolean flag = false;
        if(grid[i][j] == 9)
            flag = true;
        if(grid[i][j] == 1){
            grid[i][j] = -1;
            if(i > 0)
                if(hasPath(i - 1, j, grid))
                    flag = true;
            if(i < grid.length - 1)
                if(hasPath(i + 1, j, grid))
                    flag = true;
            if(j > 0)
                if(hasPath(i, j - 1, grid))
                    flag = true;
            if(j < grid[0].length - 1)
                if(hasPath(i, j + 1, grid))
                    flag = true;    

        }
        return flag;
    }

}
