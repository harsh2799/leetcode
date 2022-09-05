import java.lang.Math;

class Solution {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int temp = Math.abs(num);
        while(temp > 0) {
            sb.append(temp%7);
            temp = temp/7;
        }
        if(num<0)sb.append("-");
        return sb.reverse().toString();
    }
}