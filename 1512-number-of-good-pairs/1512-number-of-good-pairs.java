class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }else{
                    break;
                }
            }    
        }        
        return count;        
    }
}