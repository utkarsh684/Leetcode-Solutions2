class Solution {
    public int maxSubArray(int[] nums) {
       int result=Integer.MIN_VALUE;
       int curr=0;
       for(int n:nums){
        if(curr<0){
            curr=0;
        }
        curr+=n;
        result=Math.max(result,curr);
       }
       return result;
    }
}
