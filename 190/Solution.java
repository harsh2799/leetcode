public class Solution {
	/*
		OR operation with res to set the current bit position in reverse order.
		Right Shift the value of n by 1 bit.

		eg.
		0000...1001 -> 1001...0000
		Iteration 1:
			(1001 & 0001) -> 0001
			Left shift this value by 31-0 positions.
			right shift the value of n by 1 bit.
			n = 0100
			res = 1000...0000
	 */



    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int i=0; i<32; i++) {
            res |= ((n&1)<<(31-i));
            n >>= 1;
        }
        return res;
    }
}