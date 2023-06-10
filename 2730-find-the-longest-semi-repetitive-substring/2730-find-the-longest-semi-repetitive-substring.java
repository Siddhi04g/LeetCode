class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < s.length() ; i ++){
            int ans = 1;
            int flag = 0;
            for(int j = i ; j < s.length()-1 ; j ++){
                if(s.charAt(j) == (s.charAt(j+1))) flag ++;
                if(flag <= 1) ans++;
                else break;
            }
            max = Math.max(max,ans);
        }
        return max;
    }
}