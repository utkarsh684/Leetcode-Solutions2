class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int l1=players.length;
        int l2=trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j=0;
        while(i<l1 && j<l2){
            if(players[i]<=trainers[j]){ i++; 
            j++;
            }
            else{
                j++;
            }
        }
        return i;
    }
}
