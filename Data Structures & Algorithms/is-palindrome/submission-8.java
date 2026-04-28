class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();

        if(chars.length ==1)return true;

        int start = 0;
        int end = chars.length -1;

        while(start<end){
            while(!Character.isLetterOrDigit(chars[start]) && start<end)start++;
            while(!Character.isLetterOrDigit(chars[end])  && start<end)end--;

            if(Character.toLowerCase(chars[start]) != Character.toLowerCase(chars[end]))return false;
            start++;end--;
        }
        return true;
    }
}
