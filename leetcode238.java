class Solution {
    public int[] productExceptSelf(int[] nums) {
          int[] res=new int[nums.length];
        if(nums.length>=2 && fun(nums)>=2){
            return res;
        }
        int pro=1;
        int sec=1;
        for(int i=1;i<nums.length;i++){
            pro=pro*nums[i];
            if(nums[i]!=0){
                sec=sec*nums[i];
            }
        }
        res[0]=pro;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=0){
                res[i]=(pro/nums[i])*nums[0];
                continue;
            }
            if(nums[i]==0){
                res[i]=sec*nums[0];
            }
        }
        return res;
    }
    private int fun(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        return count;
    }
}
