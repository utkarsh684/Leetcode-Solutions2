class Solution {
    public int countBinarySubstrings(String s) {
        int p=0;
        int r=0;
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                r+=Math.min(c,p);
                p=c;
                c=1;
            }
        }
        r+=Math.min(c,p);
        return r;
    }
}
