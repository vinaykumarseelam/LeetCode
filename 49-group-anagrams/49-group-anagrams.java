class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        HashMap<String, List<String>> map = new HashMap<> ();
        
        for(String s : strs){
            char[] CharArr = s.toCharArray();
            Arrays.sort(CharArr);
            String sorted = String.valueOf(CharArr);
            
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        
       
        return new ArrayList<>(map.values());
    }
}  