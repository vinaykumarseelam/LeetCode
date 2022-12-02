class Solution {
    public int coinChange(int[] coins, int amount) {
     if(coins == null || coins.length == 0) return 0;
//         return helper(coins,amount,0,0);
//     }
//     private int helper(int[] coins, int amount, int idx, int minCoins){
//         //base
//         if(amount < 0 || idx == coins.length) return -1;
//         if(amount == 0 ) return minCoins;
        
//         //logic
//         //case1
//         int case1 = helper(coins, amount-coins[idx], idx, minCoins+1);
        
//         //Case2
//         int case2 = helper(coins,amount, idx+1, minCoins);
//         if(case1 == -1) return case2;
//         if(case2 == -1) return case1;
//         return Math.min(case1,case2);
        
       int m = coins.length;
        int n = amount;
        
        int dp[][] = new int [m+1][n+1];
        dp[0][0] = 0;
        for(int j = 1; j<=n; j++){
            dp[0][j] = 999999;
        }
        
        for(int i = 1; i<=m ; i++){
            for(int j = 1; j<=n;j++){
                if(j < coins[i-1]){
                    dp[i][j] = dp[i-1][j];
                }
                else
                {
                    dp[i][j] = Math.min(dp[i - 1][j] , 1+dp[i][j - coins[i-1]]);
                }
            }
        }
        if(dp[m][n] >= 999999) return -1;
        return dp[m][n];
    }
}