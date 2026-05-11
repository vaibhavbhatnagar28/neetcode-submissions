class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(nums.length ==1 || nums.length == 0)return;
        rev_arr(0, nums.length-1, nums);
        rev_arr(0, k-1, nums);
        rev_arr(k, nums.length-1, nums);
    }
    public void rev_arr(int left, int right, int[] nums){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        
    }
}