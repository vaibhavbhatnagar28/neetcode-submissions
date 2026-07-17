class Solution {
    public void reverseString(char[] s) {
        int f=0;int l=s.length-1;

        while(f<l){
          char temp = s[l];
          s[l]=s[f];
          s[f]=temp;
          l--;f++;
        }
    }
}