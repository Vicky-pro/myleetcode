class Solution {
    public int smallestNumber(int n, int t) {
        int ans = n;
        while(true){
            int temp = ans;
            int product = 1;
            while(ans>0){
                product *= ans%10;
                ans /=10;
            }
            if(product % t == 0){
                return temp;
            }
            ans = temp;
            ans++;
        }
    }
}