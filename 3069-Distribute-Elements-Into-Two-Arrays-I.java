class Solution {
    public int[] resultArray(int[] nums) {
        int arr1[]=new int [nums.length];
        int arr2[]=new int [nums.length];
        int m=1,n=1,o=0;
        arr1[0]=nums[0];
        arr2[0]=nums[1];

        for(int i=2;i<nums.length;i++){
            if(arr1[m-1]>arr2[n-1])
                arr1[m++]=nums[i];
            else
                arr2[n++]=nums[i];
        }

        int result[]=new int[nums.length];

        for(int i=0;i<m;i++)
            result[o++]=arr1[i];
        
        for(int i=0;i<n;i++)
            result[o++]=arr2[i];
        
        return result;
    }
}