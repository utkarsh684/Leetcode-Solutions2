class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int large=0;
        boolean[][] visited=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1 && !visited[i][j]) {
                    int temp=bfs(grid,visited,i,j);
                    large=Math.max(large,temp);
                }
            }
        }
         return large;
    }
    private int bfs(int[][] grid,boolean[][] visited,int i,int j){
        int rows=grid.length;
        int cols=grid[0].length;
        if(i<0||j<0||i>=rows||j>=cols||visited[i][j]||grid[i][j]==0){
            return 0;
        }
        visited[i][j]=true;
            return 1+bfs(grid,visited,i+1,j)
           + bfs(grid,visited,i-1,j)
            +bfs(grid,visited,i,j+1)
            +bfs(grid,visited,i,j-1);
            
    }
}
