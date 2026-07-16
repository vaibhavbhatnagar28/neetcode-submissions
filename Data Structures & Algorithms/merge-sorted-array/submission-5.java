class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int h1 = m-1; int h2 = n-1;
        int last_idx = m+n-1;

        while(h1>=0 && h2>=0){
            if(nums1[h1]> nums2[h2]){
                nums1[last_idx] = nums1[h1];
                h1--;
                last_idx--;
            }
            else{
                nums1[last_idx] = nums2[h2];
                h2--;
                last_idx--;
            }

        }
        while(h2>=0){
            nums1[last_idx]=nums2[h2];
            h2--;last_idx--;
        }
    }
}