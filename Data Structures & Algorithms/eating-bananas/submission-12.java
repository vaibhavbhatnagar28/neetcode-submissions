class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; int high = Arrays.stream(piles).max().getAsInt();
        int res = high;

        while(low<=high){
            int mid = (low+high)/2;
            long sum = 0;

            for(int x: piles){
                sum += Math.ceil((double)x/mid);
            }
            if(sum>h){
                low = mid+1;
            }
            else{
                if(mid<res){
                    res = mid;
                }
                high = mid-1;
            }
        }
        return res;
    }
}
