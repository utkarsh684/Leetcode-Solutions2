class Node {
    int first;
    int second;

    Node(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Node> q= new LinkedList<Node>();
        int[][] vis = new int[m][n];
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    vis[i][j]=1;
                }
                else{
                    if(i==0 || j==0 || i==m-1 ||j==n-1){
                        q.add(new Node(i,j));
                        vis[i][j]=1;
                    }
                }
            }
        }

        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;
            q.remove();

            for(int i=0;i<4;i++){
                int nrow = r+delrow[i];
                int ncol = c+delcol[i];

                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]==1 && vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.add(new Node(nrow,ncol));
                }
            }
        }

        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
}
