class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> res=new ArrayList<>();

        for (int i = 0; i < isConnected.length; i++) {
            res.add(new ArrayList<>());
        }

        for(int i=0;i<isConnected.length;i++){
            List<Integer> ls=new ArrayList<>();
            for(int j=0;j<isConnected.length;j++){
                if(i!=j && isConnected[i][j]!=0){
                    res.get(i).add(j);
                    res.get(j).add(i);
                }
            }
        }

        int v=isConnected.length;
        boolean []visited = new boolean[v];
        int count=0;
        for(int i=0;i<v;i++){
            if(!visited[i]){
                dfs(res,i,visited);
                count++;
            }
        }
        return count;
    }
    private void dfs(List<List<Integer>> ls,int curr, boolean[] visited){
        visited[curr]=true;
        for(int n: ls.get(curr)){
            if(!visited[n]){
                dfs(ls,n,visited);
            }
        }
    }
}
