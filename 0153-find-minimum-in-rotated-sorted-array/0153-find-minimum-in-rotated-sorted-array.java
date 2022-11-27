class Solution {
    public int findMin(int[] nums) {
        
        for(int i = 0; i<nums.length; i++){
            if(i == nums.length-1) return nums[i];
            if(nums[i] < nums[nums.length - 1]){
                return nums[i];
            }
           
           
            
            else if((i > 0 && nums[i] < nums[i - 1] ) && (i == nums.length-1 ||nums[i] < nums[i + 1])){
                return nums[i];           
            }
        }
        return -1;
    }
}