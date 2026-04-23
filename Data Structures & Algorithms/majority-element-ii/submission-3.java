class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1 =-1, num2 = -1, cnt1= 0, cnt2=0;

        for(int temp: nums){
            if(temp == num1){
                cnt1++;
            }else if(temp==num2){
                cnt2++;
            }else if(cnt1==0){
                cnt1=1;
                num1=temp;
            }else if(cnt2==0){
                cnt2=1;
                num2=temp;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=cnt2=0;
        for(int tem: nums){
            if(tem == num1)cnt1++;
            if(tem == num2)cnt2++;
        }


        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(cnt1>nums.length/3)arr.add(num1);
        if(cnt2>nums.length/3)arr.add(num2);
        return arr;

    }
}