class Solution {
    public static int binaryGap(int n) {
        int last = -1;
        int index = 0;
        int max = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                if (last != -1) {
                    max = Math.max(max, index - last);
                }
                last = index;
            }

            index++;
            n >>= 1;
        }
        return max;
    }
}