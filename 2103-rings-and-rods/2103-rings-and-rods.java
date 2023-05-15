//1 ms
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

//0 ms 
class Solution1 {
    public int countPoints(String rings) {
		int ret = 0;
        boolean[][] rods = new boolean[10][3];
        for (int i = 0; i < rings.length(); i += 2) {
			if (rings.charAt(i) == 'R') {
				rods[rings.charAt(i + 1) - '0'][0] = true;
			} else if (rings.charAt(i) == 'G') {
				rods[rings.charAt(i + 1) - '0'][1] = true;
			} else {
				rods[rings.charAt(i + 1) - '0'][2] = true;
			}
		}
        
        for (int i = 0; i < 10; i++) {
			if (rods[i][0] && rods[i][1] && rods[i][2]) ret++;
		}
        
        return ret;
    }
}