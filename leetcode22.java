class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        function(0,0,"",n,result);
        return result;
    }

    private void function(int open, int close, String s, int n, List<String> result) {
        if(s.length()==n*2){
            result.add(s);
            return;
        }

        if(open<n){
            function(open+1,close,s+"(",n,result);
        }
        if(close<open){
            function(open,close+1,s+")",n,result);
        }
        
    }
}
