import java.util.*;
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int result=Integer.MAX_VALUE;
        List<Integer> list=new ArrayList<>();
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                result=Math.min(result,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(result==Integer.MAX_VALUE){
            return 0;
        }
        return result;
    }
}
