class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> pMap = new HashMap<>();
       String[] v = s.split(" ");
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
                if(pMap.containsValue(v[i])) return false;
                else
                {
                pMap.put(pChar, sChar);    
                }
                
                 
            }
            
            

        }
        return true;
        
    }
}