class Solution {
    public int removeDuplicates(int[] nums) {
        int a=0;
        int temp[]=new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1])
                temp[a++]=nums[i];
        }
        temp[a++]=nums[nums.length-1];
        for(int i=0;i<a;i++)
            nums[i]=temp[i];
        return a;
    }
}