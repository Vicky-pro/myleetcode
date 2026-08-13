class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0)return false;
        Stack<Character> chars = new Stack<Character>();
        boolean isMatch;
        for (int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(temp == '(' ||temp == '[' || temp == '{' ){
                chars.push(temp);
            }else {
                if(chars.isEmpty()) return false;
                char a = chars.peek();
                isMatch = match( a, temp);
                if (isMatch){
                    chars.pop();
                }else {
                    return false;
                }
            }
        }
        return chars.isEmpty();
    }
    public boolean match(char a, char b){
        if(a == '(' && b == ')'){
            return true;
        } else if (a == '[' && b == ']') {
            return true;
        } else if (a == '{' && b == '}') {
            return true;
        }else {
            return false;
        }
    }
}