class Solution {
    public int fib(int n) {
        int i=0,j=1,sum=0;
        if (n==0 || n==1){
            return n;
        }
        for(int x=2;x<n+1;x++){
            sum = i+j;
            i = j;
            j = sum;
        }
        
        return j;
    }
}