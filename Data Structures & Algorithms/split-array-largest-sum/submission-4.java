class Solution {
    public int splitArray(int[] nums, int k) {
      int left = 0; int right = 0;
      for(int x: nums){
        if(x>left)left = x;
        right += x;
      }
      int res = 0;

      while(left<= right){
        int mid = left + (right - left)/2;

        if(canSplit(nums, k, mid)){
            res = mid;
            right = mid-1;
        }else{
            left = mid+1;
        }
      }
      return res;
    }

    private boolean canSplit(int[] nums, int k, int largest){
        int currSum = 0;
        int n =1;

        for(int temp: nums){
            currSum+= temp;

            if(currSum> largest){
                n++;
                if(n>k)return false;
                currSum = temp;
            }
        }
        return true;

    }
}