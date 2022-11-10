class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        //int[] output = new int output[nums.length];
         result[0] = 1;
        int r = 1;
        for(int i = 1; i<nums.length ; i++){
           
             result[i] = nums[i-1] * result[i-1];
        }
        for(int i = nums.length - 2; i>=0 ; i--){
             r = nums[i+1] * r;
            result[i] = r * result[i];
        }
        
        return result;
    }
}