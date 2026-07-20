class Solution {
    public int search(int[] nums, int target) {
    //Arrays.sort(nums); use if array is not sorted
    /*int st,mid,end;
    st=0;end=nums.length-1;
    while (st<=end){
        mid=(st+end)/2;
        if (nums[mid]==target)return mid;
        else if (nums[mid]>target)end=mid-1;
        else if (nums[mid]<target)st=mid+1;
    }
    return -1;
    */
    return bsRecursion(nums,target,0,nums.length-1);
    }
    public int bsRecursion(int[] arr,int target, int s,int e){
        //s and e are arguments required for nxt call
        //base condition
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2; //variable for this call
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return bsRecursion(arr,target,s,m-1);
        }
        return bsRecursion(arr,target,m+1,e);
    }
}