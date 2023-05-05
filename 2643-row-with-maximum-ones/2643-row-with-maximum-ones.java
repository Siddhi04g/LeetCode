class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int idx = 0;
        int count = 0;
        int arr[] = new int[2];
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < mat.length ; i++){
            count = 0;
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j] == 1)
                    count++;
            }
            if(max < count){
                idx = i;
                max = count;
            }
        }
        arr[0] = idx;
        arr[1] = max;
        return arr;
    }
}