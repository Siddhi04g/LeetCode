class Solution{ 
    public int diagonalSum(int[][] mat) {
        int n = mat.length, res = 0;
        for (int i = 0; i < n; i++) {
            res += mat[i][i];
            if (i!= n-1-i)
            res += mat[i][n - 1 - i];
        }
        return res;
    }
}
class Solution1 {
    public int diagonalSum(int[][] mat) {
     
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j || i+j==mat.length-1)
                    sum=sum+mat[i][j];
            }
        }   
                return sum; 
    }
}