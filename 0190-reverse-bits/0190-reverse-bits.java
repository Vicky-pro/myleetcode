class Solution {
    
    public static int reverseBits(int n) {
        StringBuilder sb=new StringBuilder();
        if (n == 0) {
            sb.append(0);
        } else {
            while (n > 0) {
                sb.append(n % 2);
                n /= 2;
            }      
        }
        while(sb.length()<32){
            sb.append(0);
        }
        String rev = sb.toString();
        int decimal = Integer.parseInt(rev, 2);
        return decimal;
    }
}