class Solution {
    public int maxProfit(int[] prices) {
        int l = 0; int r = 1;
        int maxDiff = 0;

        while(r<prices.length){
            if(prices[l]<prices[r]){
                int temp = prices[r] - prices[l];
                if(temp>maxDiff)maxDiff = temp;
            } else{
                l = r;
            }
            r++;
        }
        return maxDiff;
    }
}
