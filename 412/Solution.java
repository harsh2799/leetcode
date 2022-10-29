class Solution {
    public List<String> fizzBuzz(int n) {
       List<String> x = new ArrayList<String>();
       if(n == 0) return x;
       for(int i=1; i<n+1; i++) {
           if (i%15 == 0) {
               x.add("FizzBuzz");
           }
           else if(i%5 == 0) {
               x.add("Buzz");
           }
           else if (i%3 == 0) {
               x.add("Fizz");
           }
           else {
               x.add(i + "");
           }
       } 
        return x;
    }
}