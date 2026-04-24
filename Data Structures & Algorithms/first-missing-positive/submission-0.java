class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int temp: nums){
            map.put(temp, map.getOrDefault(temp, 0)+1);
        }
        for(int i = 1; i<=nums.length+1; i++){
            if(map.get(i) == null)return i;
        }
        return -1;
    }
}