class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0 && t.length()==1){
            return t.charAt(0);
        }

        Map<Character,Integer> map=new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch: t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            }
            else{
                return ch;
            }
            if(map.get(ch)<0){
                return ch;
            }
        }
        return 'a';
    }
}
