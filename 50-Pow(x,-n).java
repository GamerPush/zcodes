class Solution {
    public double myPow(double x, int n) {
        double multiply=1.00;
        if(x==1)
            return multiply;
        if(x==-1){
            if(n%2==0)
                return multiply;
            else
                return -1.00;
        }
        if(n<=Integer.MIN_VALUE || n>=Integer.MAX_VALUE)
            return 0.00;
        if(n<=0){
            for(int i=0;i<Math.abs(n);i++){
                multiply*=1/x;
            }
        }
        else{
            for(int i=0;i<n;i++){
                multiply*=x;
            }
        }
        return multiply;
    }
}