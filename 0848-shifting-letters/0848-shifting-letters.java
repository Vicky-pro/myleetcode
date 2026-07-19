class Solution {
    public  String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb=new StringBuilder();
        long sum = 0;
        for(int num: shifts){
            sum+=num;
        }
        sb.append(Shift(s.charAt(0),sum));
        for(int i=1;i<s.length();i++){
            sum = sum - shifts[i-1];
            sb.append(Shift(s.charAt(i), sum));
        }
        return sb.toString();
    }
    public  char Shift(char c, long num){
        long shift=0;
        if(num>=26){
            shift = num%26;
        }else{
            shift = num;
        }
        shift = shift-96;
        shift += c;
        if(shift>26){
            shift = shift%26;
        }
        shift = shift+96;
        return (char)shift;
    }
}