class Solution {
    public int findSpecialInteger(int[] arr) {
        int size = arr.length/4;
         int n=arr.length;
         HashMap<Integer,Integer> map = new HashMap<>();
         for (int i=0;i<n;i++){
             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
         }

         for (int i: map.keySet()){
             if(map.get(i)>size){
                return i;
             }
         }
        return 0;
    }
}