class Solution {
    public int maxProfit(int[] prices) {
        
        int minProfit = prices[0];
        int maxProfit = 0;

        for (int i = 0 ; i < prices.length ; i++){
            if (prices[i] < minProfit){
                minProfit = prices[i];
            }
            else{
                int profit = prices[i] - minProfit;
                
                if (maxProfit < profit){
                    maxProfit = profit;
                }
            }

        }       return maxProfit;
    }
}