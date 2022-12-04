class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int arr[] = new int [2];
        
        for(int i = 0; i<nums.length ; i++){
            int key = nums[i] - target;
            
            if(!map.containsKey(key)){
                map.put(-nums[i],i);
            }else{
               int key2 = map.get(key);
                arr[0] = i;
                arr[1] = key2;
            }
        }
        return arr;
    }
}