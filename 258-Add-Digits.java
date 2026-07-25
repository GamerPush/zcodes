class Solution {
    public int addDigits(int num) {
        while(true){
            int count=0,sum=0;
            while(num>0){
                int dig=num%10;
                sum+=dig;
                num/=10;
                count++;
            }
            if(count>1)
                num=sum;
            else
                return sum;
        }
    }
}