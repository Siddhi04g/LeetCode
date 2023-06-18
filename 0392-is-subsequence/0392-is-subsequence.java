class Solution {
    public boolean isSubsequence(String s, String t) {
         return subs(0,0,s,t);
    }
    public boolean subs(int i , int j , String s, String t){
        if(i >= s.length()) return true;
        
        if(j >= t.length()) return false;
        
        if(s.charAt(i) == t.charAt(j))
            return subs(i+1,j+1,s,t);
        else
            return subs(i,j+1,s,t);
    }
       
}