class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;
        while(temp != 0){
            int dig = temp%10;
            sum += dig;
            product *= dig;
            temp /= 10;
        }
        return n%(sum+product) == 0;
    }
}