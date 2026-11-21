class Solution {
    public int maxProfit(int[] prices) {
        int lowest=Integer.MAX_VALUE;
        int gain =0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<lowest){
                lowest=prices[i];
            }
            else{
                int profit = prices[i]-lowest;

                if(profit>gain)
                    gain=profit;
            }
        }
        return gain;
    }
}
