class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int temp: nums){
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        for(int vals: map.keySet()){
            if(map.get(vals)>nums.length/2){
                return vals;
            }
        }
        return 0;
    }
}