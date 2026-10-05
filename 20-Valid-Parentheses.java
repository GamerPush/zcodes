class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[')
                stack.push(ch);
            if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty())
                    return false;
                char top=stack.peek();
                if(ch==')' && top!='(' || ch=='}' && top!='{'|| ch==']' && top!='[')
                    return false;
                stack.pop();           
            }
        }
        return stack.isEmpty();
    }
}