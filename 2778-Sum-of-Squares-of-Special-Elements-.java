class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length,sum=0,i=0;
        for(i=0;i<n;i++){
            if(n%(i+1)==0)
                sum+=nums[i]*nums[i];
        }
        return sum;
    }
}