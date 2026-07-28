class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int row = mat.length;
        for(int i=0;i<row;i++){
            sum += mat[i][i];
            sum += mat[i][row-i-1];
        }
        if(row%2 !=0){
            sum-=mat[row/2][row/2];
        }
        return sum;
    }
}