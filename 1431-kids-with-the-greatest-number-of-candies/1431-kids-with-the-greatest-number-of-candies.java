class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> bool = new ArrayList<>();
        for(int num: candies){
            max = Math.max(max,num);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                bool.add(true);
            }else{
                bool.add(false);
            }
        }
        return bool;
    }
}