class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int col = n-1;
        int row = 0;

        while(row<m && col>=0){
            int temp = matrix[row][col];

            if(temp == target){
                return true;
            }
            else if(temp <target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}
