class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int i=0,pair=0,notPair=0;
        while(i<nums.length){
            int count=1;
            while(i<nums.length-1 && nums[i]==nums[i+1]){
                count++;i++;
            }
            pair+=count/2;//2 occurs 3 times so there will be 1 pair
            if(count%2!=0)
                notPair++;            
            i++;
        }
        int leftOver[]=new int[2];
        if(nums.length==1){
            leftOver[0]=0;
            leftOver[1]=1;
            return leftOver;
        }
        leftOver[0]=pair;
        leftOver[1]=notPair;
        return leftOver;
    }
}