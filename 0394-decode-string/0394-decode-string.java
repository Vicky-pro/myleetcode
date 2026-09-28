class Solution {
    public String decodeString(String s) {
        return decoder(s);
    }
    public static String decoder(String S){
        String ans = "";
        int[] arr;
        for (int i=0;i<S.length();i++){
            if(Character.isDigit(S.charAt(i))){
                arr = numberFinder(i,S);
                i = arr[1];
                int end = indexFinder(i,S);
                ans += stringwriter(arr[0],S.substring(i+1,end));
                i = end;
            }
            else {
                ans += S.charAt(i);
            }
        }
        return ans;
    }
    public static int[] numberFinder(int i,String S){
        int num = 0;
        int[] arr = new int[2];
        while (i<S.length()){
            num = num*10+S.charAt(i)-48;
            i++;
            if(!Character.isDigit(S.charAt(i))){
                break;
            }
        }
        arr[0] = num;
        arr[1] = i;
        return arr;
    }
    public static int indexFinder(int start,String S){
        int open = 0;
        int close = 0;
        while (start<S.length()){
            if(S.charAt(start) == '[') open++;
            if(S.charAt(start) == ']') close++;
            if(open == close) break;
            start++;
        }
        return start;
    }
    public static String stringwriter(int num, String str){
        String ans = "";
        if(str.contains("[") || str.contains("]")){
            str = stringSpliter(str);
        }
        for (int i=0;i<num;i++){
            ans += str;
        }

        return ans;
    }
    public static String stringSpliter(String str){
        String A = "";
        int index =-1;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                A = str.substring(0,i);
                index = i;
                break;
            }
        }

        return A + decoder(str.substring(index));
    }
}