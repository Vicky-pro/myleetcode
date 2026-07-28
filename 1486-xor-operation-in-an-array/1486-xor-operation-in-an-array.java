class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        arr[0]=start;
        int xor = start;
        for(int i=1;i<arr.length;i++){
            arr[i]=start+2*i;
            xor ^= arr[i];
        }
        return xor;
    }
}