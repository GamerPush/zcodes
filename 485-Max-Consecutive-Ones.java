class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a=0,count=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                count++;
            }
            else{
                if(count>max)
                    max=count;
                count=0; 
            }
        }
        if(count>max)
            max=count;
        return max;
    }
}