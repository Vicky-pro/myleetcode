class Solution {
    public void reverseString(char[] s) {
        //swap(s,0,s.length-1);
        //System.out.println(Arrays.toString(s));
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp = s[left];
            s[left++]=s[right];
            s[right--]=temp;
        }
        
    }
    //by recursion
    /*public void swap(char[] s,int left,int right){
        if(left>right){
            return;
        }
        char temp = s[left];
        s[left]=s[right];
        s[right]=temp;
        swap(s,left+1,right-1);
    }*/
}