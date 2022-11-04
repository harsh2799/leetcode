class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> x = new HashMap<Character, Integer>();
        
        for(int i=0; i<s.length();i++) {
            x.put(s.charAt(i), x.getOrDefault(s.charAt(i), 0)+1);
        }
        
        for(int i=0; i<s.length();i++) {
            if(x.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
        
        
    }
}