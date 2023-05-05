class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String>  list = new ArrayList<>();
        for(String str : strs){
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            list.add(s);
        }
        
        List<List<Integer>>  ans = new ArrayList<>();
        for(int i = 0 ; i < list.size() ; i++){
            List<Integer> l = new ArrayList<>();
            if(list.get(i).equals("@")) continue;
            l.add(i);
            for(int j = 0 ; j < list.size() ; j++){
                if(i!=j && list.get(i).equals(list.get(j))){
                    l.add(j);
                    list.set(j,"@");
                }
            }
            ans.add(l);
        }
        
        List<List<String>>  res = new ArrayList<>();
        for(List<Integer> i : ans){
            List<String> l = new ArrayList<>();
            for(int j : i){
                l.add(strs[j]);
            }
            res.add(l);
        }
        return res;
    }
}