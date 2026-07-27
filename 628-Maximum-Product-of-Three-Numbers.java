class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int productPositive=nums[n-1]*nums[n-2]*nums[n-3];
        int productNegative=nums[0]*nums[1]*nums[n-1];
        if(productPositive > productNegative)
            return productPositive;
        return productNegative;
    }
}