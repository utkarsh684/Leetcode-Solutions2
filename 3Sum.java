class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int temp=nums[i]+nums[j]+nums[k];
                if(temp<0){
                    j++;
                }
                else if(temp>0){
                    k--;
                }
                else{
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j] == nums[j-1] && j<k){
                        j++;
                    } 
                }
            }
        }
        return result;
    }
}
