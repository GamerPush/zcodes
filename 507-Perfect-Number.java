class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=1;
        if(num<2)
           return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                sum+=i;
        }
        if(sum==num)
           return true;
        return false;
    }
}