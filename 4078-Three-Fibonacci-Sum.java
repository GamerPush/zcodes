class Solution {
    public boolean threeFibonacciSum(int n) {
        long a=0,b=1;
        while(true){
            long c=a+b;
            long sum=a+b+c;
            if(sum==n)
                return true;
            if(sum>n)
                return false;
            a=b;
            b=c;
        }
    }
}