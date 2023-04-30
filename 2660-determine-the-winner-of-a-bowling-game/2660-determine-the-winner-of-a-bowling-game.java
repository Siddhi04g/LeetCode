class Solution {
    public int isWinner(int[] p1, int[] p2) {
        int runs1 = p1[0], runs2 = p2[0];
        for(int i = 0 ; i < p1.length ; i ++){
            if(i >= 2){
                if (p1[i-1] == 10 || p1[i-2] == 10)
                    runs1 += 2*p1[i];
                else
                    runs1 += p1[i];
                
                if (p2[i-1] == 10 || p2[i-2] == 10)
                    runs2 += 2*p2[i];
                else
                    runs2 += p2[i];
            }
            if(i == 1){
                if(p1[i-1] == 10)
                    runs1 += 2*p1[i];
                else
                    runs1 += p1[i];
                 if(p2[i-1] == 10)
                    runs2 += 2*p2[i];
                else
                    runs2 += p2[i];
            }
        }
        if(runs1 > runs2)return 1;
        if(runs1 == runs2)return 0;
        if(runs1 < runs2)return 2;
        return -1;
        
    }
}