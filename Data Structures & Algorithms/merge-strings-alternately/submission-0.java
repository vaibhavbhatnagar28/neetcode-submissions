class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left = 0; int right = 0;
        String res = "";
        while(left < word1.length() || right < word2.length()){
            if(left < word1.length()  && Character.isLetter(word1.charAt(left))){
                res += word1.charAt(left);
                left++;
            }
            if(right < word2.length() && Character.isLetter(word2.charAt(right))){
                res += word2.charAt(right);
                right++;
            }
        }
        return res;
    }
}