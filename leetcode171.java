class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        int n=columnTitle.length();
        for(int i=0;i<columnTitle.length();i++){
            result+=((columnTitle.charAt(n-i-1))-'A'+1)*(int)(Math.pow(26,i));
        }
        return result;
    }
}
