class Solution {
    public int reachNumber(int target) {
        int tar = Math.abs(target);
        int sum = 0;
        int count = 1;
        while(sum<tar || (Math.abs(sum - tar)%2 != 0)){
            sum += count;
            count++;
        }
        return count-1;
    }
}

