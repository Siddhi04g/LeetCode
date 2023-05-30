class MyHashSet {
    HashMap<Integer,Boolean> map;
    public MyHashSet() {
        map=new HashMap<>();
    }
    
    public void add(int key) {
        if(!map.containsKey(key))
        map.put(key,true);
    }
    
    public void remove(int key) {
        map.remove(key);
    }
    
    public boolean contains(int key) {
        if(map.containsKey(key))
        return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */