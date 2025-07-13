class Solution {
    public int findDuplicate(int[] nums) {
       int small=nums[0];
       int fast=nums[0];
       do{
        small=nums[small];
        fast=nums[nums[fast]];
       }
       while(small!=fast);
       small=nums[0];
       while(small!=fast){
        small=nums[small];
        fast=nums[fast];
       }
       return small;
    }
}
