class Solution {
    static final int MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long even =(n+1)/2;
        long odd=n/2;
        long pow5=function(5,even);
        long pow4=function(4,odd);
        return (int)((pow5*pow4)%MOD);
    }
    private long function(long base,long exp){
        long result=1;
        while(exp>0){
            if(exp%2==1){
                result=(result*base)%MOD;
            }
            base=(base*base)%MOD;
            exp=exp/2;
        }
        return result;
    }
}
