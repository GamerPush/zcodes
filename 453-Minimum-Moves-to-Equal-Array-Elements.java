class Solution {
    public int minMoves(int[] nums) {
        int ans=0,min=nums[0];
        for(int x:nums){
            if(x<min)
                min=x;
        }
        for(int i=0;i<nums.length;i++){
            ans+=nums[i]-min;
        }
        return ans;
    }
}