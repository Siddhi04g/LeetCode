//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        long ps[] = new long[arr.length];
        long psb[] = new long[arr.length];
        ps[0] = arr[0];
        psb[arr.length - 1] = arr[arr.length -1];
        for(int i = 1 ; i < arr.length ; i ++){
            ps[i] = ps[i-1] + arr[i];
            psb[arr.length -i -1] =psb[n-i] + arr[arr.length -i -1];
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(ps[i] == psb[i]) return i+1;
        }
        return -1;
        // Your code here
    }
}
