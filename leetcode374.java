public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left=1;
        int right=n;
        int flag=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(guess(mid)==0){
                flag=mid;
                break;
            }
            else if(guess(mid)==-1){
                right=mid-1;
            }
            else if(guess(mid)==1){
                left=mid+1;
            }
        }
        return flag;
    }
}
