class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cons = 0;
        int maxCount = 0;
        for(int x: nums) {
            cons = cons*x+x;
            if (cons > maxCount) {
                maxCount = cons;
            }
        }
        return maxCount;
    }
}