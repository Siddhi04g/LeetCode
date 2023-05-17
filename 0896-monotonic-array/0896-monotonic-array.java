class Solution1 {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length,i,incr=0,decr=0,eq=0;
        for(i=1;i<n;i++){
            if(nums[i-1]<nums[i]) incr++;
            else if(nums[i-1]>nums[i]) decr++;
            if(incr > 0 && decr > 0) return false;
        }
        return true;
    }
}

//optimised: 
class Solution {
    public boolean isMonotonic(int[] A) {
        return increasing(A) || decreasing(A);
    }

    public boolean increasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] > A[i+1]) return false;
        return true;
    }

    public boolean decreasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] < A[i+1]) return false;
        return true;
    }
}