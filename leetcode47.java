class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        function(nums,used,new ArrayList<>(),result);
        return result;
    }
    private void function(int[] nums,boolean[] used,List<Integer> list,List<List<Integer>> result){
        if(list.size()==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            used[i]=true;
            list.add(nums[i]);
            function(nums,used,list,result);
            used[i]=false;
            list.remove(list.size()-1);
        }
    }
}
