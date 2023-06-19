class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude= new int[gain.length+1];
        altitude[0]=0;
        for(int i=1;i<gain.length+1;i++){
            altitude[i]=gain[i-1]+altitude[i-1];
        }
         for(int i=1;i<altitude.length;i++){
            System.out.print(altitude[i]+" ");
        }
        int max=altitude[0];
        for(int i=0;i<altitude.length;i++){
            if(altitude[i]>max)
                max=altitude[i];
        }
        return max;
    }
}