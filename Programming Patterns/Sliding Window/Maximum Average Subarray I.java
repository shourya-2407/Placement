//Brute Force:
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxAvg = Integer.MIN_VALUE;

        for(int i = 0; i <= n - k; i++){
            double sum = 0;
            for(int j = i; j < i + k; j++){
                sum += nums[j];
            }
            double avg = sum/k;
            maxAvg = Math.max(maxAvg, avg);
        }

        return maxAvg;
    }
}

// Optimised approach
