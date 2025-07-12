class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        List<List<Integer>> result=new ArrayList<>();
        function(nums,k,0,new ArrayList<>(),result);
        return result;
    }
    private void function(int[] nums,int k,int idx,List<Integer> list,List<List<Integer>> result){
        if(list.size()==k){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx;i<nums.length;i++){
            list.add(nums[i]);
            function(nums,k,i+1,list,result);
            list.remove(list.size()-1);
        }
    }
}
