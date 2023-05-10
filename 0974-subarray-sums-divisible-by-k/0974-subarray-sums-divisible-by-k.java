class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            nums[i]+=nums[i-1];
        }
        for(int i=0;i<n;i++)
        {
            nums[i]%=k;
            if(nums[i]<0)
            nums[i]+=k;
        }
        int freq[]=new int [k];
        freq[0]=1;
        for(int i=0;i<n;i++)
        {
            freq[nums[i]]++;
        }
        int c=0;
        for(int i=0;i<k;i++)
        {
            if(freq[i]>0)
            {
                c+=(freq[i]*(freq[i]-1))/2;
            }
        }
        return c;
    }
}