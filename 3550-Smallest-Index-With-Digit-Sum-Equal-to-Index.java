class Solution {
    public int smallestIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(digitSum(nums[i])==i)
                return i;
        }
        return -1;
    }
    static int digitSum(int x){
        if(x<10)
            return x;
        int sum=0;
        while(x>0){
            int dig=x%10;
            sum+=dig;
            x/=10;
        }
        return sum;
    }
}