class Solution {
    public int countPoints(String rings) {
        HashMap<Character,HashSet<Character>> map = new HashMap<>();
        char c[] = rings.toCharArray();
        for(int i = 1 ; i < c.length ; i = i+2){
            if(map.containsKey(c[i])){
                HashSet<Character> s = map.get(c[i]);
                s.add(c[i-1]);
                map.put(c[i],s);
            }
            else{
                HashSet<Character> s = new HashSet<>();
                s.add(c[i-1]);
                map.put(c[i],s);
            }
        }
        
        int count = 0;
        for(Map.Entry<Character,HashSet<Character>> entry : map.entrySet()){
            HashSet<Character> s = entry.getValue();
            if(s.size() == 3) count ++;
        }
        return count;
    }
}