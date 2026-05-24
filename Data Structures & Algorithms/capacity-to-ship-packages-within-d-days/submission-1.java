class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt(); 
        int right = 0;
        for(int x: weights){
            right += x;
        }
        int res = 0;

        while(left<= right){
            int mid = (left+right)/2;

            int temp = 0;
            int temp_days = 1;
            for(int i=0; i< weights.length; i++){
                if(temp + weights[i]>mid){
                    temp_days++;
                    temp = weights[i];
                }
                else{
                    temp += weights[i];
                }
            }

            if(temp_days <=days){
                res = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }

        }
        return res;
    }
}