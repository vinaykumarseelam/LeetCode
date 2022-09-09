class Solution {
    public int findKthLargest(int[] nums, int k) {
        HashSet<Integer> hash = new HashSet<> ();
        Arrays.sort(nums);
        int len = nums.length;
        
        return nums[len - k];
        
    }
}