class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        return function(nums,new ArrayList<>(),0,list);
    }
    private List<List<Integer>> function(int[] nums, List<Integer> arr,int index,List<List<Integer>> list){
        if(index>=nums.length){
            list.add(new ArrayList<>(arr));
            return list;
        }

        arr.add(nums[index]);
        function(nums,arr,index+1,list);
        arr.remove(arr.size()-1);
        function(nums,arr,index+1,list);

        return list;
    }
}
