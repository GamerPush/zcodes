class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        return Bsearch(nums,l,h,target);
    }
    static int Bsearch(int nums[],int l,int h,int target){
        if(l>h)
            return -1;
        int mid=l+(h-l)/2;
        if(target==nums[mid])
            return mid;
        if(target>nums[mid])
            return Bsearch(nums,mid+1,h,target);
        else
            return Bsearch(nums,l,mid-1,target);
    }
}