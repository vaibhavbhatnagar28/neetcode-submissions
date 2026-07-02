class Solution {
    public void sortColors(int[] nums) {
        int low = 0; int med = 0;
        int high = nums.length-1;

        while(med<= high){
            if(nums[med]==0){
                int temp = nums[med];
                nums[med] = nums[low];
                nums[low] = temp;
                med++;low++;
            }
            else if(nums[med] ==1){
                med++;
            }
            else{
                int temp = nums[high];
                nums[high] = nums[med];
                nums[med] = temp;
                high--;
            }
        }
    }
}