class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0)return 0;
        HashSet<Integer> sortedset = new HashSet<>();
        for (int num : nums) {
            sortedset.add(num);
        }

        int max_cons = 1;

        for(int temp: sortedset){
            int max_cons2=1;
            if(!sortedset.contains(temp-1)){
                while(sortedset.contains(temp+max_cons2)){
                    max_cons2++;
                }
            }
            if(max_cons2>max_cons)max_cons=max_cons2;
        }
        
        return max_cons;
    }
}
