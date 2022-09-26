HashMap<Integer,Integer> map = new HashMap<>();
map.put(0,1);
int rSum = 0;
int m = 0;
// int[] result = new ArrayList<>();
List<Integer> result = new ArrayList<>();
int j =0;
int var =0;
for(int i = 0; i< nums.length ; i++){
rSum += nums[i];
if(map.containsKey(rSum - target)){
//result[j]= var;
//    j++;
//   result[j] = i;
//  j++;
result.add(var);
result.add(i);
}
m = Math.max(m,rSum);
if(m <= target){
var = i;
}
if(!map.containsKey(rSum)){
map.put(rSum,0);
}
map.put(rSum, map.get(rSum) + 1);
}
return result;