class Solution {
    public boolean isHappy(int n) {
        if(n==1)return true;
        List<Integer> list=new ArrayList<>();
        list.add(n);
        while(true){
            int sum=0;
            while(n>0){
                sum += (n%10) * (n%10);
                n=n/10;
            }
            if(sum == 1)return true;
            if(list.contains(sum))return false;
            list.add(sum);            
            n = sum;   
        }
    }
}