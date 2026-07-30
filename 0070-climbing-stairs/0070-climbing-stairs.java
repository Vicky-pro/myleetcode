class Solution {
    public int climbStairs(int n) {
        if(n<=2)return n;
        double a= Math.pow(((1+Math.pow(5,0.5))/2),n);
        double b= Math.pow(((1-Math.pow(5,0.5))/2),n);
        double c= (Math.pow(5,0.5)+5)/10;
        double d= (Math.pow(5,0.5)-5)/10;
        return (int)((c*a)-(d*b));
    }
}