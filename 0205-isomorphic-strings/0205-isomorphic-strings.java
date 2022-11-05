class Solution {
    public boolean isIsomorphic(String s, String t) {
        char smap[] = new char[256];
        char tmap[] = new char[256];
        
        for(int i = 0; i < s.length() ; i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            
            if(smap[schar-' '] != 0){ 
                if(smap[schar - ' '] != tchar) return false;
            }
            else{
                smap[schar - ' '] = tchar;
            }
            
            if(tmap[tchar - ' '] != 0){
                if(tmap[tchar - ' '] != schar) return false;
            }
            else{
                tmap[tchar - ' '] = schar;
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