class Solution {
    public String reverseOnlyLetters(String s) {
        int start=0;
        int last=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(start<last){
            char c1=s.charAt(start);
            char c2=s.charAt(last);
            if(Character.isLetter(c1) && Character.isLetter(c2)){
                sb.setCharAt(start,c2);
                sb.setCharAt(last,c1);
                start++;
                last--;
            }
            else if(Character.isLetter(c1) && !Character.isLetter(c2)){
                last--;
            }
            else if(!Character.isLetter(c1) && Character.isLetter(c2)){
                start++;
            }
            else{
                start++;
                last--;
            }
        }
        return sb.toString();
    }
}
