class Solution {
    public int diagonalSum(int[][] mat) {
        int dSum = 0;
        for(int i=0,j=0;i<mat.length;i++,j++){
            dSum+=mat[i][j];
            mat[i][j]=0;
        }
        for(int i=0,j=mat[0].length-1;j>=0;i++,j--){
            dSum+=mat[i][j];
            mat[i][j]=0;
        }
        return dSum;
    }
}