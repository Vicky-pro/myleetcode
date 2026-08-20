class Solution {
    public boolean isPalindrome(int x) {
        String y= ""+x;
        StringBuilder b=new StringBuilder();
        for (int i=y.length()-1;i>=0;i--){
            b.append(y.charAt(i));
        }
        return y.equals(b.toString());
    }
}