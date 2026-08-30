
class Solution {
    public int minimumDeletions(int[] nums) {
        int maxInd=0,minInd=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[maxInd])
                maxInd=i;
            if(nums[i]<nums[minInd])
                minInd=i;
        }
        int a=Math.min(minInd,maxInd);
        int b=Math.max(minInd,maxInd);
        int front=b+1;
        int back=n-a;
        int both=(a+1)+(n-b);
        return Math.min(front,Math.min(back,both));
    }
}