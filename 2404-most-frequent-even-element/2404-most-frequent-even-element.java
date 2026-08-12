class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num: nums){
            if(num%2 == 0){
                map.put(num, map.getOrDefault(num,0)+1);
            }
        }
        int max =0;
        if(map.isEmpty()) return -1;
        int ans=0;
        for(int key: map.keySet()){        
            if(map.get(key)==max){
                ans = Math.min(key,ans);
            }
            if(map.get(key)>max){
                ans = key;
                max = map.get(key);
            }            
        }
        return ans;
    }
}