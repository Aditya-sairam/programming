class minpathsum
{
     static int N=4;
    //public int minPathSum(int[][] grid) {
    //return dfs(0,0,grid);

 
public static int dfs(int i, int j, int[][] grid){
    if(i==grid.length-1 && j==grid[0].length-1){
        return grid[i][j];
    }
 
    if(i<grid.length-1 && j<grid[0].length-1){
        int r1 = grid[i][j] + dfs(i+1, j, grid);
        int r2 = grid[i][j] + dfs(i, j+1, grid);
        return Math.min(r1,r2);
    }
 
    if(i<grid.length-1){
        return grid[i][j] + dfs(i+1, j, grid);
    }
 
    if(j<grid[0].length-1){
        return grid[i][j] + dfs(i, j+1, grid);
    }
 
    return 0;
}
	public static void main (String[] args) throws java.lang.Exception
	{
	   int min = Integer.MAX_VALUE;
	int[][] maze =
	{
		{ 5, 6, 7, 10 },
		{ 1, 0, 0, 1 },
		{ 9, 1, 4, 3 },
		{ 4, 2, 0, 1 }
	};
	
	System.out.print(dfs(0,0,maze));
	    
	}
}
