class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
        for(int x: nums){
            if(map.containsKey(x)){
                return true;
            }
            else{
                map.put(x, map.getOrDefault(x, 0)+1);
            }
        }
        return false;
        
    }
}