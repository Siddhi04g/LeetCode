// class Solution {
//     public boolean isValid(String s) {
//         if(s.length()==1) return false;
//         Stack<Character> stack = new Stack<>();
//         for(int i = 0;i < s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='(' || ch=='{' || ch=='['){
//                 stack.push(ch);
//             }
//             if(ch==')'){
//                 if(stack.isEmpty()){
//                     return false;
//                 }
//                 else if(stack.peek()=='('){
//                 stack.pop();
//                 }
//                 else {
//                     return false;
//                 }
//             }
//             if(ch==']' ){
//                 if(stack.isEmpty()){
//                     return false;
//                 }
//                 else if(stack.peek()=='['){
//                 stack.pop();
//                 }
//                 else{
//                     return false;
//                 }
//             }
//             if(ch=='}'){
//                 if(stack.isEmpty()){
//                     return false;
//                 }
//                 else if(stack.peek()=='{'){
//                 stack.pop();
//                 }
//                 else{
//                     return false;
//                 }
//             }
//         }
//         if(stack.isEmpty()){
//             return true;
//         }
//         return false;
//     }
// }

//optimised:
class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int pointer = 0;
        for (char c : s.toCharArray()) {
            if (isOpen(c)) {
                stack[pointer++] = turn(c);
            } else if (pointer != 0 && stack[pointer - 1] == c) {
                pointer--;
            } else {
                return false;
            }
        }
        return pointer == 0;
    }

    public boolean isOpen(char c) {
        return switch (c) {
            case '(', '[', '{' -> true;
            default -> false;
        };
    }

    public char turn(char c) {
        return switch (c) {
            case '(' -> ')';
            case '{' -> '}';
            case '[' -> ']';
            default -> ' ';
        };
    }
}
