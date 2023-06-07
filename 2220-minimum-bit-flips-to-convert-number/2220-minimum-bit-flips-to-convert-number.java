class Solution {
    public int minBitFlips(int start, int goal) {
        int c = 0;
        for(int i = 0 ; i < 32 ; i ++){
            if((goal & 1) == 1 && (start & 1) == 0){
                c++;
            }
            if((goal & 1) == 0 && (start & 1) == 1){
                c++;
            }
            goal = goal >> 1;
            start = start >> 1;
        }
        return c;
    }
}