class Solution {
    public int splitArray(int[] nums, int k) {
        int l =0; int r = 0;
        for(int x: nums){
            if(x>l)l=x;
            r+=x;
        }
        int res = r;

        while(l<=r){
            int mid = l + (r-l)/2;
            if(canSplit(nums, k, mid)){
                res = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return res;
    }

    private boolean canSplit(int nums[], int k, int largest){
        int currSum = 0; int subArr = 1;

        for(int temp: nums){
            currSum+= temp;
            if(currSum>largest){
                subArr++;
                currSum = temp;
                if(subArr>k)return false;
            }
        }
        return true;
    }

}