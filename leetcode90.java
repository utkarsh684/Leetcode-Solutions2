class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        function(nums,result,new ArrayList<>(),0);
        return result;
    }

    private void function(int[] nums,List<List<Integer>> result,List<Integer> list,int index){
        if(index>=nums.length){
            if(!result.contains(list)){
                result.add(new ArrayList<>(list));
            }
            return;
        }

        list.add(nums[index]);
        function(nums,result,list,index+1);
        list.remove(list.size()-1);
        function(nums,result,list,index+1);
    }
}
