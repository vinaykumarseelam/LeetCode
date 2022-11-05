1st Approach - O(n), O(1), Two HashMaps
​
HashMap<Character,Character> smap = new HashMap<>();
HashMap<Character, Character> tmap = new HashMap<>();
for(int i=0; i<s.length(); i++){
char schar = s.charAt(i);
char tchar = t.charAt(i);
if(smap.containsKey(schar)){
if(smap.get(schar) != tchar) return false;
}
else{
smap.put(schar,tchar);
}
if(tmap.containsKey(tchar)){
if(tmap.get(tchar) != schar) return false;
}
else{
tmap.put(tchar,schar);
}
}
return true;
// 2nd Approach
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