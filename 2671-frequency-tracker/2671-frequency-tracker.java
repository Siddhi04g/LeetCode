class FrequencyTracker { 
    int[] arr;
    int[] freq;
    public FrequencyTracker() {
        arr = new int[100001];
        freq = new int[100001];
    }
    
    public void add(int number) {
        if(arr[number] > 0) freq[arr[number]]--;
        
        arr[number]++;
        freq[arr[number]]++;
    }
    
    public void deleteOne(int number) {
       if(arr[number] > 0){
           freq[arr[number]]--;
           arr[number]--;
           freq[arr[number]]++;
       }
        
    }
    
    public boolean hasFrequency(int frequency) {
       return freq[frequency] > 0;
    }
}


/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */