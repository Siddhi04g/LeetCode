class Solution {
    // private int count(List<Character> l){
    //     int c = 0;
    //     for(char val : l){
    //         if(val == 'a'|| val == 'e' || val == 'i' || val == 'o' || val == 'u')
    //             c ++;
    //     }
    //     return c;
    // }
    public int maxVowels(String s, int k) {
        //List<Character> list = new ArrayList<>();
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
            //list.remove(0);
            //System.out.print(i+" ");
            char val = s.charAt(j);
            if(val == 'a'|| val == 'e' || val == 'i' || val == 'o' || val == 'u')
                numvow ++;
            //list.add(val);
            max = Math.max(max , numvow);
            i++;
            j++;
        }
        return max;
    }
}