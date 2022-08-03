class Solution {
    public int change(int amount, int[] coins) {
        if(coins == null || coins.length == 0) return 0;
        //return helper(coins,amount,0);
   
        int m = coins.length; int n = amount;
    int [][] dp = new int[m+1][n+1];
    dp[0][0] = 1;
    
    //top row
     
    for(int i =1; i<=m; i++)
    {
        for(int j=0;j<=n;j++)
        {
            if(j<coins[i-1])
            {
                dp[i][j] = dp[i-1][j];
            }
        
        else{
            dp[i][j] = (dp[i-1][j] + dp[i][j - coins[i-1]]);
        }
    }
    }
    
    return dp[m][n];
    
    
    
    
    
    
    
    
    
    
    
//         private int helper(int [] coins, int amount, int i)
//         {
//             //base
//             if(amount==0) return 1;
//             if(i == coins.length || amount < 0) return 0;
            
            
            
//             //logic
//             //case 1 choose
//             int case1 = helper(coins, amount - coins[i], i);
//             //case2 not choose
//             int case2 = helper(coins, amount, i+1 );
//             return case1 + case2;
//         }
       }  
    
}