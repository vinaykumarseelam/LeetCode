class Solution {
    public int findMin(int[] nums) {
        // Brute Force
//         for(int i = 0; i<nums.length; i++){
//             if(i == nums.length-1) return nums[i];
//             if(nums[i] < nums[nums.length - 1]){
//                 return nums[i];
//             }
           
           
            
//             else if((i > 0 && nums[i] < nums[i - 1] ) && (i == nums.length-1 ||nums[i] < nums[i + 1])){
//                 return nums[i];           
//             }
//         }
//         return -1;
        
        
        
        
        // Binary Search
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[low] <= nums[high]) return nums[low];
            if((mid ==0 || nums[mid] < nums[mid - 1]) && (mid == nums.length -1 || nums[mid] < nums[mid + 1])){
                return nums[mid];
            }
            else if(nums[low] <= nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}