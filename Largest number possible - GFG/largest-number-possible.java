//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int S = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.findLargest(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String findLargest(int N, int S){
        // code here
        if(9*N < S) return "-1";
        StringBuilder s = new StringBuilder();
        //String s = "";
        int nine = S/9;
        int notnine = S%9;
        while(nine > 0){
            s.append("9");
            nine -- ;
        }
        if(s.length() < N)
        s.append(notnine);
        
        while(s.length() < N){
            s.append("0");
        }
        if(s.charAt(0) == ('0') && N>1) return "-1";


        return s.toString();
    }
}