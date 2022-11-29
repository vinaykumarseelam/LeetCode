class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i<strs.length; i++){
            String str = strs[i];
            char [] s = str.toCharArray();
            Arrays.sort(s);
            String Sorted = String.valueOf(s);
            
            if(!map.containsKey(Sorted)){
                map.put(Sorted, new ArrayList<>());
                map.get(Sorted).add(str);
               
            }
            else{
                 map.get(Sorted).add(str);
            }
            
        }
        return new ArrayList<>(map.values());
    }
}