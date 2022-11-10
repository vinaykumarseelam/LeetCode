class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int rsum =0;
        int Max = 0;
        int dif = 0;
        map.put(0,1);
        int count = 0 ;
        for(int i = 0; i<nums.length; i++){
         rsum = rsum + nums[i];
             dif = rsum - k;
            if(map.containsKey(dif)){
                count++;
                Max = Max + map.get(dif);
                }
            
              if(! map.containsKey(rsum)){
              map.put(rsum,0);
                }
            map.put(rsum,map.get(rsum) + 1);
            }
                
                
           return Max; 
        }
        
    }
