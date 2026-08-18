class Solution {
    public int[] plusOne(int[] digits) {
        int ans = 1;
        for(int i = digits.length-1;i>=0;i--){
            ans += digits[i];
            if(ans>9){
                digits[i] = ans%10;
                ans/=10;
            }else{
                digits[i] = ans;
                ans/=10;
                break;
            }
        }
        if(ans>0){
            int[] Dig = new int[digits.length+1];
            Dig[0] = ans;
            System.arraycopy(digits, 0, Dig, 1, digits.length);
            return Dig;
        }
        return digits;
    }
}