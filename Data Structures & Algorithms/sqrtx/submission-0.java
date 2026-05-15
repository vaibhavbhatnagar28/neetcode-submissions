class Solution {
    public int mySqrt(int x) {
        int left = 0; int right = x;int res = 0;
        while(left<=right){
            int mid = left + (right-left) /2;
            long prod =(long) mid * mid;

            if (prod == x){
                return mid;
            }
            else if(prod>x){
                right = mid-1;
            }
            else{
                left = mid +1;
                res= mid;
                
            }
        }
        return res;
    }
}