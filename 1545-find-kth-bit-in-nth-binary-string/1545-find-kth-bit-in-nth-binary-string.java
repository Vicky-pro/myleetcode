class Solution {
    public char findKthBit(int n, int k) {
        if (n == 1) return '0';
        
        int len = (1 << n) - 1;
        int mid = (len + 1) / 2;
        
        if (k == mid) return '1';
        if (k < mid) return findKthBit(n - 1, k);
        
        char c = findKthBit(n - 1, len - k + 1);
        return c == '0' ? '1' : '0';
    }
    //bruteforce
    /*public char findKthBit(int n, int k) {
        String ans = bitConstructor("0",n);
        return ans.charAt(k-1);
    }
    public String bitConstructor(String s,int n){
        if(n==0) return s;
        s += "1"+reverse(invert(s));
        return bitConstructor(s,--n);
    }
    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public String invert(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='0'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return sb.toString();*/
    
}