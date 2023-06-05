class Solution {
    public int consecutiveNumbersSum(int sum) {
        int count = 0;
        for(int n = 1; (sum - (n*(n-1)/2)) > 0 ; n++){
            if((sum - n*(n-1)/2) % n == 0) count ++;
        }
        return count;
    }
}