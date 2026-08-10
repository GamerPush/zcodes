class Solution {
    public int reverseBits(int n) {
        int temp[]=new int [32];
        int tempRev[]=new int [32];
        int sum=0,a=0,b=0;
        while(n>0){
            int dig=n%2;
            temp[a++]=dig;
            n/=2;
        }
        for(int i=31;i>=0;i--){
            tempRev[b++]=temp[i];
        }
        for(int i=0;i<32;i++){
            if(tempRev[i]==1)
                sum+=Math.pow(2,i);
        }
        return sum;
    }
}