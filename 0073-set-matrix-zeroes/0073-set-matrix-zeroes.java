class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    rows[i] = true;
                    cols[j] = true;
                } 
            }
        }
        for(int i=0;i<rows.length;i++){
            if(rows[i]){
                int index = 0;
                while(index<matrix[i].length){
                    matrix[i][index]=0;
                    index++;
                }               
            }
        }
        for(int i=0;i<cols.length;i++){
            if(cols[i]){
                int index = 0;
                while(index<matrix.length){
                    matrix[index][i]=0;
                    index++;
                }               
            }
        }
    }
}