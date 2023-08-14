class Solution {
    public int findKthLargest(int[] nums, int t) {
       //  int max=nums[0];
       //  for(int i=0;i<nums.length;i++)
       //      if(max<nums[i])
       //          max=nums[i];
       //  int freq[] =new int[max+1];
       // for(int i=0;i<nums.length;i++)
       //     freq[nums[i]]++;
       //  int k=0;
       //  int arr[]=new int[nums.length];
       //  for(int i=0;i<freq.length;i++){
       //      if(freq[i]!=0)
       //          arr[k++]=i;
       //  }
       //  return arr[nums.length-t];
        Arrays.sort(nums);
        return nums[nums.length-t];
    }
}