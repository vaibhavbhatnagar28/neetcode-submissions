class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] temp = new int[n];

        int i =0;
        for(int x: nums1){
            temp[i]=x;
            i++;
        }
        for(int y: nums2){
            temp[i]=y;
            i++;
        }
        Arrays.sort(temp);
        double median =0;
        if(n%2==0){
            median = (temp[n/2 - 1] + temp[n/2])/2.0;
        }
        else{
            median = (temp[(n)/2]);
        }
        
        return median;
    }
}
