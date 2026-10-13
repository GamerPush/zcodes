class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
                sum+=nums[nums.length-j-1]*nums[nums.length-j-1];           
            else{
                sum-=nums[j]*nums[j];
                j++;
            }
        }
        return sum;
    }
}