class Solution {
    public int maxProfit(int[] prices) {
        int maxDiff=0,min=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>min)
                maxDiff=Math.max(maxDiff,prices[i]-min);
            min=Math.min(prices[i],min);
        }
        return maxDiff;
    }
}