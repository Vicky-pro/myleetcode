class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i=s.length()-1;
        int count=0;
        while(i>=0){
            if(s.charAt(i) == ' '){
                return count;
            }
            count++;
            i--;
        }
        return s.length();
    }
}