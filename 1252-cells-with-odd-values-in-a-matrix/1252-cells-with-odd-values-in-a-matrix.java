class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for(int[] arr: indices){
            for(int i=0;i<n;i++){
                matrix[arr[0]][i] = matrix[arr[0]][i]+1;
            }
            for(int i=0;i<m;i++){
                matrix[i][arr[1]] = matrix[i][arr[1]]+1;
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]%2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}