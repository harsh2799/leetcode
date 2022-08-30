import java.lang.Math;

class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i=0; i<columnTitle.length();i++) {
            sum += (Math.pow(26, i)*((int)columnTitle.charAt(columnTitle.length() - i - 1) - (int)'@'));
        }
        return sum;
    }
}