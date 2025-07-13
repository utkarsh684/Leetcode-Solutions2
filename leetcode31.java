class Solution {
    public void nextPermutation(int[] nums) {
       int c=-1;
       int ind=-1;
       int small=-Integer.MAX_VALUE;
       for(int i=nums.length-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            c=i;
            break;
        }
       }
       if(c==-1){
        reverse(nums,0);
       }
       else{
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[c]){
                ind=i;
                break;
            }
        }
        swap(nums,c,ind);
        reverse(nums,c+1);
       }
    }
    
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }    
    }

}
