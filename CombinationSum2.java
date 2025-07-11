class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        function(candidates,target,0,result,new ArrayList<>());
        return result;
    }

    private void function(int[] nums,int target,int i,List<List<Integer>> result,List<Integer> list){
       if(target==0){
        result.add(new ArrayList<>(list));
        return ;
       }

       for(int j=i;j<nums.length;j++){
        if(j>i && nums[j]==nums[j-1]) continue;

        if(nums[j]>target) break;

        list.add(nums[j]);
        function(nums,target-nums[j],j+1,result,list);
        list.remove(list.size()-1);
       }
    }
}
