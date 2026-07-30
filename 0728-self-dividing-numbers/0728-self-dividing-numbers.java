class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        boolean isDividing;
        for(int i=left;i<=right;i++){
            int temp=i;
            isDividing =true;
            while(i>0){
                if(i%10 == 0){
                    isDividing = false;
                    break;
                }
               if(temp%(i%10)!=0){
                isDividing = false;
                break;
               }else{
                i /= 10;
               } 
            }
            if(isDividing){
                list.add(temp);
            }
            i = temp;
        }
        return list;
    }
}