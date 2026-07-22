class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        double min_hrs = Integer.MAX_VALUE;

        for(int temp: piles){
            if(temp>right)right = temp;
        }
        int ans =right;
        


        //finding min
        int mid = 0;
        while(left<=right){
            mid = (left+right)/2;

            double temp_hrs = 0;
            for(int temp2: piles){
                temp_hrs += Math.ceil((double)temp2/mid);

            }
            if(temp_hrs<=h){
                ans= mid;
                right = mid-1;
            }
            else{
                left = mid +1;
            }
        }
        return(int)ans;      
    }
}