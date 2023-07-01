class Solution {
    int ans = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        int bags[] = new int [k];
        solve(cookies , 0 , bags);
        return ans;
    }
    private void solve(int cookies[] , int idx , int[] bags){
        int k = bags.length;
        if(idx >= cookies.length){
            int max = Integer.MIN_VALUE;
            for(int i = 0 ; i < k ; i ++){
                max = Math.max(bags[i] , max);
            }
            ans = Math.min(ans , max);
            return;
        }
        for(int i = 0 ; i < k ; i ++){
            bags[i] += cookies[idx];
            solve(cookies , idx + 1 , bags);
            bags[i] -= cookies[idx];
            if(bags[i] == 0) break;
        }
    }
}