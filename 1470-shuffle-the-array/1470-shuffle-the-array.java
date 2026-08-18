class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr= new int[nums.length];
        for(int i=0;i<n;i++){
            arr[i+i]=nums[i];
        }
        for(int i=1;i<nums.length;i+=2){
            arr[i] = nums[n++];
        }
        return arr;
    }
}