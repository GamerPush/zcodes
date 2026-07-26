class Solution {
    public int countDigits(int num) {
        int count=0;
        int temp=num;
        while(num>0){
            int dig=num%10;
            if(temp%dig==0)
                count++;
            num/=10;
        }
    return count;
    }
}