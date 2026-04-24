class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);

        for(int temp: nums){
            sum += temp;
            int diff = sum - k;

            res += map.getOrDefault(diff, 0);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return res;
    }
}