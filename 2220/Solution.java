class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        if (start != goal) {
            while(start > 0 || goal > 0){
                if(((start^goal)&1) == 1) {
                    count++;
                }
                start >>= 1;
                goal >>= 1;    
            }
        }
        return count;
    }
}