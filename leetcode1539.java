class Solution {
    public static int findKthPositive(int[] arr, int k) {
        int c=0;
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<arr[arr.length-1];i++){
            if(c<arr.length && arr[c]==i){
                c++;
            }
            else{
                list.add(i);
            }
        }
        if(k>list.size()){
            return k-list.size()+arr[arr.length-1];
        }
        return list.get(k-1);
    }
}
