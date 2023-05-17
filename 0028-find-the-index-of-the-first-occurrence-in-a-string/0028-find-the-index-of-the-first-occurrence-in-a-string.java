class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0 )return 0;
        return haystack.indexOf(needle);
    }
}
class Solution1 {
    public int strStr(String haystack, String needle) {
        int min=haystack.length();
        int i=0;
        String dtr="";
        if(haystack.length()<needle.length())
            return -1;
        //int a;
         while(i<=(haystack.length()-needle.length()))
         {
             if(haystack.charAt(i)==needle.charAt(0))
             {
                 // if(i<min)
                      min=i;
                 //a=haystack.length()- min;
                 int a=i;
                 for(int j=0;j<needle.length();j++)
                 {
                     if(i<haystack.length()){
                     dtr=dtr+haystack.charAt(a);
                     a++;
                     }
                 }
             if(dtr.equals(needle))
                 return min;
                 dtr="";
            
             } 
                 i++;
         }
        return -1;
    }
}