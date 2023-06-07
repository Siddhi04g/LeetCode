class Solution {
    public int climbStairs(int n) {
    //     return (fact(n)/(fact(n-2)*2));
    // }
    // int fact(int n)
    // {
    //     int f=1,i;
    //     for(i=1;i<=n;i++)
    //         f=f*i;
    //     return f;
        int i;
        int[] a=new int[n+2];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        
        for(i=3;i<=n;i++)
            a[i]=a[i-1]+a[i-2];
        return a[n];
    }
}