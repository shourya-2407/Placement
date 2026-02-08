// Instead of iterating from 1 to n, just divide the power by 2 whenever the power is even
// For odd power, multiply by the number

class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        double ans = 1.0;

        if(n < 0){
            nn = nn * (-1);
        }

        while(nn > 0){
            if(nn % 2 == 1){
                ans *= x;
                nn--;
            } else{
                x = x * x;
                nn /= 2;
            }
        }

        if(n < 0){
            ans = (double )1.0 / (double)ans;
        }

        return ans;
    }
}
