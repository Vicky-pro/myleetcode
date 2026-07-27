class Solution {
    public int findComplement(int num) {
        /*StringBuilder builder = new StringBuilder();
        if(num==0){
            builder.append(0);
        }else{
            while(num>0){
                builder.append(num%2);
                num /= 2;
            }
        }*/
        String x = Integer.toBinaryString(num);
       StringBuilder sb = new StringBuilder();
        for (int i=0;i<x.length();i++){
            if(x.charAt(i)=='1'){
                sb.append('0');
            }else {
                sb.append('1');
            }
        }

        int compliment = Integer.parseInt(sb.toString(),2); 
        return compliment;
        
    }

}