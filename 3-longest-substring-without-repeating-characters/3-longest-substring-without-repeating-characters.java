class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int slow = 0; int max = 0;
      for(int fast = 0; fast < s.length(); fast++){
          char c = s.charAt(fast);
          while(set.contains(c)){
              set.remove(s.charAt(slow));
              slow++;
          }
          set.add(c);
           max = Math.max(max, fast - slow + 1);
      }
        return max;
    }
}