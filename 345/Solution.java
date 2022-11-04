class Solution {
    public String reverseVowels(String s) {
        char []x  = s.toCharArray();
        int i = 0;
        int j = x.length - 1;
        String vowels = "aeiouAEIOU";
        while(i<j) {
            if(vowels.contains(x[i]+"") && vowels.contains(x[j]+"")) {
                char temp = x[i];
                x[i] = x[j];
                x[j] = temp;
                i++;
                j--;
            }
            else if (vowels.contains(x[i]+"")) {
                j--;
            }
            else if (vowels.contains(x[j]+"")){
                i++;
            }
            else {
                i++;
                j--;
            }
                        
        }
        return new String(x);
    }
}