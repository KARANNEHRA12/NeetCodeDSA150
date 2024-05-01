package com.learn.dsa.slidingwindow;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
            int left =0;
            int right =0;
            int maxProfit = 0;
            while( right < prices.length){
                if( prices[left]< prices[right])
                {
                    maxProfit = Math.max(maxProfit, (prices[right] - prices[left]));
//                    right++;

                }
                else{
                   left =right;

                }
                right++;
            }
            return  maxProfit;
    }

}
