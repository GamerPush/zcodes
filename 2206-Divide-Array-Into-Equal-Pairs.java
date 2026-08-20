class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int pairs=nums.length/2;
        int i=0;
        while(i<nums.length-1){
            int count=1;
            while(i<nums.length-1 && nums[i]==nums[i+1]){
                i++;count++;
            }
            if(count%2==1)
                return false;
            i++;
        }
        return true;
    }
}