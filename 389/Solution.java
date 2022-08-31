class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        for(char cs : s.toCharArray()) ans ^= cs;
        for(char ct : t.toCharArray()) ans ^= ct;
        return ans;
        
        
        // int i;
        // for(i=0;i<s.length();i++)ans ^= (int)s.charAt(i);
        // for(i=0;i<t.length();i++)ans ^= (int)t.charAt(i);
        // return (char)ans;
    }
}