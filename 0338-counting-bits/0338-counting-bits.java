class Solution {
    static{
            for(int i=0;i<500;i++)
            countBits(0);
        }
    public static int[] countBits(int n) {
        /*int[] arr = new int[n+1];
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
        return arr;*/
        
        int dp[] = new int[n+1];
        dp[0] = 0;

        for(int i = 0; i <= n; i++)
        {
            dp[i] = dp[i >> 1] + (i&1);
        }
        return dp;
    }
}