class Solution {
    public int[] sortedSquares(int[] nums) {
        int point1=0,point2=nums.length-1;
        int arr[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[point1])>Math.abs(nums[point2])){
                arr[i]=nums[point1]*nums[point1];
                point1++;
            }
            else{
                arr[i]=nums[point2]*nums[point2];
                point2--;
            }

        }
        return arr;
    }
}
