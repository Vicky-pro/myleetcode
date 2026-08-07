class Solution {
    public List<List<String>> solveNQueens(int n) {
        List.clear();
        boolean[][] board = new boolean[n][n];
        queens(board,0);
        return List;
    }
    static String S="";
    static List<String> list = new ArrayList<>();
    static List<List<String>> List = new ArrayList<>();
    static void queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
//            System.out.println();
            List.add(new ArrayList<>(list));
            list.clear();
            return;
        }
        for (int col =0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                queens(board,row+1);
                board[row][col] = false;
            }
        }
        return ;
    }
    static void display(boolean[][] board){
        for(boolean[] row : board){
            for (boolean element : row){
                if (element){
                    S += "Q";
//                    System.out.print("Q ");
                }else {
                    S += ".";
//                    System.out.print("X ");
                }
            }
//            System.out.println();
            list.add(new String(S));
            S = "";
        }
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        for (int i=0;i<row;i++){
            if (board[i][col]){
                return false;
            }
        }
        int maxLeft = Math.min(row,col);
        for (int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight = Math.min(row,board.length-col-1);
        for (int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}