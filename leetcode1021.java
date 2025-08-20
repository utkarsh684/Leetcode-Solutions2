class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int i=0;
        int index=0;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
                index++;
            }
            else if(!stack.isEmpty() && c==stack.peek()){
                stack.pop();
                index++;
            }
            if(stack.isEmpty()){
                sb.append(s.substring(i+1,index-1));
                i=index;
            }
        }
        return sb.toString();
    }
}
