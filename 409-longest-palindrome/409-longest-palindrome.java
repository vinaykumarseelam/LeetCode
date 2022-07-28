class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> pSet = new HashSet<>();
        int count =0;
        for(int i=0;i<s.length();i++)
        {
            char sChar = s.charAt(i);
            if(pSet.contains(sChar))
            {
                count+=2;
                pSet.remove(sChar);
            }
            else
            {
                pSet.add(sChar);
            }
        }
        System.out.println(pSet);
        if(pSet.isEmpty())
        {
         return count;   
        }
        else {
         return count +1;   
        }
    }
}