class Solution {
    public int myAtoi(String s) {
        int i=0,sign=1;
        long sum=0;
        while(i<s.length() && s.charAt(i)==' ')
            i++;
        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-')
                sign=-1;
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(sum>Integer.MAX_VALUE/10 || (sum==Integer.MAX_VALUE/10 && digit>(sign==1 ? 7:8)))
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            sum=sum*10+digit;
            i++;
        }
        return (int)(sum*sign);
    }
}