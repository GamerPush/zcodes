class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k)
            return "0";
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:num.toCharArray()){
            while(!stack.isEmpty() && stack.peek()>ch && k>0){
                stack.pop();
                k--;
            }
            stack.add(ch);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        while(!stack.isEmpty() && stack.get(0)=='0' && stack.size()>1){
            stack.remove(0);
        }
        for(char c:stack){
            sb.append(c);
        }
        return sb.toString();
    }
}