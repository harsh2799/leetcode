class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> x = new TreeSet<>();
        
        for (int i: nums) {
            x.add(i);
        }
        
       int count = 0;
        
        System.out.println(x);
        
        for(int n: x) {
            if(x.size() == 1) {
                return n;
            }
            if(x.size() < 3 && count==1) {
                return n;
            }
            if (count == x.size()-3) {
                return n;
            }
            count++;
        }
        return 0;
    }
}