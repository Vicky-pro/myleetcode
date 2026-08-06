class Solution {
    public List<String> generateParenthesis(int n) {
        return generate("",n,n);
    }
    public List<String> generate(String s,int left,int right){
        List<String> list = new ArrayList<>();
        if(left<=0&&right<=0){
            list.add(s);
            return list;
        }
        if (left>0)list.addAll(generate(s+"(",left-1,right));
        if (left<right)list.addAll(generate(s+")",left,right-1));
        return list;
    }
}