class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]*2) || (arr[i]%2==0 && set.contains(arr[i]/2))){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
