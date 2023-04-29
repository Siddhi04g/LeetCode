class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;int j=1;
        int [] arr=new int[2];
        while(i<nums.length-1){ 
             //System.out.print(i+","+j+"   ");
             if(j<nums.length && nums[i]+nums[j]==target ){
                arr[0]=i;
                arr[1]=j;
             }
            if(j==nums.length){
                i++;
                j=i;
            }
              j++;
        }
        return arr;
    }
}