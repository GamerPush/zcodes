class Solution {
    public int missingMultiple(int[] nums, int k) {
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                count++;
                list.add(nums[i]);
            }
        }
        for(int i=1;i<=count+1;i++){
            if(!(list.contains(i*k)))
                return i*k;
        }
        return nums[0]+k;
    }
}