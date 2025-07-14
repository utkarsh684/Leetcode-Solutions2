class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char result=letters[0];
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                result=letters[i];
                break;
            }
        }
        return result;
    }
}
