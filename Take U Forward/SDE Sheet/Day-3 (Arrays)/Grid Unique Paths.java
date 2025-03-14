// Brute Force Solution using Recursion (TLE)
class Solution {
    public int uniquePaths(int m, int n) {
        return countPaths(0, 0, m, n);
    }

    public int countPaths(int i, int j, int m, int n){
        if(i == m || j == n){
            return 0;
        }
        if(i == m - 1 && j == n - 1){
            return 1;
        }
        return countPaths(i + 1, j, m, n) + countPaths(i, j + 1, m, n);
    }
}

// Better Solution using DP
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }
        return countPaths(0, 0, m, n, dp);
    }

    public int countPaths(int i, int j, int m, int n, int[][] dp){
        if(i == m || j == n){
            return 0;
        }
        if(i == m - 1 && j == n - 1){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        return dp[i][j] = countPaths(i + 1, j, m, n, dp) + countPaths(i, j + 1, m, n, dp);
    }
}


// Optimal Solution using Permutation Combination
// nCr ==> n is the total number of moves and r is the of choice for either down or right (nCr == nCn-r)
// so total moves will be count from start to end traversing any 1 path
// so total moves will be m + n - 2
// and then number of bottoms will be m - 1
// so calculate (m+n-2)C(m-1)

class Solution {
    public int uniquePaths(int m, int n) {
        int N = n + m - 2;
        int r = m - 1;

        double res =  1;

        for(int i = 1; i <= r; i++){
            res = res * (N - r + i) / i;
        }

        return (int) res;
    }
}
