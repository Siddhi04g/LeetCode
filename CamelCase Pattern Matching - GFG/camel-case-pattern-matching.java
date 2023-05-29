//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0 ; i < N ; i ++){
            String s = Dictionary[i];
            String str = "";
            for(int j = 0 ; j < s.length(); j ++){
                if(Character.isUpperCase(s.charAt(j))){
                    str = str+s.charAt(j);
                }
            }
            if(str.startsWith(Pattern))
            list.add(s);
        }
        Collections.sort(list);
        if(list.isEmpty()) list.add("-1");
        return list;
    }
}