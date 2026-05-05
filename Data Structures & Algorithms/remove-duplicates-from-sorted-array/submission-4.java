class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;
        int n = nums.length;

        while(right<n){
            nums[left] = nums[right];

            while(right<n && nums[right]==nums[left]){
                right++;
            }
            left++;
        }
        return left;
    }
}