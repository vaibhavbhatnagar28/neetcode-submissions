class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int temp: nums){
            map.put(temp,map.getOrDefault(temp, 0) + 1);
        }
        
        ArrayList<Integer> srr = new ArrayList<>();
        for(int key: map.keySet()){
            if(map.get(key)>nums.length/3){
                srr.add(key);
            }
        }
        return srr;
    }
}