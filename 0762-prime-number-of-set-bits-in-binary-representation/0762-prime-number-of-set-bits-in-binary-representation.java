class Solution {
    public int countPrimeSetBits(int left, int right) {
        int num=left;
        int nCount=0;
        while(num<=right){
            int temp=num;
            int count=0;
            while(temp>0){
                count++;
                temp &= (temp-1);
            }
            if(is_Prime(count)){
                nCount++;
            }
            num++;
        }
        return nCount;
    }
    public boolean is_Prime(int n){
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