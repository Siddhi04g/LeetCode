class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for( char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int same = map.get(s.charAt(0));
        int count = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(same == entry.getValue()) count ++;
        }
        if(count == map.size()) return true;
        return false;
    }
}