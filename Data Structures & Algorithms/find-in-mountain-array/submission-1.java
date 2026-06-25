/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left =1; int right = mountainArr.length()-2;
        int peak = 0 ;
        //Finding peak
        while(left<= right){
            int mid = (left  + right)/2;

            if(mountainArr.get(mid-1)<mountainArr.get(mid) && mountainArr.get(mid) <mountainArr.get(mid+1)){
                left = mid+1;
            }
            else if(mountainArr.get(mid-1)>mountainArr.get(mid) && mountainArr.get(mid) >mountainArr.get(mid+1)){
                right = mid-1;
            }
            else{
                peak = mid;
                break;
            }
        }

        //trying to find in the left half of peak
        int l1 = 0; int r1 = peak;
        while(l1<=r1){
            int mid2 = (l1 + r1)/2;

            if(mountainArr.get(mid2)<target){
                l1 = mid2+1;
            }
            else if(mountainArr.get(mid2)>target){
                r1 = mid2-1;
            }
            else{
                return mid2;
            }
        }

        //trying to find in the right half of peak
        int l2 = peak; int r2 = mountainArr.length()-1;
        while(l2<=r2){
            int mid3 = (l2 + r2)/2;

            if(mountainArr.get(mid3)<target){
                r2 = mid3-1;
            }
            else if(mountainArr.get(mid3)>target){
                l2 = mid3+1;
            }
            else{
                return mid3;
            }
        }
        return -1;
    }
}