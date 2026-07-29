class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(String temp: operations){
            if(temp.equals("C")){
                arr.remove(arr.size()-1);
            }
            else if(temp.equals("D")){
                int double2 = arr.get(arr.size()-1) * 2;
                arr.add(double2);
            }
            else if(temp.equals("+")){
                int sum = arr.get(arr.size() -1) + arr.get(arr.size() -2); 
                arr.add(sum);
            }
            else if(temp.matches("[-+]?\\d+")){
                int n = Integer.parseInt(temp);
                arr.add(n);
            }
        }
        int res = 0;
        for(int t2: arr){
            res += t2;
        }
        return res;
    }
}