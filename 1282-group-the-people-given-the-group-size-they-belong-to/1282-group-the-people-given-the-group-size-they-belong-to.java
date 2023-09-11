class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int max = Integer.MIN_VALUE;
        int maxGroupSize = 0;
        for (int size : groupSizes) {
            maxGroupSize = Math.max(maxGroupSize, size);
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer>[] groups = new ArrayList[maxGroupSize + 1];

        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if (groups[size] == null) {
                groups[size] = new ArrayList<>();
            }
            groups[size].add(i);

            if (groups[size].size() == size) {
                result.add(groups[size]);
                groups[size] = null;
            }
        }

        return result;
    }
}
        
//         List<List<Integer>> list = new ArrayList<>();
//         for(int i = 0 ; i < list.size() ; i++){
//             list.add(new ArrayList<>());
//         }
        
//         for(int i = 0 ; i < groupSizes.length; i++){
//             list.get(groupSizes[i]).add(i);
//             if(list.get(groupSizes[i]).size() == groupSizes[i]){
//                 list.add(list.get(groupSizes[i]));
//                 //list.get(groupSizes[i])
//             }
//         }
        
//         for(int i = 1 ; i < max ; i++){
//             List<Integer> l = new ArrayList<>();
//             for(int j = 0 ; j < groupSizes.length ; j++){
//                 if(groupSizes[j] == i  && l.size() < i)
//                     l.add(j);
                
//                 else if(l.size() >= i){
                    
//                     List<Integer> m = new ArrayList<>(l.clone());
//                     list.add(m);
//                     l = new ArrayList<>()
//                 }
                
//             }
        
//         return list;
//     }
// }