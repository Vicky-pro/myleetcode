class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list1=new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list(nums,0,list1,list);
        return list1;
    }
    public  void list(int[] nums, int index,List<List<Integer>> list1, List<Integer> list){
        
        if(index>=nums.length){
            return;
        }
        list.add(nums[index]);
        if(!list1.contains(list)){list1.add(new ArrayList(list));}
        list(nums, index+1,list1,new ArrayList(list));
        list.remove(list.size()-1);
        if(!list1.contains(list)){list1.add(new ArrayList(list));}
        list(nums,index+1,list1,new ArrayList(list));
    }
}