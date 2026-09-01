class Solution {
    public int findSpecialInteger(int[] arr) {
        int vote=0;
        int count=0;
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                count=0;
            }
            count++;
            
            if(count >= vote){
                ans=arr[i];
                vote=count;
            }
            
        }
        return ans;
    }
}