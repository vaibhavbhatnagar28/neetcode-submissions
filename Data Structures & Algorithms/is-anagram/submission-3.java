class Solution {
    public boolean isAnagram(String s, String t) {
        char [] charArray_s = s.toCharArray();
        char [] charArray_t = t.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char s1 : charArray_s){
            map.put(s1, map.getOrDefault(s1, 0)+1);
        }
        for(char t1 : charArray_t){
            map.put(t1, map.getOrDefault(t1, 0)-1);
        }
        for(char temp : map.keySet()){
            if(map.get(temp)!=0)return false;
        }
        return true;
    }
}
