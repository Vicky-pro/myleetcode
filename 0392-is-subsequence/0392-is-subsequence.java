class Solution {
    public boolean isSubsequence(String s, String t) {
        /*for(int i=0;i<s.length();i++){
            if(t.indexOf(s.charAt(i)) == -1){
                return false;
            }
            t = t.substring(t.indexOf(s.charAt(i))+1);
        }
        return true;*/
        int i=0;
        int j=0;
        while(true){
            if(i==s.length()){
                return true;
            }
            if(j==t.length()){
                return false;
            }
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
    }
}