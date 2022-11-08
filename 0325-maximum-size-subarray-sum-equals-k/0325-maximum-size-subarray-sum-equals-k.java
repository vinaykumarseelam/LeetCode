class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int rsum =0;
        int Max = 0;
        int dis = 0;
        map.put(0,-1);
        for(int i = 0; i<nums.length; i++){
            rsum = rsum + nums[i];
            dis = rsum - k;
            if(map.containsKey(dis)){
                Max = Math.max(Max, i - map.get(dis));
                if(!map.containsKey(rsum)){
                map.put(rsum,i);    
                }
            }
            else{
                if(!map.containsKey(rsum)){
                map.put(rsum,i);    
                }
                
            }
        }
        return Max;
    }
}