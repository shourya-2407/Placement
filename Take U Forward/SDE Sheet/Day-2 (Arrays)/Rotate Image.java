// Logic: 
// In order to rotate the matrix by 90 deg
// Transpose the matrix. (rows become columns, columns become rows)
// Reverse the row data

// Java:
// Optimal Solution
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //Transpose the Matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        //Reverse the Row
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = tmp;
            }
        }
    }
}
