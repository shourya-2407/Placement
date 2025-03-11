//Logic: For a  given day find the min value and the max profit.

Java:
class Solution {
    public int maxProfit(int[] prices) {
       int min = prices[0];
       int profit = 0;

       for(int i = 0; i < prices.length; i++){
           int cost = prices[i] - min;
           profit = Math.max(profit, cost);
           min = Math.min(min, prices[i]);
       } 

       return profit;
    }
}
