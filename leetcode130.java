class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        if(m==0) return;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i==0 || j==0 || i==m-1 || j==n-1) && board[i][j]=='O'){
                    dfs(board,i,j,m,n);
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                if(board[i][j]=='T'){
                    board[i][j]='O';
                }
            }
        }

    }
    private void dfs(char[][] board,int i,int j, int m, int n){
        if(i<0 || i>=m || j<0 || j>=n || board[i][j]!='O' ){
            return;
        }

         board[i][j]='T';

        dfs(board,i+1,j,m,n);
        dfs(board,i-1,j,m,n);
        dfs(board,i,j+1,m,n);
        dfs(board,i,j-1,m,n);

    }
}
