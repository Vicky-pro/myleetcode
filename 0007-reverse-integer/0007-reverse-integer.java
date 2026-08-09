class Solution {
    public int reverse(int x) {
        int num = x;
        if(num<0){
            num = num*(-1);
        }
        int rev = 0;
        while(num>0){
            rev = rev*10 + num%10;
            num /= 10;
        }
        if(rev>=(-2147483648) && rev<=2147483647){
            if(x<=0){
                return rev*(-1);
            }if(x>0){
                return rev;
            }
        }
        return 0;
    }
}