class Solution {
    public int numberOfSteps(int num) {
        return count(num , 0);
    }
    public int count(int num, int count){
        if(num == 0){
            return count;
        }
        if(num%2 == 0){
            num = num/2;
            count++;
        }
        if(num%2 != 0){
            num = num - 1;
            count++;
        }
        
        return count(num, count);
    }
}