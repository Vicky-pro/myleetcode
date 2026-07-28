class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> list = new ArrayList<>();
        for (int hour=0;hour<12;hour++){
            for (int minute=0;minute<60;minute++){
                int totalBits = Integer.bitCount(hour) + Integer.bitCount(minute);
                if (totalBits == turnedOn){
                    String result = hour + ":" + (minute<10?"0" + minute:minute);
                    list.add(result);
                }
            }
        }
        return list;
    }
}