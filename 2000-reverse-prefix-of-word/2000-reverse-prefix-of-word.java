class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int index=0;
        if(word.indexOf(ch)!=-1){
            while(index<word.length()){
                if(word.charAt(index)==ch){
                    int temp=index;
                    while(temp>=0){
                        sb.append(word.charAt(temp));                  
                        temp--;
                    }
                    index++;
                    break;
                }
                index++;
            }
        }
        while(index<word.length()){
            sb.append(word.charAt(index));
            index++;
        }
        return sb.toString();        
    }
}