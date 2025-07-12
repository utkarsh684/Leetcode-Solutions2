class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }   
        int result=10;
        int avail=9;
        int prod=9;
        for(int i=2;i<=n && avail>0 ; i++){
            prod=prod*avail;
            result+=prod;
            avail--;
        }
        return result;
    }
}
