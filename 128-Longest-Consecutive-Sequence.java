class Solution {
    public int longestConsecutive(int[] nums) {
        int count1=0,i=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            if(set.contains(num-1))
                continue;
            int count=1;
            int current=num;
            while(set.contains(current+1)){
                count++;current++;
            }
            count1=Math.max(count,count1);
        }
        return count1;
    }
}