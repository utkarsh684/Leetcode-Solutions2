class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        if(nums.length==2){
            if(nums[0]%2==0){
                return nums;
            }
        }
        int[] arr=new int[nums.length];
        int k=0,i=0,j=1;
        while(k<nums.length){
            if(nums[k]%2==0){
                arr[i]=nums[k];
                k++;
                i+=2;
            }
            else{
                arr[j]=nums[k];
                k++;
                j+=2;
            }
        }
        return arr;
    }
}
