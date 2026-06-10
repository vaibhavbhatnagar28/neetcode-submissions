class Solution {
    public void reverseString(char[] s) {
        if(s == null || s.length==1)return;
        int start = 0;
        int e = s.length-1;
        while(start<e){
          char temp = s[e];
          s[e]= s[start];
          s[start] = temp;
          start++;e--;  
        }
        return;
    }
}