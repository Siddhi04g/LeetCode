class Solution {

    public String predictPartyVictory(String senate) {
        int R = 0, D = 0;
        StringBuilder str = new StringBuilder(senate);
        for(char c : senate.toCharArray()){
            if(c == 'R') R++;
            if(c == 'D') D++;
        }
        System.out.print(str + " " + D + " " + R+ " ");
        System.out.println();
        // if(D == 0) return "Radiant";
        // if(R == 0) return "Dire";
        int rdel = 0, ddel = 0;
        while(D>0 && R>0){
            for(int i = 0 ; i < str.length() ; i++){
                if(str.charAt(i) == 'D'){
                    rdel++;
                }
                if(str.charAt(i) == 'R'){
                    ddel++;
                }
                if(rdel > 0 && R>0){
                    StringBuilder ctr = new StringBuilder();
                    if(i<str.length()-1){
                    ctr.append(str.substring(i+1));
                    ctr.append(str.substring(0,i));
                    }
                    else if ( i == str.length()-1)
                    ctr.append(str.substring(0,i));
                    
                    int idx = ctr.indexOf("R");
                    int residx = (idx + (i+1)) % str.length();
                    str = str.deleteCharAt(residx);
                    rdel --;
                    R --;
                }
                if(ddel > 0 && D>0){
                    StringBuilder ctr = new StringBuilder();
                    if(i<str.length()-1){
                    ctr.append(str.substring(i+1));
                    ctr.append(str.substring(0,i));
                    }
                    else if ( i == str.length()-1)
                    ctr.append(str.substring(0,i));
                    
                    int idx = ctr.indexOf("D");
                    int residx = (idx + (i+1)) % str.length();
                    str = str.deleteCharAt(residx);
                    ddel --;
                    D --;
                }
                //System.out.print(str +" "+R+" "+D+ " " + rdel +" " +ddel+" "+i+" ");
            }
        
        }
        if(D == 0) return "Radiant";
        if(R == 0) return "Dire";
        return "";
    }
}