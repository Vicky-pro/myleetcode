class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whiteBlocks=0;
        int n=blocks.length();
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)== 'W'){
                whiteBlocks++;
            }
        }
        int minimum = whiteBlocks;
        for(int i=1;i<=n-k;i++){
            if(blocks.charAt(i-1) == 'W'){
                whiteBlocks--;
            }
            if(blocks.charAt(i+k-1) == 'W'){
                whiteBlocks++;
            }
            minimum = Math.min(minimum,whiteBlocks);
        }
        return minimum;
    }
}