class Solution {
    public int maxProfit(int[] prices) {
        int stock=0;
        for(int i=0; i<prices.length-1; i++){
            if( prices[i] < prices[i+1] )
                stock += prices[i+1] - prices[i];
        }
        return stock;
    }
}