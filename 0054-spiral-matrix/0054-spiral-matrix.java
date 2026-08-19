class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
         int r=0; int c=0; int rLim = matrix.length; int cLim=matrix[0].length;
        int rHelper=0; int i=1;
        while (list.size() < matrix.length*matrix[0].length){
            if (list.size()<matrix.length*matrix[0].length)right(r+rHelper,c+rHelper,cLim,matrix,list);
            if (list.size()<matrix.length*matrix[0].length)down(r+i,c+cLim-1,rLim,matrix,list);
            if (list.size()<matrix.length*matrix[0].length)left(r+rLim-1,c+cLim-2,rHelper,matrix,list);
            rHelper++;
            if (list.size()<matrix.length*matrix[0].length)up(r+rLim-2,c+rHelper-1,rHelper,matrix,list);
            rLim--;
            cLim--;
            i++;
        }

        return list;
    }
    public static void right(int r, int c, int lim, int[][] matrix,List<Integer> list){
        while (c<lim){
            list.add(matrix[r][c++]);
        }
    }
    public static void down(int r, int c, int lim, int[][] matrix,List<Integer> list){
        while (r<lim){
            list.add(matrix[r++][c]);
        }
    }
    public static void left(int r, int c, int lim, int[][] matrix,List<Integer> list){
        while (c>=lim){
            list.add(matrix[r][c--]);
        }
    }
    public static void up(int r, int c, int lim, int[][] matrix,List<Integer> list){
        while (r>=lim){
            list.add(matrix[r--][c]);
        }
    }
}