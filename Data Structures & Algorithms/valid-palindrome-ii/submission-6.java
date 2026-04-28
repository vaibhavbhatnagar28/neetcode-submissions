class Solution {
    public boolean validPalindrome(String s) {
        int start = 0; 
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                // Option 1: Skip the 'start' character
                // Substring from start + 1 to end (inclusive), so end index is end + 1
                boolean skipStart = isSimplePalindrome(s.substring(start + 1, end + 1));
                
                // Option 2: Skip the 'end' character
                // Substring from start to end - 1 (inclusive), so end index is end
                boolean skipEnd = isSimplePalindrome(s.substring(start, end));
                
                return skipStart || skipEnd;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isSimplePalindrome(String s) {
        int start = 0; 
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}