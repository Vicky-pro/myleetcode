class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> up = new ArrayList<>();
        for (int num:nums){up.add(num);}
        permutation(new ArrayList<>(),up,ans);
        return ans;
    }
    public  void permutation(List<Integer> p, List<Integer> up,List<List<Integer>> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        int ch = up.get(0);
        for (int i=0;i<=p.size();i++){
            permutation(insert(p,ch,i),up.subList(1,up.size()),list);
        }
    }
    public  List<Integer> insert(List<Integer> x, int ch, int index) {
        List<Integer> S1 = x.subList(0, index);
        List<Integer> S2 = x.subList(index, x.size());
        List<Integer> ans = new ArrayList<>();
        ans.addAll(S1);
        ans.add(ch);
        ans.addAll(S2);
        return ans;
    }
}