// Approach
// The expected time complexity is O(log(m*n))
// Which is only possible if we flatten this 2D matrix to 1D matrix of size m*n and then apply binary search
// Now consider we have flattened the matrix.
// Whenever we find a mid element => what will be the actual row and column value
// row = mid / m; col = mid % m. m ==> number of rows.

// Java:
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int left = 0, right = n * m - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int num = matrix[mid / m][mid % m];

            if (num == target)
                return true;

            if (num < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
