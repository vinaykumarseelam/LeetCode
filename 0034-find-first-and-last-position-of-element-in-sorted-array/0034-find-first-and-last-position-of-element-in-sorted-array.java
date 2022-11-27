class Solution {
    
    private int firstbinary(int[] nums,int low, int high,int target){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                if(mid == 0 || nums[mid] > nums[mid - 1]){
                    return mid;
                }
                else{
                    high = mid -1;
                }
            }
            else if(nums[mid] > target){
                 high = mid - 1;
             }
             else{
                 low = mid + 1;
             }
            
            
            
        }
        return -1;
    }
    
    private int secondbinary(int[] nums, int low, int high, int target){
         while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                if(mid == nums.length-1 || nums[mid] < nums[mid + 1]){
                    return mid;
                }
                else{
                    low = mid + 1;
                }
               
            }
             else if(nums[mid] > target){
                 high = mid - 1;
             }
             else{
                 low = mid + 1;
             }
            
            
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
     
        int low = 0;
        int high = nums.length -1;
        if(nums == null || nums.length == 0 ) return new int[]{-1,-1};
        if(nums[0] > target || nums[high] < target) return new int[] {-1,-1};
        int first = firstbinary(nums,low,high,target);
        if(first == -1) return new int [] {-1,-1};
        int second = secondbinary(nums,first,high,target);
         if(second == -1) return new int [] {-1,-1};
        return new int [] {first,second};
    }
}