class Solution {
    public boolean canJump(int[] nums) {
        int temp=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=temp){
                temp=i;
            }
        }
        return temp==0;
    }
}
