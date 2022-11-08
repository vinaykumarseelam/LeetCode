class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rsum = 0;
        map.put(0,-1);
        int Max = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                rsum++;
            }
            else{
                rsum--;
            }
            if(map.containsKey(rsum)){
              Max = Math.max(Max, i-  map.get(rsum));
            }
            else{
                map.put(rsum, i);
            }
        }
        return Max;
    }
}