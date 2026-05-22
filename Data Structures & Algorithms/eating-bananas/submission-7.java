class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 0; int r = Arrays.stream(piles).max().getAsInt();
        int res = 1;
        while(l<=r){
            int mid = (l+r) /2;
            int temp = 0;

            for(int x: piles){
                temp += Math.ceil((double)x/mid);
            }

            if(temp<=h){
                res = mid;
                r = mid-1;
            }else{
                l =mid+1;
            }
        }
        return res;
    }
}
