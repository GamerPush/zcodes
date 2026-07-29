class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=nums[0],min=nums[0];
        if(nums.length<=2)
            return -1;
        for(int num:nums){
            if(num>max)
                max=num;
            if(num<min)
                min=num;
        }
        for(int num:nums){
            if(num!=max&&num!=min)
                return num;
        }
        return -1;
    }
}