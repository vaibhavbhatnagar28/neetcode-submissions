class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String temp: strs){
            char[] Array = temp.toCharArray();
            Arrays.sort(Array);
            String sorted = new String(Array);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
                map.get(sorted).add(temp);
        }
        return new ArrayList<>(map.values());
        
    }
}
