class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
       String[] v = s.split(" ");
       // System.out.println(v[1]);
        
        if((v.length > pattern.length()) || (v.length < pattern.length())) return false;
        
        for(int i=0 ; i< pattern.length(); i++){
             
            char pChar = pattern.charAt(i);
            
            String sChar = v[i];
             
            
            if(pMap.containsKey(pChar)){
             System.out.println(pChar);
            System.out.println(sChar);
               if(! pMap.get(pChar).equals(sChar)) return false;
                
            }
            else
            {
                pMap.put(pChar, sChar);
                 
            }
            
            
            if(sMap.containsKey(sChar)){
                   
                if(! sMap.get(sChar).equals(pChar)) return false;
              //  System.out.println(pMap);
              
            }
            else
            {
                sMap.put(sChar, pChar);
            }
        }
        return true;
        
    }
}