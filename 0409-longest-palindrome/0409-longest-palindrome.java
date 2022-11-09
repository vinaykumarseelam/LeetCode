class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0 ; i< s.length(); i++){
            char schar = s.charAt(i);
            
            if(set.contains(schar)){
                set.remove(schar);
                count += 2;
            }
            else
            {
                set.add(schar);
            }
        }
        
        if(! set.isEmpty()){
            count++;
        }
        return count;
    }
}