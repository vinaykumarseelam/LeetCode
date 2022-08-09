class Solution {
    public int deleteAndEarn(int[] nums) {
        //null
        
        if(nums == null || nums.length ==0) return 0;
        int max = nums[0];
        
        for(int num : nums){
            max = Math.max(max,num);
        }
        int [] arr = new int[max+1];
        
        for(int num : nums){
            arr[num] += num;
        }
        
        int prev = 0;
        int curr = arr[1];
        for(int i=2 ; i< arr.length; i++)
        {
            int temp = curr;
            curr = Math.max(curr, prev + arr[i]);
            prev = temp;
        }
        return curr;
    }
}