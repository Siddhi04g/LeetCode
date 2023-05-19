class Solution {
    public boolean lemonadeChange(int[] bills) {
        int bill5 = 0, bill10 = 0;
        for (int bill : bills) {
            if (bill == 5) {
                bill5++;
            } else if (bill == 10) {
                bill5--;
                bill10++;
            } else if (bill10 > 0) {
                bill10--;
                bill5--;
            } else {
                bill5 -= 3;
            }
            if (bill5 < 0) {
                return false;
            }
        }
        return true;
    }
}
class Solution1 {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean ans = true;
        int cng5 = 0 , cng10 = 0;
        for(int val : bills){
            int change = val - 5;
            int ten = change/10;
            change = change%10;
            int five = change/5;
            
            if(ten != 0){
                if(map.containsKey(10)){
                    if(map.get(10) >= ten){
                       map.put(10,map.get(10)-ten);
                       ten = 0;
                    }
                    else{
                        ten -= map.get(10);
                        map.put(10,0);
                    }
                }
                cng10 += ten;  // cnt = change not given;
            }
            
            if(five != 0 ){
                if(map.containsKey(5)){
                    if(map.get(5) >= five){
                       map.put(5,map.get(5)-five);
                       five = 0;
                    }
                    else{
                        five -= map.get(5);
                        map.put(5,0);
                    }
                }
                cng5 += five;  // cnt = change not given;
                    
            }
            
            if(map.containsKey(5)){
                if(map.get(5) >= cng10 * 2){
                    map.put(5,map.get(5)-cng10 * 2);
                    cng10 = 0;
                }
                else{
                    cng10 -= map.get(5) * 2;
                    map.put(5,0);
                }
            }
            if(cng5 != 0 || cng10 != 0) 
            return false;

            map.put(val,map.getOrDefault(val,0)+1);

        }
        return true;
    }
}