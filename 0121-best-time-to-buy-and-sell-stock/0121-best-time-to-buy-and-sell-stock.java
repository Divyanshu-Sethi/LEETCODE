class Solution {
    public int maxProfit(int[] prices) {
       int buy=prices[0];
       int maxprofit=0;

        for(int i=1;i<prices.length;++i){
            if(prices[i] > buy){
                maxprofit=Math.max(maxprofit,prices[i]-buy);
            }
            buy = Math.min(buy, prices[i]);
        }
        return maxprofit;
    }
}