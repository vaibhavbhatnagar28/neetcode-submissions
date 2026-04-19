class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String temp: strs){
            char[] tempArr = temp.toCharArray();
            Arrays.sort(tempArr);
            String key = new String(tempArr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(temp);
        }
        return new ArrayList<>(map.values());
    }
}
