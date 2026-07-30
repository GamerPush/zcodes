class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,count=0;
        int duplicate=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(duplicate!=nums[i]){
                duplicate=nums[i];
                count++;
            }
            if(count==2)
                return nums[i];
        }
        return nums[n-1];
    }
}