class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1; int right = Arrays.stream(piles).max().getAsInt();
        int ans = 0;int mid =0;

        while(left<=right){
            mid = (left + right )/2;

            int temp_sum = 0;
            for(int num : piles){
                temp_sum += Math.ceil((double)num/mid);
            }       
            if(temp_sum<=h){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return (int)ans;
    }
}