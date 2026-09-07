class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int rOne=0,lZero=0,maxSum=-1;
        for(int num:nums){
            if(num==1)
                rOne++;
        }
        for(int i=0;i<=nums.length;i++){
            int sum=lZero+rOne;
            if(maxSum<sum){
                maxSum=sum;
                ans.clear();
                ans.add(i);
            }

            else if(maxSum==sum)
                ans.add(i);

            if(i<nums.length){
                if(nums[i]==0)
                    lZero++;
                else
                    rOne--;
            }
        }
        return ans;
    }
}