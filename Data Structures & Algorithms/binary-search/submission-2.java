class Solution {
    public int search(int[] nums, int target) {
        // if(nums.length ==1)return 0;
        int left = 0; int right = nums.length -1;

        while(left<=right){
            if(nums[left]<target){
                left++;
            }
            else if(nums[left]>target){
                right--;
            }
            else if(nums[left]==target){
                return left;
            }
            else{
                return right;
            }
        }
        return -1;
    }
}
