class Solution {
    public int minOperations(String s) {
        int min = 0;
        boolean change = s.charAt(0) == '0';
        for (char c : s.toCharArray()) {
            if (change != (c == '0')) {
                min++;
            }
            change = !change;
        }
        return Math.min(min, s.length() - min);
    }
}