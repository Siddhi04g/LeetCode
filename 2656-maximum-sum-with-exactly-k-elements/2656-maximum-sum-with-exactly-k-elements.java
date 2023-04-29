class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int val : nums)
        max = Math.max(max,val);
        int sum = 0;
        while(k-->0){
            sum += max;
            max++;
        }
        return sum;
    }
}