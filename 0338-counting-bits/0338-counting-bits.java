class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            int temp =i;
            int count=0;
            if(temp==0){
                arr[i] = 0;
            }else{
                while(temp>0){
                    count++;
                    temp = temp - (temp & -temp);
                }
                arr[i]=count;
            }
        }
        return arr;
    }
}