class Solution {
    public boolean subsetsum(int[] a, int sum, int n) {
        // code here
        boolean dp[][] = new boolean[a.length+1][sum+1];
        for(int i=0;i<=a.length;i++){
            for(int j=0;j<=sum;j++){
                if(i==0)
                    dp[i][j] = false;
                if(j==0)
                    dp[i][j] = true;
            }
        }
        for(int i=1;i<a.length+1;i++){
            for(int j=1;j<sum+1;j++){
                if(a[i-1]<=j)
                    dp[i][j]=dp[i-1][j-a[i-1]] || dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[a.length][sum];
    }
    public boolean findPartition(int[] a, int n) {
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += a[i];
        }
        if(sum%2!=0)
            return false;
        else
            return subsetsum(a,sum/2,n);
    }
}