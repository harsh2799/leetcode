class Solution {
    public int[] countBits(int n) {
        int []x = new int[n+1];
        int offset = 0;
        for(int i=1;i<n+1;i++) {
            if(i < Math.pow(2, offset+1)) {
                x[i] = 1 + x[i - (int)Math.pow(2, offset)];
            }
            else {
                offset++;
                x[i] = 1 + x[i - (int)Math.pow(2, offset)];
            }
            
        }
        return x;
    }
}