class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    bfs(grid,visited,i,j);
                    count++;
                }
            }
        }
        return count;
    }
        private void bfs(char[][] grid,boolean[][] visited,int i,int j){
            int rows=grid.length;
            int cols=grid[0].length;
            if(i<0 || j<0 || i>=rows || j>=cols || visited[i][j] || grid[i][j]=='0'){
                return;
            }
            visited[i][j]=true;
            bfs(grid,visited,i+1,j);
            bfs(grid,visited,i-1,j);
            bfs(grid,visited,i,j+1);
            bfs(grid,visited,i,j-1);
        }
}
