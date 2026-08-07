class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length,a=0,b=0;
        int tempNeg[]=new int[n/2];
        int tempPos[]=new int[n/2];
        for(int i=0;i<n;i++){
            if(nums[i]<0)
                tempNeg[a++]=nums[i];
            else
                tempPos[b++]=nums[i];
        }
        a=0;b=0;
        for(int i=0;i<n-1;i+=2){
            nums[i]=tempPos[a++];
            nums[i+1]=tempNeg[b++];
        }
        return nums;
    }
}