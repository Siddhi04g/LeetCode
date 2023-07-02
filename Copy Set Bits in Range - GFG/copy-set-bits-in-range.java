//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line[] = in.readLine().trim().split("\\s+");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int l = Integer.parseInt(line[2]);
            int r = Integer.parseInt(line[3]);
            
            Solution ob = new Solution();
            System.out.println(ob.setSetBit(x, y, l, r));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int setSetBit(int x, int y, int l, int r){
        // code here
        int c = 1;
        String str = "";
        for(int i = 1 ; i <= 32; i++){
            if( c >= l && c <= r ){

                if((y&1) == 1 ){
                   str = "1" + str;
                }
                else if((x&1) == 1){
                    str = "1" + str;
                }
                else str = "0" + str;
                y = y>>1;
                x = x>>1;
                c++;
            }
            else{
                
                str = (x&1) + str;
                y = y>>1;
                x = x>>1;
                c++;
            }
            //System.out.println(str);
            //if(c>r) break;
            
        }
        return Integer.parseInt(str,2);
    }
}