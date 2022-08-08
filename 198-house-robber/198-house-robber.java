class Solution {
    public int rob(int[] nums) {
    if(nums.length == 0 || nums == null) return 0;
        int n = nums.length;
        int [] dp = new int [n];
        dp[0]= nums[0];
        if(n==1) return nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i =2 ; i<n; i++)
        {
            dp[i] = Math.max(dp[i-1],nums[i] + dp[i-2]);
        }
    return dp[n-1];
    }
}