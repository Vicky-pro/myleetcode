class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int totalSum=0;
        for (int mask = 0; mask < (1 << n); mask++) {
            int xorSum=0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    if(xorSum==0){
                        xorSum=nums[i];
                    }
                    else{
                        xorSum ^= nums[i];
                    }
                }
            }
            totalSum += xorSum; 
        }
        return totalSum;
    }
}