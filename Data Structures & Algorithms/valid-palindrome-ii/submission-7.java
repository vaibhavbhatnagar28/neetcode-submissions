class Solution {
    public boolean validPalindrome(String s) {
        int start = 0; int end = s.length()-1;

        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return isSimplePalindrome(s.substring(start+1, end+1)) || isSimplePalindrome(s.substring(start, end));
            }
            start++;end--;
        }
        return true;
    }

    public boolean isSimplePalindrome(String s) {
        int start = 0; int end = s.length()-1;

        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;end--;
        }
        return true;
    }

}