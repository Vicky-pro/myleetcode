class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int number=1;
        int row,col,rowMax=matrix.length-1,colMax=matrix.length-1,rowMin=0,colMin=0;
        while (number <= n*n){
            row=rowMin; col=colMin;
            if(row<=rowMax && col<=colMax){
                while(col<=colMax){
                    matrix[row][col++]=number++;
                }
                col--;
                row++;
            }
            if(row<=rowMax && col == colMax){
                while (row<=rowMax){
                    matrix[row++][col]=number++;
                }
                row--;
            }
            if(row==rowMax && col==colMax){
                col--;
                while (col>=colMin){
                    matrix[row][col--]=number++;
                }
                col++;
            }
            if(col==colMin && row==rowMax){
                row--;
                while (row>rowMin){
                    matrix[row--][col]=number++;
                }
            }
            colMin++;
            rowMin++;
            rowMax--;
            colMax--;
        }
        return matrix;
    }
}