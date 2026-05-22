class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int res = 1;
        while(true){
            double temp = 0;
            for(int i=0; i<piles.length; i++){
                temp += Math.ceil((double)piles[i]/res);
            }
           
            if(temp<=h){
                break;
            }
            res++;
        }
        return res;
    }
}
