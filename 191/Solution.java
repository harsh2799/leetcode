public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int mask = 1;
        for (int i=0; i<32; i++){
            if ((n&mask) != 0) {
                count++;    
            }
            mask <<= 1;
            
        }
        return count;
    }
    
    /*
        SLOW METHOD
    */
    // public int hammingWeight(int n) {
    //     int count = 0;
    //     for (char cs : Integer.toBinaryString(n).toCharArray()) {
    //         if(cs == '1')count++;
    //     }
    //     return count;
    // }
}