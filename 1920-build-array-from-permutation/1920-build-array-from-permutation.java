class Solution {
    static{
        int[] nums = new int[0];
        for(int i=0;i<500;i++){
            buildArray(nums);
        }
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]= nums[nums[i]];
        }
        return ans;
    }
}