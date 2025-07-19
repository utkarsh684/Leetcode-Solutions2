class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        if(map.size()<=k){
            return 0;
        }
        List<Integer> ls=new ArrayList<>(map.values());
        Collections.sort(ls);
        int c=0,temp=ls.size(),i=0;
        while(temp>k){
            c+=ls.get(i);
            i++;
            temp--;
        }
        return c;
    }
}
