// Learning: 
// Whenever dealing with larger numbers, always use long.
// The value gets compressed


class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long gridSum = 0, gridSquareSum = 0;
        long N = 0; 
        for(int[] arr : grid){
            for(int num : arr){
                gridSum += num;
                gridSquareSum += (long)num * (long)num;
                N++;
            }
        } 
        
        long nSum = (N * (N + 1)) / 2;
        long nSquareSum = (N * (N + 1) * (2 * N + 1)) / 6;

        long val1 = gridSum - nSum;
        long val2 = gridSquareSum - nSquareSum;

        val2 = val2 / val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[]{(int)x, (int)y};
    }
}
