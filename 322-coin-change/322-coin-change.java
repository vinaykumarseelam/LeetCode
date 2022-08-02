class Solution {
    public int coinChange(int[] coins, int amount) {
        if(coins == null || coins.length == 0 ) return 0;
       // return helper(coins,amount,0,0); 
        int m = coins.length; int n = amount;
        int [][] dp = new int[m+1][n+1];
        dp[0][0] = 0;
        
        //top row
        
        for(int j = 1 ; j<dp[0].length; j++)
        {
            dp[0][j] = amount + 1;
        }
        for(int i = 1 ; i < dp.length ; i++)
        {
            for(int j = 1 ; j<dp[0].length; j++)
            {
                // till amount was not equal to denomination
                
                if(j < coins[i-1])
                {
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j], 1+dp[i][j-coins[i-1]]);
                }
            }
        }
        int result = dp[m][n];
        if(result > amount)  return -1;
        return result;
    }
//     private int helper(int [] coins, int amount, int i, int min)
//     {
//         //base
//         if(amount==0) return min;
//         if(i == coins.length || amount < 0) return -1;
        
//         //logic
//         //case1 Choose
//         int case1 = helper(coins, amount - coins[i],i, min + 1);
        
//         //case2 not choose 
//         int case2 = helper(coins,amount, i+1, min);
//         if(case1 == -1) return case2;
//         if(case2 == -1) return case1;
//         return Math.min(case1,case2);
        
//     }
}