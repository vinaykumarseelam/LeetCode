public class Prog_12_Annagrams {
    HashMap<Double, List<String>> map = new HashMap<>();
        
    for(String s : strs){
        double primeProduct = primeProduct(s);
        
        if(!map.containsKey(primeProduct)){
            map.put(primeProduct, new ArrayList<>());
        }
          map.get(primeProduct).add(s);
    }
    return new ArrayList<>(map.values());
    
       }


private double primeProduct(String str){
    double result = 1;
    int [] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
    
    for(int i=0;i<str.length();i++)
    {
        char c = str.charAt(i);
        int prime = primes[c - 'a'];
        result *=prime;
    }
    return result;
}


//         HashMap<String, List<String>> map = new HashMap<>();
        
//         for(String s : strs){
//             char [] charArr = s.toCharArray(); //Spliting String to each char
//             Arrays.sort(charArr);// Sorting each character
//             String sorted = String.valueOf(charArr);// Putting Sorted string into a string
            
//             if(!map.containsKey(sorted)){
//                 map.put(sorted, new ArrayList<>());
//             }
//               map.get(sorted).add(s);
//         }
//         return new ArrayList<>(map.values());
 