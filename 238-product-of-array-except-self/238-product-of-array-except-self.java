class Solution {
    public int[] productExceptSelf(int[] nums) {
      
        int n = nums.length; 
        int rp = 1; 
        int [] result = new int [n];
        result[0] = 1;
          if(nums == null || nums.length == 0 ) return result;
        // left
        for(int i = 1; i<n ; i++) 
        {
            rp *= nums[i-1];
            result[i] = rp;
        }
            
        // right
     rp = 1;
        for(int i = n-2 ; i>=0; i--)
        {
            rp *= nums[i + 1];
            result[i] = result[i] * rp;
            
        }
        return result;
    }
}