class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n-1;

        int max_vol = -99;

        while(left<right){
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int vol = height*width;
            if(vol>max_vol)max_vol=vol;
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return max_vol;
    }
}