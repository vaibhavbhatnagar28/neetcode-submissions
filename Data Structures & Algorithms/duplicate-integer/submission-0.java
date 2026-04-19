class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            
            map.put(nums[i], (map.get(nums[i])==null?0: map.get(nums[i]))+1);
            if(map.get(nums[i])!= null && map.get(nums[i])>1){
                return true;
            }
        }
        return false;
    }
}