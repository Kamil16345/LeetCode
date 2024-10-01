class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int profit = 0;
        int smallest = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<smallest){
                smallest=prices[i];
            }else if(prices[i]-smallest>profit){
                profit=prices[i]-smallest;
            }
        }
        return profit;
    }
}