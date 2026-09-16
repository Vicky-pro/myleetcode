class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int max=0;
        List<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            max = Math.max(max, words[i].length());
        }
        int index=0;
        while(index<max){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<words.length;i++){
                if(index < words[i].length()){
                    sb.append(words[i].charAt(index));
                }else{
                    sb.append(' ');
                }
            }
            String x = sb.toString();
            int xindex=0;
            for(int i=x.length()-1;i>0;i--){
                if(x.charAt(i) != ' '){
                    xindex=i;
                    break;
                }
            }
            list.add(x.substring(0,xindex+1));
            index++;
        }
        return list;
    }
}