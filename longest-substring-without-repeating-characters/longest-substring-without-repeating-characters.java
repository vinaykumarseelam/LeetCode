class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashMap<Character,Integer> map = new HashMap<>();
        int start = 0; int length = 0;
        for(int i = 0; i<s.length(); i++){
            char schar = s.charAt(i);
             
            if(map.containsKey(schar)){
                if(start <= map.get(schar)){
                    start = map.get(schar) + 1;
                }
            }
            length = Math.max(length, i - start + 1);
            map.put(schar, i);
        }
        return length;
    }
}