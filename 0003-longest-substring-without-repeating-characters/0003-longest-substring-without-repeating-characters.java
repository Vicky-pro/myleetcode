class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        int count=1;
        int ans = 0;
        int beginingIndex=0;
        for(int i=1;i<s.length();i++){
            if(s.substring(beginingIndex,i).contains(""+s.charAt(i))){
                for(int j=beginingIndex;j<=i;j++){
                    if(s.charAt(j)==s.charAt(i)){
                        beginingIndex = j+1;
                        ans = Math.max(count,ans);
                        count = i-j;
                        break;
                    }
                }
            }else{
                count++;
            }
        }
        ans = Math.max(count,ans);
        return ans;
    }
}