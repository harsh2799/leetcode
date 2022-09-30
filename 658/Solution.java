class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int end = arr.length-1;
        List<Integer> ar = new ArrayList<Integer>();
        
        while((end - start) > k-1) {
            if (Math.abs(arr[start] - x) <= Math.abs(arr[end] - x)) {
                end--;
            }
            else {
                start++;
            }
        }
        
        for (int i=0;i<k;i++) {
            ar.add(arr[i+start]);
        }
        
        return ar;
    }
}