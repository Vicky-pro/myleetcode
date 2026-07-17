class Solution {
    public int lengthOfLastWord(String s) {
        String temp=s.trim();
        String[] arr=s.split(" ");
        return arr[arr.length-1].length();
    }
}