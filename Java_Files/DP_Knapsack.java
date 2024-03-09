import java.math.*;
class DP_Knapsack
{
    public static void main(String[] args)
    {
        int[] weights = {2, 3, 4, 5};
        int[] values = {1, 2, 5, 6};
        int res = dp(4,8,weights,values);
        System.out.println("The maximum profit you can make is: "+res);
    }
    public static int dp(int N, int W, int[] weights, int[] values)
    {
        int rows = N;
        int cols = W+1;
        int[][] dp_table = new int[N][W+1];
// Fill up the 0 row.
       
for(int i = 0;i<cols;i++)
        {
            if(weights[0]<=i) dp_table[0][i] = values[0];
            else dp_table[0][i] = 0;
        }
// Iterate over rows ans skip 0th row.
        
for(int i = 1;i<rows;i++)
        { 
            // Iterate over cols.
            
            for(int j = 1;j<cols;j++)
            {
                int item = i;
                int bagweight = j;
                // check if item's weight > current max weight.
                
                if(weights[i]>bagweight) 
                {
                    // if yes, take value above.
                    
                    dp_table[i][j] = dp_table[i-1][j];
                }
                    else
                { 
                    // compute value excluding the item
                    // value without item = dp[row-1][col] 
                    
                    int value_without_item = dp_table[i-1][j];
                    // compute value including the item
                    // value with item = val[row]+dp[row-1][col-weight[row]]
                    
                    int value_with_item = values[i]+dp_table[i-1][j-weights[i]];

                    // Take maximum between them
                    
                    dp_table[i][j] = Math.max(value_with_item, value_without_item);
                }
            }
        }

        // return the last item.
        
        return dp_table[rows-1][cols-1];
    }
}