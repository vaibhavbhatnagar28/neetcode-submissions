class Solution {
    public int trap(int[] height) {
        int sum = 0;
        for(int i = 0; i<height.length; i++){
            int leftMax = height[0];
            for(int j = 0; j<=i; j++){
                if(height[j]>leftMax)leftMax = height[j];
            }

            int rightMax = height[height.length-1];
            for(int k = height.length-1; k>=i; k--){
                if(height[k]>rightMax)rightMax = height[k];
            }
            int temp = Math.min(rightMax, leftMax);
            sum += (temp-height[i]);
        }
        return sum;
    }
}
