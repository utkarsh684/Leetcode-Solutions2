class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String word: words){
                if(check(word,s)){
                    count++;
                }
        }
        return count;
    }
    private boolean check(String word,String s){
        if(word.length()>s.length()){
            return false;
        }
        if(word.equals(s)){
            return true;
        }
        int i=0;
        while(i<word.length()){
            if(word.charAt(i)!=s.charAt(i)){
                return false;
            }
            i++;
        }
        return true;
    }
}
