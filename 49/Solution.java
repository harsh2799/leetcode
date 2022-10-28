class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<String, List<String>>();
        
        List<List<String>> ls = new ArrayList<List<String>>();
        
        for(String str: strs) {
            
            char []c = str.toCharArray();
            Arrays.sort(c);      
            String x = new String(c);
            
            if(hmap.get(x) != null) {
                List<String> y = hmap.get(x); 
                y.add(str);
                hmap.put(x, y);
            } 
            else {
                List<String> y = new ArrayList<String>(); 
                y.add(str);
                hmap.put(x, y);
            }
            
        }
        
        for(String s: hmap.keySet()) {
            ls.add(hmap.get(s));
        }
        
        
        return ls;
    }
}