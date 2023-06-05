class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int i=0;i<nums.length;i++){
             if(map.containsKey(nums[i]))
                 map.put(nums[i],map.get(nums[i])+1);
             else
                 map.put(nums[i],1);
         }int[] arr=new int[k];
        int idx=-1;
        int max=0;
        int m=0;
         while(k>0){
            max=0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue()>max){
                    idx=entry.getKey();
                    max=entry.getValue();
                }
            }
             
             arr[m++]=idx;
             map.remove(idx);
             k--;
         }
        return arr;
    }
}