class Solution {
    public boolean validPalindrome(String s) {
        int start=0;
        int last=s.length()-1;
        boolean flag=true;
        while(start<last && flag==true){
            if(s.charAt(start)!=s.charAt(last)){
                if(!function(s,start)){
                    if(!function(s,last)){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
                else{
                    return true;
                }
            }
            start++;
            last--;
        }
        return true;
    }
    private boolean function(String s,int index){
        int start=0;
        StringBuilder sb=new StringBuilder(s);
        sb.deleteCharAt(index);
        int last=sb.length()-1;
        while(start<last){
            if(sb.charAt(start)!=sb.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}
