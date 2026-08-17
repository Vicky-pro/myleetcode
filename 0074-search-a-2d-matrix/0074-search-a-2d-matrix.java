class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // int[] nums = Arrays.stream(matrix)
        //         .flatMapToInt(Arrays::stream)
        //         .toArray();
                
        int low =0;
        int high = matrix.length * matrix[0].length -1;
        int cols = matrix[0].length;
        while(low<=high){
            int mid = low + (high-low)/2;
            int row = mid/cols;
            int col = mid%cols;
            if(target==matrix[row][col]) {return true;}
            if(target < matrix[row][col]){
                high = mid -1;
            }
            else{
                low = mid +1;
            }


        }
        return false;


    }
}