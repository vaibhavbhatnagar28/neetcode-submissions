class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet <Integer> set = new TreeSet <>();
        for(int temp: nums){
            set.add(temp);
        }
        int i = 0;
        for(int temp_set : set){
            nums[i] = temp_set;
            i++;
        }
        return set.size();
    }
}