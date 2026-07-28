class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean HAB=true;
        while(HAB && n>0){
            if((n&3) == 2 || (n&3) == 1){
                HAB = true;
                n >>= 1;
            }else{
                HAB=false;
            }
        }
        return HAB;
    }
}