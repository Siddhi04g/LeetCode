class Solution {
    public int consecutiveNumbersSum(int sum) {
        int count = 0;
        for(int n = 1; (sum - (n*(n-1)/2)) > 0 ; n++){
            if((sum - n*(n-1)/2) % n == 0) count ++;
        }
        return count;
    }
}

/*

1 + 2 + 3 + 4 + 5 = 15
a + (a+1) + (a+2) + (a+3) + (a+4) = 15
(a+a+a+a+a) + (1+2+3+4+5) = 15
a*n + n(n-1) / 2 = sum

now,
a = (sum - n*(n-1)/2)/n

for a to be greater than zero (sum - n*(n-1)/2) > 0
and for a to be integer as we need only sum of integers (sum - n*(n-1)/2)%n == 0

*/