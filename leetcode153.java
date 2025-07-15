class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int i=0;
        while(i<nums.length){
            if(nums[i]<min){
                min=nums[i];
            }
            i++;
        }
        return min;
    }
}
