class Solution {
    public int firstStableIndex(int[] nums, int k) {
        List<Integer> prefix=new ArrayList<>();
        List<Integer> suffix=new ArrayList<>();
        for(int num:nums){
            suffix.add(num);
        }
        for(int i=0;i<nums.length;i++){
            prefix.add(nums[i]);
            int max=Collections.max(prefix);
            int min=Collections.min(suffix);
            if(max-min<=k)
                return i;
            suffix.removeFirst();
        }
        return -1;
    }
}