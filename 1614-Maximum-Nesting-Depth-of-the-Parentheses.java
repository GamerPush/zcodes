class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }
            if(ch==')'){
                max=Math.max(count,max);
                count--;
            }
        }
        return max;
    }
}