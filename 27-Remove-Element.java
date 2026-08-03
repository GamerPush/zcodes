class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int temp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val)
                continue;
            temp[k++]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }
        return k; 
    }
}