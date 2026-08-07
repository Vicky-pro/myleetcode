class Solution {
    public void solveSudoku(char[][] board) {
        if(solver(board)) return;
    }
    static boolean solver(char[][] board){
        boolean isEmpty=false;
        int row = -1;
        int col = -1;
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                if (board[i][j]=='.'){
                    row=i;
                    col=j;
                    isEmpty = true;
                    break;
                }
            }
            if (isEmpty){
                break;
            }
        }
        if (!isEmpty){
            return true;
        }
        for (char num = '1';num<='9'; num++){
            if (isSafe(board,row,col,num)){
                board[row][col]= num ;
                if (solver(board)){
                    return true;
                }else {
                    board[row][col]='.';
                }
            }
        }
        return false;
    }
    static boolean isSafe(char[][] board,int row,int col,char num){
        for (int i=0;i<board.length;i++){
            if(board[i][col] == num){
                return false;
            }
        }
        for (int i=0;i<board.length;i++){
            if(board[row][i] == num){
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row-row%sqrt;
        int colStart = col-col%sqrt;
        for (int i=rowStart;i<rowStart + sqrt;i++){
            for (int j=colStart;j<colStart + sqrt;j++){
                if (board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}