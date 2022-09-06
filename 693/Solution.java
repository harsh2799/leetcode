class Solution {
    public boolean hasAlternatingBits(int n) {
        int lastBit = n%2;
        n >>= 1;
        
        while (n > 0) {
            if (lastBit == (n&1)) {
                return false;
            }    
            lastBit = (n&1);
            n >>= 1;
        }
        return true;
    }
}