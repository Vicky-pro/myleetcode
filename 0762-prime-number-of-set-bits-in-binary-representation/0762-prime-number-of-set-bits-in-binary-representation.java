class Solution {
    public int countPrimeSetBits(int left, int right) {
        int num=left;
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (isPrime(Integer.bitCount(i))) {
                count++;
            }
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }else {
            for (int i=2;i<=Math.pow(n,0.5);i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}