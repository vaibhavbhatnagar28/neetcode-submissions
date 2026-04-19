class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max_count = Integer.MIN_VALUE;
        int res = 0;
        for(int temp: nums){
            int count = map.getOrDefault(temp, 0)+1;
            map.put(temp, count);
            if(count>max_count){
                max_count = count;
                res= temp;
            }
        }
        return res;     
    }
}