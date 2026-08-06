class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate("",n,n,list);
        return list;
    }
    public void generate(String s,int left,int right,List<String> list){

        if(left<=0&&right<=0){
            list.add(s);
            return ;
        }

        if (left>0)generate(s+"(",left-1,right,list);
        if (left<right)generate(s+")",left,right-1,list);
    }
}