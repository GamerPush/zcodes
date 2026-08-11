class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int minSum=nums[0];
        int maxSum=nums[0];
        int currentSum=nums[0];
        
        for(int i=1;i<nums.length;i++){
            currentSum=Math.min(nums[i],currentSum+nums[i]);
            minSum=Math.min(currentSum,minSum);
        }

        currentSum=nums[0];
        minSum=Math.abs(minSum); 
         
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(currentSum,maxSum);
        }

        if(minSum>maxSum)
            return minSum;
        return maxSum;
    }
}