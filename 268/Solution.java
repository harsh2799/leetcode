class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int total = 0;
        for(int i=1;i<=len;i++)sum+=i;
        for(int i: nums) {total += i;}
        return sum-total;
        
    }
}