class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        while(0<n){
            int dig=n%10;
            sum+=dig;
            product *= dig;
            n /= 10;
        }
        return product-sum;
    }
}