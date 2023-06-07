class Solution {
    public int minBitFlips(int start, int goal) {
        /*We need to count the number of corresponding bits of start and goal that are different.
        xor-ing start and goal will result in a new number with binary representation of 0 
        where the corresponding bits start and goal are equal and 1 where the corresponding bits are different.

        For example: 10 and 7
        10 = 1010
        7 = 0111

        10 xor 7 = 1101 (3 ones)

        Next we need to count the number of 1s (different bits)
        */
        int c = start ^ goal; 
        return Integer.bitCount(c);
    }
}

class Solution1 {
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