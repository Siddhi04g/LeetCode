class Solution {
    public int maxVowels(String s, int k) {
        int numvow = 0;
        for(int i = 0 ; i < k ; i++){
            char val = s.charAt(i);
            if(val == 'a'|| val == 'e' || val == 'i' || val == 'o' || val == 'u')
            numvow++;
        }

        int max = numvow;
        int i = 0;
        int j = k;
        while(j < s.length()){
            char rem = s.charAt(i);
            if(rem == 'a'|| rem == 'e' || rem == 'i' || rem == 'o' || rem == 'u')
                numvow --;
            char val = s.charAt(j);
            if(val == 'a'|| val == 'e' || val == 'i' || val == 'o' || val == 'u')
                numvow ++;
            max = Math.max(max , numvow);
            i++;
            j++;
        }
        return max;
    }
}