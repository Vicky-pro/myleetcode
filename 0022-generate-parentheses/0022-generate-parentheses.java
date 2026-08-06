class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list = generate("",n,n);
        for (String s:list){
            if(!list1.contains(s)){
                list1.add(s);
            }
        }
        return list1;
    }
    public List<String> generate(String s,int left,int right){
        List<String> list = new ArrayList<>();
        if(left<=0&&right<=0){
            list.add(s);
            return list;
        }
        if(left<right && left>=0 && right>0){
            if(left>0)list.addAll(generate(s+"()",left-1,right-1));
            list.addAll( generate(s+")",left,right-1));
            if (left>0)list.addAll( generate(s+"(",left-1,right));
        }
        if (left == right && left>0){
            list.addAll( generate(s+"()",left-1,right-1));
            list.addAll( generate(s+"(",left-1,right));
        }
        return list;
    }
}