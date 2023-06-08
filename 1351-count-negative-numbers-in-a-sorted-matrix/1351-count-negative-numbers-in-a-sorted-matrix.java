// class Solution {
//     public int countNegatives(int[][] grid) {
//         int count=0;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]<0)
//                     count++;
//             }
//         }
//         return count;
//     }
// }

//optimised:
class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int count=0;
        for(int i=0; i<n; i++){
            int l=0, r=grid[0].length-1;
            while(l<=r){
                int mid = l + (r-l)/2;
                if(grid[i][mid]<0){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
            count+=grid[0].length-l;
        }
        return count;
    }
}