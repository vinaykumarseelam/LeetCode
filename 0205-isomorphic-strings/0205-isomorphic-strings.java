class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>();
        HashSet<Character> sSet = new HashSet<>();
        
        for(int i = 0; i<s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            
            if(smap.containsKey(schar)){
                if(smap.get(schar) != tchar) return false;
            }
            else{
                smap.put(schar,tchar);
                if(sSet.contains(tchar)) return false;
                sSet.add(tchar);
            }
            
            
        }
        return true;
    }
}


// 1 Approach - O(n), O(1)

// Read question carefullt
// We have to check in both directoins. So we are maintaining two hahsmaps
// to remove a charcter from string using chatAt with index. Removing each character from two strings at a time and compoaring same timr.
// Time Complexity is O(n). Space O(1).
     
// 2 Approach - O(n), O(1)
     
// Using Ascii code for storing values inside array.

//3 Approach - 

// Using one Hash Map and one Hash Set. In HashMap I can Check whether Key is exist. Set dont allow duplicates. So Set will check if my values have any duplicates exists.