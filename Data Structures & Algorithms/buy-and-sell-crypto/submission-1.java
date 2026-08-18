class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max_diff = 0;

        for(int x: prices){
            if(x< min)min=x;
            int diff = x-min;
            if(diff >max_diff) max_diff=diff;
        }
        return max_diff;
    }
}
