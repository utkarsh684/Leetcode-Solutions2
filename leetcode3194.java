class Solution {
    public double minimumAverage(int[] nums) {
       List<Double> averages=new ArrayList<>();
       int n=nums.length;
       Arrays.sort(nums);
       for(int i=0;i<n/2;i++){
        double avg=(nums[i]+nums[n-1-i])/2.0;
        averages.add(avg);
       }
       return Collections.min(averages);
    }
}
