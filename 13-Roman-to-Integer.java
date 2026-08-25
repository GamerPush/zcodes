class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int curr=value(s.charAt(i));
            int next=value(s.charAt(i+1));
            if(curr>=next)
                sum+=curr;
            else
                sum-=curr;
        }
        sum+=value(s.charAt(s.length()-1));
        return sum;
    }
    static int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}